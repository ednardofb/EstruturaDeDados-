/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListPrioridade;

/**
 *
 * @author Ednardofb
 */
public class Teste {
    
    public static void main(String args[]){
        ListPriori a = new ListPriori();
        a.inserir(6);
        a.inserir(8);
        a.inserir(7);
        a.inserir(5);
        a.inserir(0);
        a.inserir(4);
        
        a.imprimirTD();
    }
    
}
