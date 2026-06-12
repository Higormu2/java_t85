package aula_02_Operadores;

import java.util.Scanner;

public class Atividade04_Diferença {
	
	public static void main(String[] arg)
	{
		float n1,n2,n3,n4, ent, cal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		n1 = leia.nextFloat();
		
		System.out.println("Informe o segundo numero: ");
		n2 = leia.nextFloat();
		
		System.out.println("Informe o terceiro numero: ");
		n3 = leia.nextFloat();
		
		System.out.println("Informe o quarto numero: ");
		n4 = leia.nextFloat();
		
		System.out.printf("O calculo de (%.2f * %.2f) - (%.2f * %.2f) é: %.2f", n1,n2,n3,n4, cal = (n1*n2) - (n3*n4));
		
		
	}

}
