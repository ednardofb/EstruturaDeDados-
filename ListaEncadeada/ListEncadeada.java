package ListaEncadeada;

import sun.net.www.content.text.Generic;


public class ListEncadeada{

    private Celula primeiro, ultimo, posicao;
    private int testTam = 0;
    private static class Celula{ 
        Object item;


        public Object getItem() {
            return item;
        }

        public void setItem(int item) {
            this.item = item;
        }

        public Celula getProx() {
            return prox;
        }

        public void setProx(Celula prox) {
            this.prox = prox;
        }
        Celula prox; 
    }
     /* *************************************************************INSERIR */
    
    
    /* inserindo no inicio */
    public void inserirInicio(Object z){
        //Célula criada
        Celula aux = new Celula();
        //Célula recebe o objeto
        aux.item = z;
        //Célula já referencia a primeira casa após a cabeça
        aux.prox = this.primeiro.prox;
        //Cabeça passa a referenciar a nova célula
        this.primeiro.prox = aux;
        this.testTam ++;
        //Atualizar o ultimo
        int y =0;
        Celula x = this.primeiro;
        while( y == 0){
            if(x.prox == null){
                this.ultimo = x.prox;
                y = 1;
            }
            x = x.prox;
        }    
    }
    
    /* Inserindo em qualquer posição */
    public void inserirPorPosição(Object x, int ind){
        int y = ind;
        // Caso seja no inicio
        if(y == 1){
            inserirInicio(x);
        }
        else{
            Celula aux = primeiro.prox;
            int cont = 2;
            while(cont != y){
                aux= aux.prox;
                cont++; 
            }
           Celula h = new Celula();
           h.item   = x; 
           h.prox = aux.prox;
           aux.prox= h;
           
        }
    }
    
   /* inserindo no último */
    public void inserir(Object x){      
            this.ultimo.prox = new Celula();
            //Recebe o campo de referencia da proxima celula a seguir; 
            this.ultimo = this.ultimo.prox;
            this.ultimo.item = x;
            this.ultimo.prox = null;
            this.testTam++;
        
    }
  
  
    
    /* ************************************************************** REMOVER */
    
    /* Remove o primeiro */
    public Object removerPrimeiro(){
       if(vazia() == "vazia"){
           System.out.println("Lista vazia !!");
       }
      Celula aux  = this.primeiro;
      Celula x = aux.prox;
      Object item = x.item;
      aux.prox = x.prox;
      this.testTam --;
        System.out.println("Removido : " + item);
      if(aux.prox == null){
          this.ultimo = aux;
      }
      return item;
    } 
    
    /* Retira qualquer objeto */
    public Object retira(Object chave){
        if(this.primeiro == this.ultimo || chave == null){
            return null;
        }
        Celula aux = this.primeiro;
        while(aux.prox!=null && !aux.prox.item.equals(chave)){
            aux = aux.prox;
        }
        if(aux == this.primeiro.prox){
            removerPrimeiro();
        }
        /* Se o objeto é o último, então chamamos o removerUltimo()*/
        if(aux == this.ultimo){
            removerUltimo();
        }
        if(aux.prox == null){
            return null;
        }
        
        Celula x = aux.prox;
        Object item = x.item;
        aux.prox = x.prox;
        this.testTam --;
        return  "Removido: " + item;
    }
    
    /* Remover último */
   public void removerUltimo(){
       Celula aux = primeiro;
       // se o primeiro é o último
       if(aux.prox.prox == null){
           removerPrimeiro();
       }
       else{
            while(aux.prox.prox != null){
                aux = aux.prox;
            }   
            Object item = aux.prox.item;
            this.ultimo = aux;
            aux.prox = null;
            this.testTam --;
            System.out.println("Removido :" + item);
       }
       
        
    }
        
    
   /***************************************************************************/ 
   
  
   
   
    /* vazia*/
    public Object vazia(){
        if (this.primeiro == this.ultimo)
            return "vazia";
       return "";
        
    }
      
    /* tamanho*/
    public void tam(){         
        System.out.println("Tamanho autal : " + this.testTam);
    }  
    
    /* imprimir tudo*/
    public void imprimirTD(){ 
        Celula aux = this.primeiro;
        while(aux.prox != null){
            System.out.print(aux.prox.item);
            System.out.print(" ");
            aux = aux.prox;
        } 
        System.out.println(" ");
    }
    
   
   
        
    /* construtor */
    public ListEncadeada(){
        this.primeiro = new Celula();
        this.posicao = this.primeiro;
        this.ultimo = this.primeiro;
        this.primeiro.prox = null;
    }
    
}