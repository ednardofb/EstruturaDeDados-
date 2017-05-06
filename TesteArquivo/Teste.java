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
