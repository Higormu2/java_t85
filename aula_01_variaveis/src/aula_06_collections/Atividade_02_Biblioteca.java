package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Atividade_02_Biblioteca {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Deque<String>livros = new ArrayDeque<String>();
		int opcao;
		char resposta = 'S';
		filas:
			do {
				
				System.out.println("**********************************");
				System.out.println("								  ");
				System.out.println("  1 - Adicionar Livro na pilha    ");
				System.out.println("  2 - Listar todos os Livros	  ");
				System.out.println("  3 - Retirar Livros da pilha	  ");
				System.out.println("  0 - Sair						  ");
				System.out.println("								  ");
				System.out.println("**********************************");
				System.out.println("Entre com a opção desejada:		  ");
				opcao = leia.nextInt();
				leia.nextLine();
				
				switch(opcao) {
				
				case 1:
					do
					{
						if(livros.isEmpty())
						{
							System.out.println("A sua pilha de livros está vazia\n");
						}else
						{
							for(String livro : livros)
							{
								System.out.println(livro);
							}
						}
						
						System.out.println("\nInforme o nome do Livro: ");
						String nome = leia.nextLine();
						livros.add(nome);
						System.out.println("Quer adicionar mais um livro a pilha? (Sim/Não)");
						resposta = leia.nextLine().toUpperCase().charAt(0);

					}while(resposta == 'S');
		
				break;
				case 2:
				{
					if(livros.isEmpty()) {
						System.out.println("A pilha está fazia"); 
					}else
					{
						System.out.println("*****************"); 
						System.out.println("Livros na pilha: "); 
						System.out.println("*****************"); 
						for(String livro:livros)
						{
							System.out.println(livro);
						}
					}
			
					}
				break;
				case 3:
				{
					if(livros.isEmpty()) {
						System.out.println("A pilha está fazia"); 
					}else
					{
						System.out.println("*****************"); 
						System.out.println("Livros na pilha: "); 
						System.out.println("*****************"); 
						for(String livro:livros)
						{
							System.out.println(livro);
						}
					}
					System.out.println("Qual livro deseja retirar da pilha? ");
					String livro = leia.nextLine();
					if(livros.contains(livro) == true)
					{
						livros.remove(livro);
						System.out.println("Item removido com sucesso!");
					}else
					{
						System.out.println("Livro não encontrado");
					}
					
					
					
				}
				break;
				case 0:
				{
					break filas;
				}
				}
				System.out.println("================================");
				System.out.println("Deseja fazer mais uma operação? ");
				resposta = leia.next().toUpperCase().charAt(0);
			}while(resposta == 'S');


	}

}
