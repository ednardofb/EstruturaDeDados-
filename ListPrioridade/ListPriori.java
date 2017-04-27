/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListPrioridade;

import Fila.FilaEncadeada;
import ListaEncadeada.ListEncadeada;

/**
 *
 * @author Ednardofb
 */
public class ListPriori{
    //Célula da própria classe
    private Celula primeiro, ultimo, posicao;
    private int testTam = 0;
    private static class Celula{ 
        int item;
        public Object getItem() {
            return item;
        }

        public void setItem(int item) {
            this.item = item;
        }

        public Celula getProx() {
            return prox;
        }

        public void setProx(Celula prox) {
            this.prox = prox;
        }
        Celula prox; 
    }
    
    // determinando a localização para armazenar 
    public void inserir(int z){
        if(this.primeiro == this.ultimo){
            inUltimo(z);
        }
        else{
            Celula aux = new Celula();
            aux = this.primeiro;
            int ind = 0;
            while(ind == 0){
                if(aux.prox == null){
                    aux.prox = new Celula();
                    aux.prox.item = z;
                    ind = 1;
                }
                else{
                    if(aux.prox.item < z){
                    Celula a = new Celula();
                    a.prox = aux.prox;
                    a.item = z;
                    aux.prox = a;
                    ind = 1;
                    }
                    else{
                    aux = aux.prox;
                    }
                }
                
            }
        }
    }
    
    //Inserir
    private void inUltimo(int x){      
            this.ultimo.prox = new Celula();
            //Recebe o campo de referencia da proxima celula a seguir; 
            this.ultimo = this.ultimo.prox;
            this.ultimo.item = x;
            this.ultimo.prox = null;
            this.testTam++;
            //System.out.println("tamanho" + this.testTam);
            //System.out.println("item ultimo: " + ultimo.item);
        
    }
    
    // imprimir tudo
    public void imprimirTD(){ 
        Celula aux = this.primeiro;
        while(aux.prox != null){
            System.out.print(aux.prox.item);
            System.out.print(" ");
            aux = aux.prox;
        } 
        System.out.println(" ");
    }
    
    // construtor
    public ListPriori(){
        this.primeiro = new Celula();
        this.posicao = this.primeiro;
        this.ultimo = this.primeiro;
        this.primeiro.prox = null;
    }
}
