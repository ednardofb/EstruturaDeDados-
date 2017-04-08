/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emilson
 */
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
     
    //É criado uma celula nova, na qual o ultimo recebe o Objeto e passa a 
    //referenciar um campo NULL;
    //***OK***
    public void inserir(int x){      
        if(x >=0){
            this.ultimo.prox = new Celula();
            //Recebe o campo de referencia da proxima celula a seguir; 
            this.ultimo = this.ultimo.prox;
            this.ultimo.item = x;
            this.ultimo.prox = null;
            this.testTam++;
        }
        else{
            System.out.println("Objeto invalido");
        }
    }
  
    // Método "inserir2" é usado para inserir células no início
    //***OK***
    public void inserirInicio(int z){
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
    
    //***OK***
    public int tam(){         
        return  this.testTam;
    }  
    
    
    //O metodo a seguir imprime o primeiro elemento
    //***OK***
    public Object primeiro(){
        this.posicao = this.primeiro.prox;
        if(this.posicao == null){
            return "Nao existe primeiro";
        }
        else{
            return this.posicao.item;
        }
    }
    //Esse método tira o objeto por indicação e não por posição
    //***OK***
   
    
    public Object retira(Object chave){
        if(this.primeiro == this.ultimo || chave == null){
            return null;
        }
        Celula aux = this.primeiro;
        while(aux.prox!=null && !aux.prox.item.equals(chave)){
            aux = aux.prox;
        }
        if(aux.prox == null){
            this.ultimo = aux;
        }
        if(aux.prox == null){
            return null;
        }
        
        Celula x = aux.prox;
        Object item = x.item;
        aux.prox = x.prox;
        return  "Removido: " + item;
    }
        
    //***OK***
    public Object vazia(){
        if (this.primeiro == this.ultimo)
            return "vazia";
       return "";
        
    }
    
    //***OK***
    public void imprimirTD(){ 
        Celula aux = this.primeiro;
        while(aux.prox != null){
            System.out.print(aux.prox.item);
            System.out.print(" ");
            aux = aux.prox;
        } 
        System.out.println(" ");
    }
    
    //Método "removerPrimeiro" remove o primeiro elemento da lista, ou seja,
    //a primeria célula após a cabeça
    //***OK***
    public Object removerPrimeiro(){
       if(vazia() == "vazia"){
           System.out.println("Lista vazia !!");
       }
      Celula aux  = this.primeiro;
      Celula x = aux.prox;
      Object item = x.item;
      aux.prox = x.prox;
      if(aux.prox == null){
          this.ultimo = aux;
      }
      return item;
    } 
   
        
    //***OK***
    public ListEncadeada(){
        this.primeiro = new Celula();
        this.posicao = this.primeiro;
        this.ultimo = this.primeiro;
        this.primeiro.prox = null;
    }
    
}