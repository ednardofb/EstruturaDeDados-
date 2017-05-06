/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteArquivo;


import java.io.File;
import java.io.IOException;
import ListPrioridade.ListPriori;
import java.io.BufferedWriter;
import java.io.FileWriter;


/**
 *
 * @author Ednardofb
 */
public class Trabalho {
    
    
    //Método junta os dígitos para formar os inteiros
    public static void magica(String linha, File arq){
        ListPriori a = new ListPriori();
        char ci = linha.charAt(0);
        //fica sendo comparado com o tamanho do ArrayList
        int ind = 0;
        //'x' é o campo que forma o número inteiro
        int x = 0;
        while(ind <= linha.length() ){
            if(ind < linha.length()){
                ci = linha.charAt(ind);   
            }
                //Quando o valor atual de 'ci' for == 32 (space) então o valor de
                //'x' já está completo e pronto para ser enviado para a célula
                if(ci == 32 || ind == linha.length()){
                     
                   a.inserir(x);
                   x =0;
                }
                //Se não, ele vai recebendo os valores
                else{
                    
                    if(x == 0){
                        x = ci - 48;
                        
                    }
                    else{
                        x = (x *10) + (ci - 48);
                    }
                }
                ind++;
        }
        //Depois de colocara os números em cada célula, vamos escrever todos os
        //valores contidos no ArrayList para a sual linha respectiva no arquivo de
        //saída
       try{
        //escrevendo
                FileWriter fw = new FileWriter(arq, true);
                BufferedWriter escrever = new BufferedWriter(fw);
              
               int id =1;
               escrever.write("| ");
               while(id <= a.tam()){
                      escrever.write(a.teste(id)+ " ");
                  if(id == a.tam()){
                      escrever.write("|");
                       escrever.newLine();
                   }
                   id++;
                }
               
                escrever.close();
                fw.close();
        }
        catch(IOException ex){
            
        }
    }
   
    
    
}
