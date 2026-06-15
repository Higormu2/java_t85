package aula_03_Condicionais;

import java.util.Scanner;

public class condicionaisSimples {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numero = leia.nextInt();
		
		if(numero > 10 && numero < 100)
		{
			System.out.println("O Numero digitado é maior do que 10!");
			
		}
		
		System.out.println("****Fim do programa *****");
		
		leia.close();
	}

}
