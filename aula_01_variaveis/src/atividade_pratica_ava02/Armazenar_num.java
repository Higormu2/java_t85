package atividade_pratica_ava02;

import java.util.ArrayList;
import java.util.Comparator;

public class Armazenar_num {

	public static void main(String[] args) {
		ArrayList<Integer>numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(8);
		numeros.add(3);
		numeros.add(10);
		
		int recebe= 0;
		float media=0f;
		int maior=0;
		
		System.out.println(numeros);
		// Loop para realizar a soma!
		for(int numero : numeros)
		{
			recebe = recebe + numero;
		}
		System.out.println("Soma: " +recebe);
		
		//retiro o valor inteiro da variavel inteiro e jogo para a variavel float, assim quando for pegar a média, o valor apresenta com casas decimais
		media = recebe;
		media = media/5;
		System.out.println("Média: " + media);
		
		//Ordeno os numeros dentro do Array de forma crescente e depois faço ele ficar decrescente.
		//A ideia é que não importa o numero maximo de array, eu sempre vou pegar a posição 0, que é onde o maior numero está!
		numeros.sort(null);
		numeros.sort(Comparator.reverseOrder());
		maior = numeros.get(0);
		System.out.println("Maior: " + maior);
		
		

	}

}
