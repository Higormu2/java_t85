package aula_01_variaveis;

import java.util.Scanner;

public class variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 5;
		float num3 , num4;
		String nome;
		char opcao = 'N';
		
		System.out.println("O valor do primeiro numero é :" + num1 + " e o segundo numero é : "+ num2);
		System.out.printf("%d + %d = %d \n",num1,num2, num1 + num2);
		
		System.out.println("Digite o primeiro valor real: ");
		num3 = leia.nextFloat();
		
		System.out.println("Digite o segundo valor real: ");
		num4 = leia.nextFloat();
		
		
		System.out.printf("%.2f x %.2f = %.2f", num3, num4, num3*num4 );
		
		System.out.print("\nDigite seu nome: ");
		leia.skip("\\R?");
		nome = leia.next();
		
		System.out.print("Olá " + nome + ", seja bem=vindo(a)!");

	}

}  
