package aula_06_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_02_WrapperI_ArrayL {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer>lista = new ArrayList<Integer>();
		
		lista.add(2);
		lista.add(5);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(7);
		lista.add(8);
		lista.add(10);
		lista.add(6);
		
		int num;
		
			System.out.println("Digite o numero que você deseja encontrar: ");
			num = leia.nextInt();

			
			
			

			if(lista.contains(num))
			{
				System.out.printf("O número %d está localizado na posição: %d\n", num, lista.indexOf(num));
			}else
			{
				System.out.printf("O numero %d não foi encontrado!",num);
			}
			
	}

}
