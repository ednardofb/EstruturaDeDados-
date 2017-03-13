
package Trabalho4;

//Será implementado o conceito de lista circular, pois utilizar modelo de array 
// normal tornará este código ineficiente

public class FilaArray {
    public Object item [];
    public int frente, tras, totalElementos = 0;
    
    //Metodo "enfileira' faz 'tras' ser incrementado;
    //***OK***;
    public void enfileira(Object x){
        //Verifica se a lista está cheia;
        if((this.tras + 1) %this.item.length == this.frente){
            System.out.println("Lista cheia");
            expandir(x);
        }
        //Caso não esteja
        else{
            //'tras' sempre será a próxima casa depois do ultimo elemento;
            this.item[this.tras] = x;
            //'tras' incrementado aqui, sendo modulado caso precise dar uma volta 
            // na lista;
            this.tras = (this.tras + 1) % this.item.length;
            this.totalElementos ++;
        }
        
    }
    
    //Método "desenfileira" faz 'tras' desencrementar, sempre retirando o primeiro
    //que entrou
    //***OK***;
    public Object desenfileira(){
        if(this.frente == this.tras){
            return "Lista vazia";
        }
        //Um 'item' recebe o primeiro elemento da lista
        Object item = this.item[this.frente];
        //'frente' é incrementado
        this.frente = (this.frente +1) % this.item.length;
        this.totalElementos --;
        return item;
    }
    
    //Método "nElementos" retorna o total de elementos
    //***OK***
    public int nElementos(){
        return this.totalElementos;
    }
    
    //Método "tamanho" retorna o tamanho da fila
    //***OK***
    public Object tamanho(){
        return this.item.length;
    }
    
    //Método "expandir"
    //***OK***
    public void expandir(Object x){
        Object aux [] = new Object [this.item.length * 2];
        for(int ind = 0; ind <= this.item.length; ind++){
            aux[ind] = this.item[(this.frente + ind) % this.totalElementos];
        }
        //Atualizando o array
        this.item = aux;
        //Atualizando os ponteiros
        this.frente = 0;
        //Colocando o objeto
        this.item[this.tras] = x;
        //Atualizando o 'totalElementos'
        this.totalElementos++;
        //Atualizando 'tras'
        this.tras = this.totalElementos;    
    }
    
    
    //Construtor 
    //***OK***;
    public FilaArray(int tam){
        this.item = new Object [tam];
        this.frente = 0;
        this.tras = 0;
    }
            
    
}
