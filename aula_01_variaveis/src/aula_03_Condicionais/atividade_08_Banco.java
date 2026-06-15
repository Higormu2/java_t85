package aula_03_Condicionais;

import java.util.Scanner;

public class atividade_08_Banco {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int cod;
		float saldo = 1000.0f;
		
				
		System.out.println("***************************************");
		System.out.println("		BANCO						   ");
		System.out.println("***************************************");
		System.out.println("***************************************");
		System.out.println("	Cod | Operação					   ");
		System.out.println("***************************************");
		System.out.println("	1  - 	Saldo					   ");
		System.out.println("	2  - 	Saque					   ");
		System.out.println("	3  - 	Depósito				   ");
		System.out.println("									   ");
		System.out.println("***************************************");
		

			System.out.println("\n--- Informe o código da operação: ");
			cod = leia.nextInt();
			
			switch(cod) {
			case 1:
				
				System.out.println("Operação - Saldo \n"
						+ "Saldo: "+ saldo);
				
			break;
			case 2:
				float saque;
				System.out.println("Informe o valor para saque: ");
				saque = leia.nextFloat();
				if(saque <= saldo)
				{
					saldo = saldo - saque;
					System.out.println("Operação - saque \n"
							+ "Novo Saldo: "+ saldo);
				}else
					
				System.out.println("Operação - saque \n"
						+ "Saldo Insuficiente!");
				
			break;
			case 3:
				float novoSaldo;
				System.out.println("Saldo: "+ saldo);
				System.out.println("Informe o valor para depositar: ");
				novoSaldo = leia.nextFloat();
				if(novoSaldo < 1)
				{
					System.out.println("Operação invalida.");
				}else
				{
					saldo = novoSaldo + saldo;
					System.out.println("Operação - deposito \n"
							+ "Novo Saldo: "+ saldo);
				}
				
			break;
			
			default:
				System.out.println("Opção inválida!");
			
		}
	}
}
