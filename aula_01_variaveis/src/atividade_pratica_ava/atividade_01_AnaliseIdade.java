package atividade_pratica_ava;

import java.util.Scanner;

public class atividade_01_AnaliseIdade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome, recPermi, addAluno;
		int idade, i;
		boolean permi;
		System.out.println("Quantos alunos você quer registrar ?: ");
		i = leia.nextInt();
		
		int j;
		for (j = 0; j < i;) {

			
			System.out.println("Informe seu nome: ");
			nome = leia.next();
			System.out.println("Informe sua idade: ");
			idade = leia.nextInt();
			
			if (idade >= 18) {
				System.out.println("Acesso liberado para " + nome + "\n");
			} else if (idade < 18) {
				System.out.println("Você possui autorização dos responsáveis? \n" + "Sim ou Não");
				recPermi = leia.next();
				permi = (recPermi.equals("Sim"));
				if (permi == true) {
					System.out.println(" Acesso liberado com autorização para " + nome + "\n");

				} else {
					System.out.println("\n Acesso negado para " + nome + "\n");
				}

			}
			System.out.println("Você deseja continuar adicionando aluno? \n" + "Sim ou Não ");
			addAluno = leia.next();

			if (addAluno.equals("Não")) {
				return;
			}
		}
		j++;

	}

}
