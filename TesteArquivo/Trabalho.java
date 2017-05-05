/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteArquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import ListPrioridade.ListPriori;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Ednardofb
 */
public class Trabalho {
    public static void main(String args[]){
        ListPriori teste = new ListPriori();
        //Criando o aquivo
        File arquivo = new File("entrada.txt");
        File arq = new File("saida.txt");
        try{
            //Criado
            arquivo.createNewFile();
            arq.createNewFile();
            /*****************************************LER ARQUIVO DE ENTRADA***/
            FileReader ler = new FileReader(arquivo);
            BufferedReader lerb = new BufferedReader(ler);
            //Ler a primeira linha e as próxiams do arquivo de entrada, cada lijnha 
            //é transmitida para um mpétodo que vai quebrar os caracteres em 
            //números inteiros e colocar cara número em uma céluula do ArrayList
            String linha = lerb.readLine();    
            while(linha != null){
                //magia() vai quebrar os dígitos em números inteiros
                //No caso é passado 'arq' como parâmetro para identificar a 
                //escrita para o arquivo de saída
                magica(linha, arq);
                linha = lerb.readLine();
            }
            
            //*****************************************LER ARQUIVO DE SAÍDA****/
            FileReader lerS = new FileReader(arq);
            BufferedReader lerbS = new BufferedReader(lerS);
            //Dois de cada linha ter sido escrita no arquivo de saída, agora vamos
            //imprimir o arquivo de SAÍDA
            String linha1 = lerbS.readLine();
            while(linha1 != null){
                System.out.println(linha1);
                linha1 = lerbS.readLine();
            }
            lerbS.close();

        }
        catch(IOException ex){
            
        }  
    }
    
    //Método junta os dígitos para formar os inteiross
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
                //Quando o valor atual de 'ci' for == 32 (space) então p valor de
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
