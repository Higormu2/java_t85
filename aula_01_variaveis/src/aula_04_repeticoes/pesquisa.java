package aula_04_repeticoes;

import java.util.Scanner;

public class pesquisa {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, esporte, totalRes = 0, somaIdade = 0, futebol=0, voleiM18 =0;
		char cont = 'S';
		double mediaIdades = 0.0;
		while(cont == 'S') {
			
			System.out.println("******************************************");
			System.out.println("*** Pesquisa sobre Esportes Favoritos ****");
			System.out.println("******************************************");
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Escolha o seu Esporte favorito: ");
			System.out.println("1 - Futebol");
			System.out.println("2 - Voleibol");
			System.out.println("3 - Basquetebol");
			System.out.println("4 - Outros");
			
			esporte = leia.nextInt();
			
			// Total de pessoas que responderam a pesquisa
			totalRes ++;
			
			//Soma total das idades de todas as pessoas que respoderam a pesquisa
			somaIdade += idade;
			
			//Total de pessoas que gostam de futebol
			if(esporte == 1)
				futebol++;
			//Total de pessoas que gostam de volei e são maiores de 18 anos
			if(idade > 18 && esporte ==2)
				voleiM18 ++;
			
			do {
				System.out.println("Deseja continuar?  (S/N)");
				cont = leia.next().toUpperCase().charAt(0);  //cont é atribuido do leia. O toUpperCase() converte letra minusca para maiuscula e charAt(0) considera a primeira letra
			}while(!(cont == 'S')&&!(cont =='N'));
			
		}

		mediaIdades = somaIdade/totalRes;
		
		System.out.printf("Total de pessoas que gostram de futebol: %d\n", futebol);
		System.out.printf("Total de pessoas que gostram de futebol: %d\n", voleiM18);
		System.out.printf("Média das idades: %.2f\n", mediaIdades);
		
				
		leia.close();
	}
}
