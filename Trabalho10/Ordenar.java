 
package Trabalho10;

public class Ordenar {
    
    //***OK***
    public  void insertionSort(int[] vetor) {
        //Número a ser comparado a todos da sua esquerda "chave"       
        int chave;
        //Índices que irão decrementar para se comparar com o "chave"
        int i;
        //O  primeiro for indica o número que será avaliado na rodada atribuindo
        //ao chave
        for (int j = 1; j < vetor.length; j++){
            //key recebe o numero
            chave = vetor[j];
            //Nesse segundo for, é verificado se "i" > 0, pois ele vai decrementando
            // e é verificado se o elemento do indice "i"  > chave.
            for (i = j - 1; (i >= 0) && (vetor[i] > chave); i--){
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = chave;
        }
        //printar o array ajustado
        for(int y =0; y < vetor.length; y++){
            System.err.println(vetor[y]);
        }
    }
    
    //***OK***
    public void selectionSort(int[] array){
        //"fixo" é o índice que representa o número que será comparado com todos 
        //sua direita
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            //"menor" recebe esse INDICE
            int menor = fixo;
            //Nesse for esta sendo feita a comparação para poder ficarmos com o 
            // menor número do array
            for (int i = menor + 1; i < array.length; i++) {
                // "i" se refere ao índice SUPERIOR
                if (array[i] < array[menor]) {
                    //Toda vez que for menor, a variável "menor" receberá o INDICE
                    menor = i;
                }
            }
            //Se "menor" for diferente de fixo aqui se faz a inversão com o índice
            //fixo
            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
            }
        }
        
        //Impressão do vetor ordenado
        for(int y =0; y < array.length; y++){
            System.err.println(array[y]);
        }
    }
    
    //***OK***
    public void shellSort(int vetor[]){
        //É preciso definir uma variável que guardará o tamanho dos saltos para 
        //comparações entre nos números
        int salto = (vetor.length - 1) / 2;
        //"chave" serve para manter o while mais interno em funcionamento
        //"k" se refere ao indice que será comparado com os outros
        int chave, k, aux;
           while(salto != 0){
                do{
                    chave = 1;
                    //No for a seguir, e feita a verificação dos elementos
                    for(k = 0; k < vetor.length - salto; ++k){
                        if(vetor[k] > vetor[k + salto]){
                            aux = vetor[k];
                            vetor[k] = vetor[k + salto];
                            vetor[k + salto] = aux;
                            chave = 0;
                        }
                       
                    }
                }
                while(chave == 0);
                //"salto" é atualizado
                salto = salto / 2;
            }
        //Printando o vetor ordenado
        for(int y =0; y < vetor.length; y++){
            System.err.println(vetor[y]);
        }
    }
    
}
