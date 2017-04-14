
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
        
        
         testeJogo a = new testeJogo();
         
         int  dig = 1;
         int remover = 1;
         int numero;
         
         //Recebendo dados enquanto git e remover forem diferentes de 0(zero)
         while(dig != 0 && remover != 0){
         Scanner ler = new Scanner(System.in);
         System.out.println("Digite a quantidade de dígitos: ");
         dig = ler.nextInt();
         System.out.println("Digite quantos dígitos devem ser removidos : ");
         remover = ler.nextInt();
         //Verificando se remover é >= que dig
         //eles podem ser iguais sendo os dois maiors que 0 ou
         // os dois sendo 0
         if(remover >= dig){
             //Caso dos dois serem diferentes de 0
             if(remover != 0 && dig !=0){
                 System.out.println("*** A quantidade a ser removida deve ser menor que a quantidade de dígitos");     
             }
             //Se não são iguais maiores que 0, então são iguais  sendo os dois iguais a 0
             else{
                 System.out.println("Finalizado");
             }
             
         }
         //Se  não são iguais, tudo bem .
         else{
               System.out.println("Digite o número completo : ");
               numero = ler.nextInt();
                    //Chamada para o método que vai quebrar o número em dígitos
                   a.teste(dig, remover, numero);
                   System.out.println("****************** NOVA SEÇÃO *********************");
         }
         
         
         }
    }
     
     //teste() vai quebrar o número em dígitos
     public void teste(int dig, int tirar, int z){
            LTespecial b = new LTespecial();
            // 'e' é a variável que vai indicar qual a potência deve ser iniciada
            int e = dig -1;
            //'x' vai ficar pegando sempre o inteiro
            int x;
            //'y' vai ficar pegando o resto da divisão
            int y;
            //Tudo acontece enquando a potência for >= 1 
            while(e >= 1){
                x = (int) (z / pow(10, e));
                y = (int) (z % pow(10, e));
               //Chamada do método inserir() para add cada dígito a uma célula
                b.inserir(x);
                //Aqui temos que considerar que o último resto do while será um inteiro
                //'x' logo recebe ele
                if( e == 1){
                    x = y;
                    b.inserir(x);
                }
                //'z' é atualizado
                z = y;
                e --;
            }
            //Com todo os dígitos armazenados um cada célula, agora é feita a
            //chamada do método que vai selecionar o menor e remover
              b.magicaDaPeste(tirar, dig);
             //Imprimir toda a Lista Encadeada depois do proceso 
              b.imprimirTD(); 
              
           
     }

     
    
}
