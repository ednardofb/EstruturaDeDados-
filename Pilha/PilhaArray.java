
package Pilha;

import Array.Array;
public class PilhaArray {
    //Aqui se passa como parâmetro inicial "10" mas poderia fazer sem parâmetros
    //utilizando um construtor normal.
    Array aux = new Array();
    
    //Chamada do construtor sem parâmetro
    /* Array aux2 = new Array();
    */
    
    //Adicionar
    public void add(Object x){
        aux.insere(x);
    }
    
    //Remover
    public Object remover(){
        return aux.removerUltimo();
    }
    
    //Vazia
    public boolean vazio(){
        return aux.vazio();
    }
    
    //Tamanho
    public int tamanho(){
        return aux.tam();
    }
    
    //Imprime Tudo
    public void imprime(){
        aux.imprimeTd();
    }
    
    //Quantidade Elementos
    public int quantiaElementos(){
        return aux.quantElem();
    }
    
    
    
}
