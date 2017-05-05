/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Emilson
 */
public class TesteArray {
    
    public static void main(String args []){
           Array a = new Array(7);
        a.insere(1);
        a.insere(2);
        a.insere(3);
        a.insere(4);
        a.insere(5);
        a.insere(6);
        
        
        a.imprimeTd();
        a.inserirPorPosicao(9, 1);
        a.imprimeTd();
    }
 
    
    
}
