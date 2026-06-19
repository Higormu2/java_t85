package aula_06_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade_03_CollectionSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, exc;
		Set<Integer>valores = new HashSet<Integer>();
		
		
		for(int i=0; i< 10; i++) 
		{
			System.out.println("Informe um valor: ");
			num = leia.nextInt();
			
			valores.add(num);

		}
		System.out.println("************************************");
		System.out.println("Lista dados do Set: ");
		System.out.println("************************************");
		for(var valor : valores) 
		{
			
			System.out.println(valor);

		}
		System.out.println("************************************");
		System.out.println("Informe o valor que deseja excluir: ");
		exc = leia.nextInt();
		System.out.println("************************************");
		Iterator<Integer>it = valores.iterator();
		
		while(it.hasNext())
		{
			
			int num2 = it.next();
			if(num2 == exc) 
			{
				it.remove();
			}
		}
		
		for(int valor: valores) 
		{
			
			System.out.println(valor);

		}
		
	}

}
