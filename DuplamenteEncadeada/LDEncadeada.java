
package DuplamenteEncadeada;

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

    /******************************************************INSERIR**************/
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
            }
        }else{
            System.out.println("Posição inválida !! ");
        }
    }
    
    
    
    
    
     public void imprimirTD(){ 
        Celula aux = this.inicio;
        while(aux.prox != null){
            System.out.print(aux.prox.item);
            System.out.print(" ");
            aux = aux.prox;
        } 
        System.out.println(" ");
    }

    
    /* construtor */
    public LDEncadeada(){
        this.inicio= new Celula();
        this.ultimo = this.inicio;
        this.inicio.prox = null;
    }
    
}
