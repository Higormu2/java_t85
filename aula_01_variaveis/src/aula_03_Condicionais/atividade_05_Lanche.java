package aula_03_Condicionais;

import java.util.Scanner;

public class atividade_05_Lanche {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num, quant, soma;
		
		
		
		System.out.println("********************************************");
		System.out.println("		LANCHES							");
		System.out.println("********************************************");
		System.out.println("											");
		System.out.println("	1 - Cachorro Quente		- R$10.00		");
		System.out.println("	2 - X-Salada			- R$15.00		");
		System.out.println("	3 - X-Bacon			- R$18.00		");
		System.out.println("	4 - Bauru			- R$12.00		");
		System.out.println("	5 - Refrigerante		- R$08.00		");
		System.out.println("	6 - Suco de laranja		- R$13.00		");
		System.out.println("											");
		System.out.println("********************************************");
		
		
		
			
			
			System.out.println("\n--- Escolha seu lanche utilizando o numero: ");
			num = leia.nextInt();
			
			System.out.println("\n--- Quantos desse produto você vai levar? ");
			quant = leia.nextInt();
			
			
			switch(num) {
			case 1:
				System.out.println("Cachorro Quente");
				soma = 10 * quant;
				System.out.println("Valor total: R$	"+ soma);
			break;
			case 2:
				System.out.println("X-Salada");
				soma = 15 * num;
				System.out.println("Valor total: R$	"+ soma);
			break;
			case 3:
				System.out.println("X-Bacon");
				soma = 18 * num;
				System.out.println("Valor total: R$	"+ soma);
			break;
			case 4:
				System.out.println("Bauru");
				soma = 12 * num;
				System.out.println("Valor total: R$	"+ soma);
			break;
			case 5:
				System.out.println("Refrigerante");
				soma = 8 * num;
				System.out.println("Valor total: R$	"+ soma);
			break;
			case 6:
				System.out.println("Suco de Laranja");
				soma = 13 * num;
				System.out.println("Valor total: R$	"+ soma);
			break;
			default:
				System.out.println("Opção inválida!");
			
		}

	}

}
