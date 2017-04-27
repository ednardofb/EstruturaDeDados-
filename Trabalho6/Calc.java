
package Trabalho6;
import Pilha.PilhaEncadeada;

public class Calc {
    private PilhaEncadeada test = new PilhaEncadeada();
   
    //Método "inverteCalculo" da entrada a uma pilha com a string toda 
    //invertida, e sem seguida trata de inverter para a sequencia normal
    public void inverteCalculo(String normal){
        //Enfileira na primeira pilha 'test'
        for(int ind = 0; ind < normal.length(); ind ++){
            test.add(normal.charAt(ind));
           
        }
        /*
        //Mostrando que ficou inverso na primeira pilha
        test.imprimir();
        //Invertendo para uma segunda pilha, assim ficará no modo normal
         PilhaEncadeada aux = new PilhaEncadeada();
        for(int ind = 0; ind < normal.length(); ind++){
            aux.add(test.remover());
        }

        */
        
        //Mostrando que ficou com a sequência normal na segunda pilha;
        test.imprimir();
    }
    
    
}
