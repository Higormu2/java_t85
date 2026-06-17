package aula_04_repeticoes;

import java.util.Scanner;

public class tabuadaFOR {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero inteiro: ");
		num = leia.nextInt();
		
		for(int cont = 1; cont <= 10; cont ++)
		{
			System.out.printf("%d x %d = %d\n", num, cont, num * cont);
			
		}
		
		leia.close();
	}

}
