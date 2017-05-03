/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

public class Teste {
    public static void main(String args []){
        FilaEncadeada a = new FilaEncadeada();
        a.add(2);
        a.add(3);
        a.imprimirTodos();
        a.remover();
        a.imprimirTodos();
    }
    
}
