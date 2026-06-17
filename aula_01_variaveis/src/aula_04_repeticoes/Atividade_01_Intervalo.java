        package aula_04_repeticoes;

import java.util.Scanner;

public class Atividade_01_Intervalo {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		// numero 1 precisa ser menor que o numero 2
		// Caso contrario, o sistema vai exibir mensagem inválida 
		
		System.out.println("Informe o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Informe o último número do intervalo: ");
		num2 = leia.nextInt();
		
		
		if(num1<0) 
		{
			if(num1>num2)
			{
				
				System.out.println("Intervalo inválido!");
			}

		}else
		{
			if(num1>num2)
			{
				System.out.println("Intervalo inválido!");
			
			}
		}
		
			
		for(int i= num1; i <= num2; i++)
		{
				if(i%3 == 0 && i % 5 == 0) 
				{
					System.out.println(i + "é multiplo de 3 e 5");
				}

		}
					
		leia.close();	
	}
}
