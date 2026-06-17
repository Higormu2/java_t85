package aula_04_repeticoes;

import java.util.Scanner;

public class tabuadaWhile {
	
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int num;
		int cont = 1;
		
		System.out.println("Digite um numero inteiro");
		num = leia.nextInt();
		
		while(cont <= 10) {
			System.out.printf("%d x %d = %d\n", num, cont, num * cont);
			cont ++;
		}
		
	}

}
