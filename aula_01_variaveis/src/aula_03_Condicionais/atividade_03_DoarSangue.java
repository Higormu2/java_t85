package aula_03_Condicionais;

import java.util.Scanner;

public class atividade_03_DoarSangue {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade,valor;
		boolean ap;
		
		System.out.println("Qual o seu nome: ");
		nome = leia.next();
		
		System.out.println("Quantos anos você tem? ");
		idade = leia.nextInt();
		
		System.out.println("É a primeira doação de sangue? \n"
				+ "Digite o numero indicado \n"
				+ "(1) Sim ou (2)Não ");
		
		valor = leia.nextInt();
		ap = (valor<2);
		
					
		if(idade >= 18 && idade <= 59)
		{
			System.out.println(nome + " está apto(a) para doar sangue!");
		}else if(idade >= 60 && idade<= 69 && ap == true)
		{
			System.out.println(nome + " está apto(a) para doar sangue!");
		}else if(idade >= 60 && idade<= 69 && ap == false)
		{
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}else
		{
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}
	}

}
