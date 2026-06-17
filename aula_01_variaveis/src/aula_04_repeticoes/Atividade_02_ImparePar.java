package aula_04_repeticoes;

import java.util.Scanner;

public class Atividade_02_ImparePar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, impar = 0, par = 0;
		
		for(int i = 1; i<=10; i++)
		{
			System.out.printf("Digite o %d número: ", i);
			num1 = leia.nextInt();
			
			if(num1%2 == 0)
			{
				par = par + 1;
			}else
			{
				impar = impar + 1;
			}
			
			
		}
		System.out.printf("Total de numeros pares: %d\n",par );
		System.out.printf("Total de numeros impar: %d\n",impar );
			
	}

}
