
package Trabalho11;

public class OrdenarQMer {
    public static void quickSort(int v[], int esquerda, int direita) {
        //"x" recebe indice 0
	int x = esquerda;
        //"y" recebe o ultimo indice
	int y = direita;
        //"pivo" recebe o elemento do meio
	int pivo = v[(x + y) / 2];
	int troca;
        while (x <= y) {
            //Enquanto "x" não representar um elemento MAIOR que o pivo
            //ele será incrementado
            while (v[x] < pivo) {
		x = x + 1;
            }
            //Enquanto "y" não representar um elementor MENOR que o pivo
            //ele será dcrementado
            while (v[y] > pivo) {
		y = y - 1;
            }
            //Após ter os indices guardados, será feito uma verificação, se o 
            //indice do "x" <= "y" quer dizer que o elemento maior está a esquerda
            //logo se faz a inversão
            if (x <= y) {
		troca = v[x];
		v[x] = v[y];
		v[y] = troca;
		x = x + 1;
		y = y - 1;
            }
        }
        //Quando "esq" > "dir", quer dizer que os referenciadores se cruzaram
	if (y > esquerda)
            quickSort(v, esquerda, y);
        //faz o resto da verificação
	if (x < direita)
            quickSort(v, x, direita);
       
        //Printando o vetor ordenado
        for(int i=0; i < v.length; i++){
                   System.out.println(v[i]);
        }
    }
    
    
}
