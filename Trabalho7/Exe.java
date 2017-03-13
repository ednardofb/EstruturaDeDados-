
package Trabalho7;
import java.util.Random;

public class Exe {

    public static void main(String[] args) {
        
        int val[] = new int[1000];
        int cont=0;
        
        Random gerador = new Random();
        
        for(int i=0;i<val.length;i++){
            val[i] = gerador.nextInt(2001) - 1000;  
            //System.out.println(val[i]);
        }
        
        Stopwatch time = new Stopwatch();
        for(int i=0; i<val.length;i++){   
          
            for(int j=i+1;j<val.length;j++){
                for(int k=j+1;k<val.length;k++){                   
                    if(val[i]+val[j]+val[k]==0){
                        cont++;
                    }
                }
            }
           
        }
        
       
     
        System.out.println("Tempo gasto: " + time.elapsedTime());
        System.out.println("Trios que somam 0: "+cont);
        
       
    }
}