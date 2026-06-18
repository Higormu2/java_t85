package aula_05_Array;

import java.util.Scanner;

public class Atividade_01_Vetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		int valor;
		
		System.out.println("Informe o numero que você deseja encontrar: ");
		valor = leia.nextInt();
		
		for(int lista =0; lista<10; lista++)
		{

			if(vetor[lista] == valor)
			{
				System.out.printf("O numero %d está localizado na posição: %d",  vetor[lista], lista);
			}
		}
		System.out.printf("O numero %d não foi encontrado!", valor);

	}

}
