package aula_02_Operadores;

import java.util.Scanner;

public class Atividade01 {

	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float  salario, abono, novoSal;
		
	System.out.println("Informe o seu salário: ");
	salario = leia.nextFloat();
	
	System.out.println("Informe o Abono: ");
	abono = leia.nextFloat();
	
	System.out.printf("\n %.2f + %.2f. Seu novo salario é: %.2f", salario, abono, novoSal = salario + abono);

	}

}
