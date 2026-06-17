package aula_04_repeticoes;

import java.util.Scanner;

public class tabuadaDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num;
		int cont = 11;
		
		System.out.println("Digite um numero inteiro");
		num = leia.nextInt();
		
		 do{
			System.out.printf("%d x %d = %d\n", num, cont, num * cont);
			cont ++;
		}while(cont <= 10);

	}

}
