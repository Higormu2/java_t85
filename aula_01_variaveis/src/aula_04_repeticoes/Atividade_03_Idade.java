package aula_04_repeticoes;

import java.util.Scanner;

public class Atividade_03_Idade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = 0, menor = 0, maior = 0;
		//boolean negativo = false;
		
		while(idade >= 0)
		{
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade<= 21 && idade>=0)
			{
				menor = menor + 1;
			}
			else if(idade >= 50 && idade <= 130)
			{
				maior = maior + 1;
			}
			
		}
		
		System.out.printf("Total de pessoas menores de 21 anos: %d\n", menor);
		System.out.printf("Total de pessoas maiores de 50 anos: %d\n", maior);
	}

}
