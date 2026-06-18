package aula_05_Array;

import java.util.Scanner;

public class MatrizRegular {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int matrizInt[][] = {
							{10,15,20},
							{45,55,60},
							{75,80,85}
							};
		
		double matrizDouble[][] = new double[2][3];
		
		for (int linha = 0; linha < matrizInt.length; linha ++) {
			for (int coluna = 0; coluna < matrizInt.length; coluna ++) {
				
				System.out.printf("Matriz de inteiros [%d][%d] = %d\n", linha, coluna, matrizInt[linha][coluna]);
				
			}
		}
		
		for (int linha = 0; linha < matrizDouble.length; linha ++) {
			for (int coluna = 0; coluna < matrizDouble[linha].length; coluna ++) {
				
				System.out.printf("Matriz de double [%d][%d] = ", linha, coluna);
				matrizDouble[linha][coluna] = leia.nextDouble();
				
			}
		}
		
		//esse é o for it
		for(double linha[]: matrizDouble) {
			for(double numero : linha) {
				System.out.println(numero);
			}
			
		}
			
		leia.close();
	}

}
