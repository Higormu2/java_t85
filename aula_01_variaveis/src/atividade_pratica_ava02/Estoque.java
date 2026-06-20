package atividade_pratica_ava02;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		ArrayList<String> produto = new ArrayList<>();
		ArrayList<Integer> quantidades = new ArrayList<>();

		// Itens iniciais
		produto.add("Mouse");
		quantidades.add(3);

		produto.add("Teclado");
		quantidades.add(2);

		String resposta;

		// Loop para adicionar novos itens
		do {
		    System.out.println("\n--- Itens cadastrados ---");
		    for (int i = 0; i < produto.size(); i++) {
		        System.out.println(produto.get(i) + ": " + quantidades.get(i));
		    }

		    System.out.println("\nDeseja adicionar um novo item? (sim/nao)");
		    resposta = leia.next();

		    if (resposta.equalsIgnoreCase("sim")) {
		        System.out.println("Informe o nome do item: ");
		        String nome = leia.next();

		        System.out.println("Informe a quantidade: ");
		        int quantidade = leia.nextInt();

		        produto.add(nome);
		        quantidades.add(quantidade);
		    }

		} while (resposta.equalsIgnoreCase("sim"));

		// Loop para atualizar itens existentes
		do {
			System.out.println("Deseja atualizar a quantidade de algum item? (sim/nao)");
			resposta = leia.next();

			if (resposta.equalsIgnoreCase("sim")) {
				System.out.println("Qual item deseja atualizar? ");
				String nome = leia.next();

				int indice = produto.indexOf(nome);

				if (indice != -1) {
					System.out.println("Nova quantidade: ");
					int novaQuantidade = leia.nextInt();
					novaQuantidade = novaQuantidade + quantidades.set(indice, novaQuantidade);
					quantidades.set(indice, novaQuantidade);
				} else {
					System.out.println("Item não encontrado!");
				}
			}

		} while (resposta.equalsIgnoreCase("sim"));

		// Exibe o resultado final
		System.out.println("\n--- Estoque atual ---");
		for (int i = 0; i < produto.size(); i++) {
			System.out.println(produto.get(i) + ": " + quantidades.get(i));
		}
	}
}