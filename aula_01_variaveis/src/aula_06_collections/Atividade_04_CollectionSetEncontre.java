package aula_06_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade_04_CollectionSetEncontre {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer>numeros = new HashSet<Integer>();
				
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		
		int receba;
		int nTem= 0;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		receba = leia.nextInt();
		
		if (numeros.contains(receba)) {
		    System.out.printf("O número %d foi encontrado", receba);
		} else {
		    System.out.printf("O número %d não foi encontrado", receba);
		}
		
//		for(int numero: numeros) 
//		{
//			if(numero == receba)
//			{
//				System.out.printf("O número %d foi encontrado",receba);
//				return;
//				
//			}
//
//		}nTem = receba;
//		
//		if(nTem == receba)
//		{
//			System.out.printf("O número %d não foi encontrado",receba);
//		}
		


	}

}
