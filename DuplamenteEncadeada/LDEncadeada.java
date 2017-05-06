
package DuplamenteEncadeada;

import java.util.Scanner;

/**
 *
 * @author Ednardofb
 */
public class LDEncadeada {
    
    private Celula inicio, ultimo;
    private int tam;
    
    public class Celula {
    
    private Object item;
    private Celula prox;
    private Celula ant;

    public Celula getAnt() {
        return ant;
    }

    public void setAnt(Celula ant) {
        this.ant = ant;
    }
    

    public Object getitem() {
        return item;
    }

    public void setitem(Object item) {
        this.item = item;
    }

    public Celula getProx() {
        return prox;
    }

    public void setProx(Celula prox) {
        this.prox = prox;
    }
    }

    /****************************************************<< INSERIR >>*********/
    //Inserir início
    public void inserirInicio(Object x){
        Celula aux = new Celula ();
        aux.item = x;
        //No caso de vazia
        if(this.inicio == null){
            this.inicio.prox = aux;
            this.ultimo = aux;
            aux.ant = this.inicio;
        }else{
         aux.prox = this.inicio.prox;
         this.inicio.prox.ant = aux;
         
         inicio.prox = aux;
         aux.ant = this.inicio;
        }
        tam++;
    }
    
    //Inserir por posição
    public void inserirPorPosicao(Object x, int ind){
        if(0 <= ind && ind <= this.tam){
            if(ind == 0){
                inserirInicio(x);
            }else if(ind == this.tam){
                inserirNoFim(x);
            }else{
                Celula aux = new Celula();
                aux = this.inicio.prox;
                int cont = 2;
                
                while(cont != ind){
                    aux= aux.prox;
                    cont++; 
                }
                Celula h = new Celula();
                h.item = x;
                h.prox = aux.prox;
                aux.prox.ant = h;
                aux.prox = h;
                h.ant = aux;
                this.tam++;
            }
        }else{
            System.out.println("Posição inválida !! ");
        }
    }
    
    //Inserindo no fim
    public void inserirNoFim(Object x){
        //No caso de vazia
        if(this.inicio == null){
            inserirInicio(x);
        }else{
            Celula aux = new Celula();
            aux.item = x;
            
            this.ultimo.prox = aux;
            aux.ant = this.ultimo;
            this.ultimo = aux;
            this.tam++;
        }
    }
   
    //****************************************************<< REMOVER >>********/
    
    //Remover primeiro
    public void removerPrimeiro(){
         if(this.inicio == this.ultimo){
           System.out.println("Lista vazia !!");
       }
        
        Celula x = this.inicio.prox;
        Object item = x.item;
        this.inicio.prox = x.prox;
        x.prox.ant = this.inicio;
        
        this.tam--;
        System.out.println("Removido : " + item);
        
        if(this.inicio.prox == null){
            this.ultimo = this.inicio;
        }
    }
    
    //Remover por posição
    public void removerPorObjeto(int posicao){
        Scanner ler = new Scanner(System.in);
        if(posicao <= 0 || posicao > this.tam){
            System.out.println("Posição deve ser entre 1 e " + this.tam);
            System.out.println("Digite a posição a ser removida: ");
            int x = ler.nextInt();
            System.out.println("**********************************************");
            removerPorObjeto(x);
        }
        else{
            //Caso seja o último
            if(posicao == this.tam){
                //Confimação para remover o objeto
                System.out.println("Tem certeza que deseja REMOVER o item : " + this.ultimo.item + " ? ");
                System.out.println("Sim (s) ou Não (n)");
                String x = ler.nextLine();
                System.out.println("******************************************");
                if(x.equals("s")){
                    removerUltimo();
                }
                //Caso não seja
                else{
                    System.out.println("Digite a posição a ser removida: ");
                     int z = ler.nextInt();
                    System.out.println("**************************************");
                    removerPorObjeto(z);
                }
            }else{
                //Procurando a posição caso não seja o último
                Celula aux = this.inicio;
                int ind = 1;
                while(ind != posicao){
                    aux = aux.prox;
                    ind++;
                }
                //Confimação para remover o objeto
                System.out.println("Tem certeza que deseja REMOVER o item: " + aux.prox.item + " ? ");
                System.out.println("Sim (s) ou Não (n)");
                String x = ler.nextLine();
                System.out.println("******************************************");
                if(x.equals("s")){
                    if(posicao == 1){
                    removerPrimeiro();
                    }
                    else{Object item = aux.prox.item;
                    Celula h = new Celula();
                    h = aux.prox.prox;
                    aux.prox = h;
                    h.ant = aux;
                    this.tam--;
                    System.out.println("Removido: " + item);
                    }
                }
                //Caso não seja 
                else{
                    System.out.println("Digite a posição a ser removida: ");
                    int z = ler.nextInt();
                     System.out.println("*************************************");
                    removerPorObjeto(z);
                }
            }    
        }
    }
    
    //Remover último
    public void removerUltimo(){
        Object item = this.ultimo.item;
        this.ultimo = this.ultimo.ant;
        this.ultimo.prox = null;
        this.tam--;
        System.out.println("Removido : " + item);
    }
    //*****************************************************<< EXTRAS >>********/
    //Imprimir tudo
    public void imprimirTD(){ 
        Celula aux = this.inicio;
        while(aux.prox != null){
            System.out.print(aux.prox.item);
            System.out.print(" ");
            aux = aux.prox;
        } 
        System.out.println(" ");
    }
    
    //Concatenar duas listas 
    public void concatenar(LDEncadeada x1, LDEncadeada x2){
        if(x1 == null && x2 ==null){
            System.out.println("Listas vazias");
        }
        x1.ultimo.prox = x2.inicio.prox;
        x2.inicio.prox.ant = x1.ultimo;
        
        x2.inicio.prox = null;
    }
     
    //Tamanho
    public Object tamanho(){
        return "Tamanho atual : " + this.tam;
    }

    
    /* construtor */
    public LDEncadeada(){
        this.inicio= new Celula();
        this.ultimo = this.inicio;
        this.inicio.prox = null;
    }
    
}
