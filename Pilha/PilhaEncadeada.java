
package Pilha;
import ListaEncadeada.ListEncadeada;

public class PilhaEncadeada {
    
    ListEncadeada aux = new ListEncadeada ();
   /*Adicionando no inicio e removendo do inicio  */ 
    
   //Inserindo no início 
   public void add(int x){
       aux.inserirInicio(x);
   }
   
   //Removendo do início
   public void remover(){
       aux.removerPrimeiro();
   }
    
  //Tamanho
   public void tam (){
       aux.tam();
   }
   
   //Imprimir tudo
   public void imprimir(){
       aux.imprimirTD();
   }
}
