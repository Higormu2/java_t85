package atividade_pratica_ava;

import java.util.Scanner;

public class atividade_03_Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int cod;
		float num1 = 0.0f, num2 = 0.0f, total;
		
				
		System.out.println("********************************************");
		System.out.println("		CALCULADORA					 		");
		System.out.println("********************************************");
		System.out.println("********************************************");
		System.out.println("	Cod | Operador							");
		System.out.println("********************************************");
		System.out.println("	1 - Soma								");
		System.out.println("	2 - Subtração							");
		System.out.println("	3 - Multiplicação						");
		System.out.println("	4 - Divisão								");
		System.out.println("											");
		System.out.println("********************************************");
		
		
			
			
			
			
			System.out.println("\n--- Informe o primeiro numero: ");
			num1 = leia.nextInt();
			
			System.out.println("\n--- Informe o segundo numero: ");
			num2 = leia.nextInt();
			
			System.out.println("\n--- Informe o código da operação: ");
			cod = leia.nextInt();
			
			switch(cod) {
			case 1:
				total = num1 + num2;
				System.out.println(num1 + " + "+ num2+ " = "+ total);
				
			break;
			case 2:
				total = num1 - num2;
				System.out.println(num1 + " - "+ num2+ " = "+ total);
			break;
			case 3:
				total = num1 * num2;
				System.out.println(num1 + " x "+ num2+ " = "+ total);
			break;
			case 4:
				if(num2 != 0) 
				{
					total = num1 / num2;
					System.out.println(num1 + " / "+ num2+ " = "+ total);	
				}
				else
				{
					System.out.println(num2);
				}
				
			break;
			default:
				System.out.println("Opção inválida!");
			
		}

	}

}
