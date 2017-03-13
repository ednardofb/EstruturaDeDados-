
package Trabalho4;
import Trabalho3.ArrayLista;

public class PilhaEncadeada {
    
    ArrayLista aux = new ArrayLista ();
    
    //***OK*** Chamada de método Linha --- 46
    public void empilheirar(Object x){
        aux.inserir2(x);
    }
    
    //***OK*** Chamada de método Linha --- 69
    public int tamanho (){
        return aux.tam();
    }
    
    //***OK*** Chama de método Linha --- 145
    public void imprimetd(){
        aux.imprimirTD();
    }
    
    //***OK*** Chamada de método Linha --- 158
    public Object desempilheirar(){
        return aux.removerPrimeiro();
    }
    
}
