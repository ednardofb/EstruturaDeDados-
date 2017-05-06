/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteArquivo;

import ListPrioridade.ListPriori;
import static TesteArquivo.Trabalho.magica;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Ednardofb
 */
public class Teste {
    
    public static void main(String args[]){
       
        //Criando o aquivo ENTRADA
        File arquivo = new File("entrada.txt");
        //Criando o arquivo SAÍDA 
        File arq = new File("saida.txt");
        try{
            //Criado
            arquivo.createNewFile();
            arq.createNewFile();
            /*****************************************LER ARQUIVO DE ENTRADA***/
            FileReader ler = new FileReader(arquivo);
            BufferedReader lerb = new BufferedReader(ler);
            //Ler a primeira linha e as próximas do arquivo de entrada, cada linha 
            //é transmitida para um método que vai quebrar os caracteres em 
            //números inteiros e colocar cara número em uma célula da ListEncadeada
            String linha = lerb.readLine();    
            while(linha != null){
                //magica() (da classe Trabalho deste pacote) vai quebrar os dígitos em números inteiros
                //No caso é passado 'arq' como parâmetro para identificar a 
                //escrita para o arquivo de saída e a linha atual a ser trabalhada
                magica(linha, arq);
                linha = lerb.readLine();
            }
            //Depois que cada linha do arquivo de ENTRADA foi lida, organizada 
            // e escrita no arquivo de saída, vamos demonstrar o arquivo de saída
            
/*************************************DEPOIS DE ESCREVER TODOS OS RESULTADOS***/
     
            //*****************************************LER ARQUIVO DE SAÍDA****/
            FileReader lerS = new FileReader(arq);
            BufferedReader lerbS = new BufferedReader(lerS);
            //Depois de cada linha ter sido escrita no arquivo de saída, agora vamos
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
}
