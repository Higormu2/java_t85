package atividade_pratica_ava02;

import java.util.Scanner;

public class Cadastro_Aluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String cadastro[][] = new String[3][3];
		int idade[] = new int[3];
		float notaFinal[] = new float[3];
		float media[] = new float[3];

		for (int linha = 0; linha < cadastro.length; linha++) {
			for (int coluna = 0; coluna < cadastro[linha].length; coluna++) {

				if (coluna == 0) {
					System.out.println("Informe o nome do Aluno: ");
					cadastro[linha][coluna] = leia.next();

				} else if (coluna == 1) {
					System.out.printf("Informe a idade do %s: ", cadastro[linha][coluna - 1]);
					cadastro[linha][coluna] = leia.next();
					idade[linha] = Integer.parseInt(cadastro[linha][coluna]);

				} else {
					System.out.println("Informe a nota final do aluno: ");
					cadastro[linha][coluna] = leia.next();
					notaFinal[linha] = Float.parseFloat(cadastro[linha][coluna].replace(",", "."));
				}
			}
			media[linha] = notaFinal[linha]; // só existe uma nota por aluno
		}

		System.out.println("\n**********************************************");
		System.out.println("			Cadastro de Alunos					");
		System.out.println("************************************************");
		System.out.printf("%n%-15s%-10s%-10s%-10s%n",
				"Nome", "Idade", "Nota Final", "Média geral");

		for (int linha = 0; linha < cadastro.length; linha++) {
			System.out.printf("%-15s", cadastro[linha][0]);
			System.out.printf("%-10d", idade[linha]);
			System.out.printf("%-10.2f", notaFinal[linha]);
			System.out.printf("%-10.2f%n", media[linha]);
		}
	}
}