/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emilson
 */
public class teste {
    public static void main(String args []){
        ListEncadeada a = new ListEncadeada();
        a.inserir(1);
        a.inserir(3);
        a.inserir(4);
        a.inserir(5);
        a.imprimirTD();
        a.inserirPorPosição(7, 1);
        a.imprimirTD();
        a.removerPrimeiro();
        a.tam();
    }
}
