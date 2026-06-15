package aula_03_Condicionais;

import java.util.Scanner;

public class atividade_01_Calculo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a,b,c, soma;
		
		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		soma = a+b;
		System.out.println("O valor de A é: " + a + " e o valor B é: " + b + " a soma dos dois valores é de"
				+ ": "+ soma+ " , e o valor de C é: \n"+c);
		
		if(soma > c)
		{
			System.out.println("A soma de A e de B é maio que C");
		}
		else if(soma < c)
		{
			System.out.println("A soma de A e de B é menor que C");
		}
		else
		{
			System.out.println("A soma de A e de B é igual ao valor C");
		}
		
		

	}

}
