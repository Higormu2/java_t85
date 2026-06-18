package aula_05_Array;

import java.util.Scanner;

public class Atividade_02_Vetor_ImpouPar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor;
		int vetor[] = new int[10];
		int resto =0;
		int par[] = new int[5];
		int impar[] = new int[10];
		int j =0;
		double resto2  = 0;
		
		
//===================================================Att1
		for(int i =0 ;i<10; i++) {
			
			System.out.println("Informe um numero inteiro: ");
			vetor[i] = leia.nextInt();
			
		}
		System.out.println("Elementos nos índices ímpares:");
		for(int i =1 ;i<10; i+=2) {
			
			
			System.out.print(vetor[i]+" ");

		}System.out.print("\n");
		
		
//===================================================Att2			
		
		for(int i =0 ;i<10; i++) {
			
			int resto1 = vetor[i] %2;
			if(resto1 == 0) {
				
				
				par[j] = vetor[i];
				j++;

			}

		}System.out.println("Elementos pares: ");
		for(int k = 0; k<j; k++) {
			System.out.print(par[k]+" ");
		}System.out.print("\n");
		
//===================================================Att3		
		int i;
		for( i=0 ;i<10; i++) {
			
			resto = resto + vetor[i] ;

		}System.out.println("Soma: " + resto);
		
//===================================================Att4			
		int k;
		for( k=0 ;k<10; k++) {
			
		resto2 = resto2 + vetor[k] ;
			

		}
		resto2 = resto2/10;
		System.out.println("Média: " + resto2);

	}

}
