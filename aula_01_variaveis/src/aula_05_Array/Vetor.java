package aula_05_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// vetor inicializado com dados
		int vetorNum[] = {10,20,70,45,78,100};
		
		//vetor vazio
		float vetorReal[] = new float[5]; 
		
		// Inserir dados no vetor de inteiros
		for(int contador =0; contador < 6; contador ++) {
			System.out.printf("vetorInteiros[%d]= %d\n", contador, vetorNum[contador]);
		}
		
		// Inserir dados no vetor de reais
		for(int contador =0; contador < vetorReal.length; contador ++) {
			System.out.printf("Digite um valor real para a posição %d: \n", contador);
			vetorReal[contador] = leia.nextFloat();
		}
		
		//Ordena o vetor em ordem crescente
		Arrays.sort(vetorReal);
		
		// Lista todos os dados do vetor de reais em ordem decrescente
		for(int contador = vetorReal.length -1; contador >= 0; contador --) {
			System.out.printf("vetorInteiros[%d]= %.2f\n", contador, vetorReal[contador]);
		}
		
		System.out.println("Valor do vetor real: " + vetorReal.length);
		
		System.out.println("Qual é o indice do valor 10 no ventor de reais?  " + Arrays.binarySearch(vetorReal, 10));
		
		
		
		leia.close();
	}

}
