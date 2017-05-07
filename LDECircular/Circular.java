/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LDECircular;

/**
 *
 * @author Ednardofb
 */
public class Circular {
     
    private Celula inicio;
    private int tam = 0;
    
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

     /****************************************************<< INSERIR >>********/
      //Inserir início
    public void inserirInicio(Object x){
       Celula aux = new Celula();
       aux.item = x;
       if(inicio == null){
           this.inicio.item = x;
           //atualizando vetores
           this.inicio.prox = this.inicio;
           this.inicio.ant  = this.inicio;
           this.tam++;
       }
       else{
           if(this.inicio.prox == this.inicio){
               inserirFim(x);
           }
           else{
               this.inicio.prox.ant = aux;
               aux.prox = this.inicio.prox;
               
               this.inicio.prox = aux;
               aux.ant = this.inicio;
               this.tam++;
           }
       }   
    }
    
    //Inserir por posição
    public void inserirPorPosicao(Object z, int posicao){
        if(posicao == 1){
            inserirInicio(z);
        }
        else{
            //Caso seja o último
            if(posicao > this.tam){
                inserirFim(z);
            }
            //Inserindo pela posição
            else{
                Celula aux = new Celula();
                Celula test = new Celula();
                aux = this.inicio.prox;
                int cont = 1;
                while(cont != posicao){
                    aux = aux.prox;
                    cont++;
                }
                test.item = z;
                aux.ant.prox = test;
                test.prox = aux;
               
               test.ant = aux.ant;
               aux.ant = test;
            }
        }
    }
    
    //Inseir fim           
    public void inserirFim(Object z){
        Celula aux = new Celula();
        aux.item = z;
        this.inicio.ant.prox = aux;
        aux.ant = this.inicio.ant;
        
        aux.prox = this.inicio;
        this.inicio.ant = aux;
        this.tam++;
    }
    
    /*********************************************************<< EXTRAS >>*****/
    //Imprimir tudo
    public void imprimirTD(){ 
        Celula aux = this.inicio.prox;
        do{    
            System.out.println(aux.item);
            aux = aux.prox; 
        }while (aux != this.inicio);   
       
    }
    
    //Tamanho
    public void tamanho(){
        System.out.println("Tamanho da sua lista: " + this.tam);
    }
    /* construtor */
    public Circular(){
        this.inicio= new Celula();
        this.inicio.prox = this.inicio;
        this.inicio.ant = this.inicio;
    }
    
}
