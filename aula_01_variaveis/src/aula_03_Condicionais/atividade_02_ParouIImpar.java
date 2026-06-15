package aula_03_Condicionais;

import java.util.Scanner;

public class atividade_02_ParouIImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a,resto;
		String moum; 
		
		System.out.println("Digite um número: ");
		a = leia.nextInt();
				
		resto = a%2;
		
		
		if(a < 0 )
		{
			moum = "negativo";
		}else
			moum = "positivo";
		
		if(resto != 0 )
		{
			System.out.println("O numero "+ a + " é impar e "+ moum);
		}
		
		if(resto == 0 )
		{
			System.out.println("O numero "+ a + " é par e "+ moum);
		}
		

	}

}
