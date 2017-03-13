
package Trabalho2;


public class Array {
   

    private Object [] item;
    private int primeiro, ultimo, pos, tam, qntElementos = 0;
    //procura() retorna o elemento procurado
    //***OK*********************************************************************
    public Object procura(int x){
        if(item[x] == null || x < 0){
            if(this.item[x] == null){
                System.out.println("Local azio");
            }else{
                System.out.println("Índice informado é negativo");
            }
        }
        /*
        for(int i = 0; i < item.length; i++){
            if(this.item[i].equals (x)){
                return this.item[i];
            }
        }
*/
        return this.item[x];
    }
    
    
    //Método "insere" vai inserindo no final
    //***OK*********************************************************************
    public void insere(Object x){
        //Faz a verificação para caso de lista cheia
        if(this.ultimo >= this.item.length){
            //Informação de lista cheia
            System.out.println("Lista Cheia, porém a lista será ampliada");
            //Novo tamanho
            Object aux [] = new Object[this.item.length + this.item.length/2];
            for(int i =0; i <= this.item.length; i++){
                aux[i] = this.item[i];
            }
            //Informação de lista ampliada
            System.out.println("Lista ampliada");
            //Atualizando vetores
            this.item = aux;
            aux = null;
            //Colocando o elemento
            this.item[ultimo] = x;
            this.ultimo++;
            this.qntElementos++;
            this.tam = this.item.length;
            System.out.println("Objeto adicionado");
        }
        //Insere no final    
        else{
            this.item[this.ultimo] = x;
            this.ultimo = this.ultimo +1;
            this.qntElementos++;
            
        }
    }        
    
    //remoerUltimo() remove ultimo elemento do array
    //***OK*********************************************************************
    public Object removerUltimo(){
        if(this.ultimo == this.primeiro){
            System.out.println("Array vazio");
        }
        Object aux = this.item[ultimo -1];
        this.ultimo--;
        this.item[ultimo - 1] = null;
        this.qntElementos --;
        return aux;
    }
    //remover() remove por objeto
    //***OK*********************************************************************
    public Object remover(Object x){
        int ind = 0;
        while(ind  < this.ultimo && item[ind].equals(x)){
            ind++;
        }
        if(ind >= this.ultimo){
            return "Item nao encontrado";
        }
        //objeto encontrado
        Object y = this.item[ind];
        this.ultimo = ultimo - 1;
        //realocando os objetos no array
        for(int i = ind; i < this.ultimo; i ++ ){
            this.item[i] = this.item[i++];
        }
        //Ajuste do array, deixando 2 espaços de sobra caso último seja
        // menor ou igual que a metade do array
        if(this.ultimo <= (this.tam/2)){
            Object aux [] = new Object[ultimo + tam/4];
            //transferindo para o novo array
            for(int i =0; i <= aux.length; i++){
                aux[i] = this.item[i];
                
            }
            //array de uso sendo atualizado
            this.item = aux;
            aux = null;
            return "Removido: " + x;
        }
        return "Removido: " + x;
    }
 
    //vazio() verifica se o array está vazio 
    //***OK*********************************************************************
    public boolean vazio(){
        return (this.primeiro == this.ultimo);
    }
    
    //tam() retorna o tamanho do array
    //***OK*********************************************************************
    public int tam(){
        return this.tam;
    }
    
    //método() retorna a quantidade de elementos
    //***OK*********************************************************************
    public int quantElem(){
        return  this.qntElementos;
    }
    //imprimirTd() imprime todos os elementos do array em uso
    //***OK*********************************************************************
    public void imprimeTd(){
        for(int i = 0; i < this.item.length; i++){
            System.out.println(this.item[i]);
        }
    }
    
    
    //CONSTRUTORES==============================================================
    
    //***OK*********************************************************************
    public Array (int tamanho){
        this.item = new Object [tamanho];
        this.ultimo = this.primeiro;
        this.pos = -1;
        this.tam = tamanho;
    }
    
    //Construtor sem parâmentro iniciando o array
    //***OK*********************************************************************
    public Array(){
        this.item = new Object [10];
        this.ultimo = this.primeiro;
        this.pos = -1;
        this.tam = 10;
    }
    
    


    
}
