/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LDECircular;

/**
 *
 * @author Ednardofb
 */
public class Teste {
    public static void main(String args []){
        Circular a = new Circular();
        a.inserirInicio(1);
       a.inserirInicio(2);
       a.inserirInicio(3);
       a.inserirFim(5);
        
       a.inserirPorPosicao(8, 5);
       a.imprimirTD();
    }
    
}
