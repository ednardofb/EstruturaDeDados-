
package Fila;

import ListaEncadeada.ListEncadeada;
public class FilaEncadeada {
    
    ListEncadeada aux = new ListEncadeada();
    
    //Inserindo no último
    public void add(int x){
       aux.inserir(x);
    }
    
    //Remover por inicio
    public void remover(){
        //A lista é verificada se está vazia nesse sentido de chamadas::
        // "desenfileira" >>> "removerPrimeiro" >>> "vazia";
        aux.removerPrimeiro();
    }
    
    //Tamanho
    public void tamanho(){
        System.out.println("aux.tam()"); 
    }    
    
    //Imprimir Todos
    public void imprimirTodos(){
        aux.imprimirTD();
    }
    
    //Vazia
    public void vazia1(){
        aux.vazia();
    }
    
    public FilaEncadeada(){
        ListEncadeada a = new ListEncadeada();
    }
    
    
    
}
