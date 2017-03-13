
package Trabalho4;

import Trabalho2.Array;
public class PilhaArray {
    //Aqui se passa como parâmetro inicial "10" mas poderia fazer sem parâmetros
    //utilizando um construtor normal.
    Array aux = new Array(10);
    
    //Chamada do construtor sem parâmetro
    /* Array aux2 = new Array();
    */
    
    //***OK*** Chamada de método Linha --- 27
    public void empilhar(Object x){
        aux.insere(x);
    }
    
    //***OK*** Chamada de método Linha --- 60
    public Object desempilhar(){
        return aux.removerUltimo();
    }
    
    //Caso queira saber se o arra está vazio sem ter que chamar o método "desepilhar"
    //é só chamar o método "vazio"
    //***OK*** Chama de método Linha --- 114
    public boolean vazio(){
        return aux.vazio();
    }
    
    //***OK*** Chamada de método Linha --- 120
    public int tamanho(){
        return aux.tam();
    }
    
    //***OK***
    public void imprime(){
        aux.imprimeTd();
    }
    
    //***OK*** Chamada de método Linha --- 126
    public int quantiaElementos(){
        return aux.quantElem();
    }
    
    
    
}
