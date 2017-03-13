
package Trabalho4;

import Trabalho3.ArrayLista;
public class FilaEncadeada {
    
    ArrayLista aux = new ArrayLista();
    //***OK*** Chamada de método Linha --- 31
    public void enfileira(Object x){
       aux.inserir(x);
    }
    
    //***OK*** Chamada de método Linha --- 69
    public int tamanho(){
        return aux.tam();
    }    
    
    //***OK*** Chama de método Linha --- 145
    public void imprimirTodos(){
        aux.imprimirTD();
    }
    
    //***OK*** Chama de método Linha --- 158
    public Object desenfileira(){
        //A lista é verificada se está vazia nesse sentido de chamadas::
        // "desenfileira" >>> "removerPrimeiro" >>> "vazia";
        return aux.removerPrimeiro();
    }
    
    
    
}
