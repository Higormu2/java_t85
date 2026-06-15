package atividade_pratica_ava;

import java.util.Scanner;

public class atividade_02_NotaAluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome, addAluno;
		int nota, i, j;
		
		System.out.println("Quantos alunos você quer registrar ?: ");
		i = leia.nextInt();
		
		for(j = 1; j <= i; j++)
		{
			System.out.println("Informe o nome do aluno");
			nome = leia.next();
			
			System.out.println("Informe a nota final do aluno");
			nota = leia.nextInt();
			
			if(nota >= 7 && nota <=10)
			{
				System.out.println("Aluno: "+ nome);
				System.out.println("Aluno aprovado!");
			}
			else if(nota >= 5 && nota <7)
			{
				System.out.println("Aluno: "+ nome);
				System.out.println("Aluno está de recuperação!");
			}
			else if(nota >0 && nota <5)
			{
				System.out.println("Aluno: "+ nome);
				System.out.println("Aluno reprovado!");
			}
			else
			{
				System.out.println("Valor invalido!");

			}
			if(j == i)
			{
				return;
			}
			System.out.println("Você deseja continuar adicionando aluno? \n" + "Sim ou Não ");
			addAluno = leia.next();

			if (addAluno.equals("Não")) {
				return;
			}
		}

	}

}
