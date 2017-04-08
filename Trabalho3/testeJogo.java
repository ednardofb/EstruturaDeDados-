
import static java.lang.Math.pow;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emilson
 */
public class testeJogo {
    
     public static void main(String args []){
         ListEncadeada g = new ListEncadeada ();
         testeJogo a = new testeJogo();
         
         int dig;
         int remover;
         int numero;
         
         Scanner ler = new Scanner(System.in);
         System.out.println("Digite a quantidade de dígitos: ");
         dig = ler.nextInt();
         System.out.println("Digite quantos dígitos devem ser removidos : ");
         remover = ler.nextInt();
         System.out.println("Digite o número completo : ");
         numero = ler.nextInt();
         
         a.teste(dig, remover, numero);
    }
     
     /* O método a seguir faz uma quebra do número */
     public void teste(int dig, int tirar, int z){
         LTespecial b = new LTespecial();
         int e = dig -1;
         int x;
         int y;
         while(e >= 1){
             x = (int) (z / pow(10, e));
             /* System.out.println(">>> X uma célula :: " + x); */
             /* aqui se pega o resto */
             y = (int) (z % pow(10, e));
             /*System.out.println(">>> Y :: " + y); */
             b.inserir(x);
             if( e == 1){
                 x = y;
                 b.inserir(x);
                 /*System.out.println(">>> X uma célula ::" + x);*/
             }
             
             /* quando e = 1 y será passado como parâmentro para uma celula*/
             z = y;
             e --;
         }
        // detectaMenores(tirar);
         // tudo ok 
           b.imprimirTD(); 
           b.teste2(tirar, dig);
           b.imprimirTD(); 
     }

     
    
}
