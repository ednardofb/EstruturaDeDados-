
package Array;


public class Array {
   

    private Object [] item;
    private int primeiro, ultimo, pos, tam, qntElementos = 0;
    
    
    
    //*******************************************************INSERIR************
   
     //Inserir no inicio
    public void inserirInicio(Object x){
        if(this.ultimo >= this.item.length){
            System.out.println("Lista cheia");
        }
        else{
            int i = ultimo;
            for(int ind = this.ultimo - 1; ind >= 0; ind--){
                this.item[i] = this.item[ind];
                i--;
            }
            this.item[0] = x;
            this.ultimo++;
            this.qntElementos++;
        }
        
    }
    
    //Inserir por posição
    public void inserirPorPosicao(Object x, int ind){
        if(this.ultimo >= this.item.length){
            System.out.println("Array Cheio");
        }
            
            for(int i= 0; i <= this.ultimo-1; i++){
               
            }
            
                this.ultimo++;
                this.qntElementos++;
        
    }

    
    // Inseri no final
    public Object insere(Object x){
        //Faz a verificação para caso de lista cheia
        if(this.ultimo >= this.item.length){
            //Informação de lista cheia
            System.out.println("Cheia");
            return "";
        }    
           /* //Novo tamanho
            Object aux [] = new Object[this.item.length + this.item.length/4];
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
            */
        //Insere no final    
        else{
            this.item[this.ultimo] = x;
            this.ultimo = this.ultimo +1;
            this.qntElementos++;
        }
        return "";    
        
    }
    
   
    //**********************************************************REMOVER*********
    //Remover último
 
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
   //Remover por indicação 
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
    
    
 //*****************************************************************************
   
    //vazio() verifica se o array está vazio 
    public boolean vazio(){
        return (this.primeiro == this.ultimo);
    }
    
    //tam() retorna o tamanho do array
    public int tam(){
        return this.tam;
    }
    
    //método() retorna a quantidade de elementos
    public int quantElem(){
        return  this.qntElementos;
    }
    
    //imprimirTd() imprime todos os elementos do array em uso
    public void imprimeTd(){
        for(int i = 0; i < this.qntElementos; i++){
            System.out.print(this.item[i]);
        }
        System.out.println("");
    }
    
    //procura() retorna o elemento procurado
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
    
    //****************************************************CONSTRUTORES**********
    
    
    public Array (int tamanho){
        this.item = new Object [tamanho];
        this.ultimo = this.primeiro;
        this.pos = -1;
        this.tam = tamanho;
    }
    
    //Construtor sem parâmentro iniciando o array
    public Array(){
        this.item = new Object [10];
        this.ultimo = this.primeiro;
        this.pos = -1;
        this.tam = 10;
    }
    
    


    
}
