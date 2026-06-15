package aula_03_Condicionais;

import java.util.Scanner;

public class atividade_04_TipoAnimal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String tAnimal, animal, come;
		
		System.out.println("Selecione o tipo do animal: \n"
				+ "Vertebrado ou Invertebrado");
		tAnimal = leia.next();

		if(tAnimal.equals("Vertebrado"))
		{
			System.out.println("Selecione a espécie do animal: \n"
					+ "Ave ou Mamifero");
			animal = leia.next();
			
			if(animal.equals("Ave"))
			{
				System.out.println("O que o animal come ?: \n"
						+ "Carnívoro ou Onívoro");
				come = leia.next();
				
				if(come.equals("Carnívoro"))
				{
					System.out.println("Águia");
				}else
				{
					System.out.println("Pomba");
				}
			}else
			{
				System.out.println("O que o animal come ?: \n"
						+ "Onívoro ou Herbívoro");
				come = leia.next();
				
				if(come.equals("Onívoro"))
				{
					System.out.println("Homem");
				}else
				{
					System.out.println("Vaca");
				}
			}
			
		}else
		{
			System.out.println("Selecione a espécie do animal: \n"
					+ "Inseto ou Anelídeo");
			animal = leia.next();
			
			if(animal.equals("Inseto"))
			{
				System.out.println("O que o animal come ?: \n"
						+ "Hematófago ou Herbívoro");
				come = leia.next();
				
				if(come.equals("Hematófago"))
				{
					System.out.println("Pulga");
				}else
				{
					System.out.println("Lagarta");
				}
			}else
			{
				System.out.println("O que o animal come ?: \n"
						+ "Onívoro ou Herbívoro");
				come = leia.next();
				
				if(come.equals("Hematófago"))
				{
					System.out.println("Sanguessuga");
				}else
				{
					System.out.println("Minhoca");
				}
			}
		}
			

		
		
		
		

	}

}
