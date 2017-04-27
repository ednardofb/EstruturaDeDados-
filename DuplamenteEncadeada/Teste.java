/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplamenteEncadeada;
/**
 *
 * @author tatiane
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LDEncadeada a = new LDEncadeada();
        
        a.inserirNoFim(1);
        a.inserirNoFim(2);
        a.inserirNoFim(3);
        a.inserirInicio(4);
        a.inserirPorPosicao(7, 2);
       
        
        a.imprimirTD();
    }
    
}
