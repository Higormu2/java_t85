package aula_03_Condicionais;

import java.util.Scanner;

public class atividade_06_Funcionario {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome, cargo;
		int codigo;
		float sal = 0.0f, novoSalario = 0.0f, reajuste;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("********************************************");
		System.out.println("		TABELA DE AJUSTE DE SALARIO			");
		System.out.println("********************************************");
		System.out.println("********************************************");
		System.out.println("	Cod | Cargo		| Reajuste			");
		System.out.println("********************************************");
		System.out.println("	1 - Gerente		- 10%				");
		System.out.println("	2 - Vendedor		- 7%				");
		System.out.println("	3 - Supervisor		- 9%				");
		System.out.println("	4 - Motorista		- 6%				");
		System.out.println("	5 - Estoquista		- 5%				");
		System.out.println("	6 - Técnico de TI	- 8%				");
		System.out.println("											");
		System.out.println("********************************************");
		
		
			
			
			System.out.println("\n--- Qual é o seu código de colaborador: ");
			codigo = leia.nextInt();
			
			System.out.println("\n--- Informe seu salário: ");
			sal = leia.nextInt();
			
			switch(codigo) {
			case 1:
				cargo = "Gerente";
				reajuste = 0.10f;
				novoSalario = sal + (sal * reajuste);
				System.out.println("Nome do colaborador: " + nome);
				System.out.println("Cargo: " + cargo);
				System.out.println("Salario: " + novoSalario);
				
			break;
			case 2:
				cargo = "Vendedor";
				reajuste = 0.07f;
				novoSalario = sal + (sal /reajuste);
				System.out.println("Nome do colaborador: " + nome);
				System.out.println("Cargo: " + cargo);
				System.out.println("Salario: " + novoSalario);
			break;
			case 3:
				cargo = "Supervisor";
				reajuste = 0.09f;
				novoSalario = sal + (sal /reajuste);
				System.out.println("Nome do colaborador: " + nome);
				System.out.println("Cargo: " + cargo);
				System.out.println("Salario: " + novoSalario);
			break;
			case 4:
				cargo = "Motorista";
				reajuste = 0.06f;
				novoSalario = sal + (sal /reajuste);
				System.out.println("Nome do colaborador: " + nome);
				System.out.println("Cargo: " + cargo);
				System.out.println("Salario: " + novoSalario);
			break;
			case 5:
				cargo = "Estoquista";
				reajuste = 0.05f;
				novoSalario = sal + (sal /reajuste);
				System.out.println("Nome do colaborador: " + nome);
				System.out.println("Cargo: " + cargo);
				System.out.println("Salario: " + novoSalario);
			break;
			case 6:
				cargo = "Técnico de TI ";
				reajuste = 0.08f;
				novoSalario = sal + (sal /reajuste);
				System.out.println("Nome do colaborador: " + nome);
				System.out.println("Cargo: " + cargo);
				System.out.println("Salario: " + novoSalario);
			break;
			default:
				System.out.println("Opção inválida!");
			
		}
	}

}
