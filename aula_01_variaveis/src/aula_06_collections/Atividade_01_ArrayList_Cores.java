package aula_06_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_01_ArrayList_Cores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String>cores = new ArrayList<String>();
		
		char confirmar ='S';
	

		
		while(confirmar =='S')
		{
			System.out.println("Informe uma cor? ");
			cores.add(leia.next());
			
			

			System.out.println("Deseja Adicionar mais uma cor ? (S/N) ");
			confirmar = leia.next().toUpperCase().charAt(0);
		}
		System.out.println("Lista de cores: \n");
		for(var cor : cores) 
		{
			System.out.println(cor);
			
		}
		
		System.out.println("Ordenar as cores: \n");
		cores.sort(null);
		for(var cor : cores) 
		{
			System.out.println(cor);
			
		}
		
		
		
	}

}
