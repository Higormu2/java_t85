package aula_02_Operadores;

import java.util.Scanner;

public class Atividade03_AddNoturno {
	
	public static void main(String[] arg)
	{
		float salBruto, addNoturno, hrExtra, desc, salLiquido;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o Salário Bruto: ");
		salBruto = leia.nextFloat();
		
		System.out.println("Informe o Adicional Noturno: ");
		addNoturno = leia.nextFloat();
		
		System.out.println("Informe as Horas extras:  ");
		hrExtra = leia.nextFloat();
		
		System.out.println("Informe os Descontos: ");
		desc = leia.nextFloat();
		
		System.out.printf("O Salário líquido é de: %.2f", salLiquido = salBruto + addNoturno + (hrExtra *5) - desc);
		
	}

}
