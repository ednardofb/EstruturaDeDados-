
package Trabalho3;

public class ArrayLista {

    private Celula primeiro, ultimo, posicao;
    private int testTam = 0;
    private static class Celula{ Object item;

        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
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
    public void inserir(Object x){      
        if(x != null){
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
    public void inserir2(Object z){
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
    
    //Metodo a seguir imprimir, verifica se a lista é vazia primeiramente, caso 
    //Nao seja, é feito a procura pelo objeto, e logo em seguida imprimido
    //***OK***
    public Object imprimirElem(Object obj){         
        if(this.primeiro.prox == null || obj == null){
            return "Lista vazia ou objeto null";
        }
        if(this.primeiro.item == null){
            Celula aux = this.primeiro;
            while(aux.prox != null){
                if(aux.prox.item.equals(obj)){
                    return "Elemento: " +  aux.prox.item;
                }
                aux = aux.prox;
            }
        }
        else{
            Celula aux2 = this.primeiro;
            while(aux2 != null){
                if(aux2.item.equals(obj)){
                    return "Elemento: " +  aux2.item;
                }
                aux2 = aux2.prox;
            }
            
        }
        return "Objeto nao encontrado";
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
    public ArrayLista(){
        this.primeiro = new Celula();
        this.posicao = this.primeiro;
        this.ultimo = this.primeiro;
        this.primeiro.prox = null;
    }
    
}


