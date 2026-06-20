package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade_01_ClienteBanco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao;
		String resposta;
		
		filas:
		do {
			
			System.out.println("**********************************");
			System.out.println("								  ");
			System.out.println("  1 - Adicionar Cliente na Fila   ");
			System.out.println("  2 - Listar todos os Clientes	  ");
			System.out.println("  3 - Retirar Cliente da Fila	  ");
			System.out.println("  0 - Sair						  ");
			System.out.println("								  ");
			System.out.println("**********************************");
			System.out.println("Entre com a opção desejada:		  ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			
			case 1:
				do
				{
					System.out.println("Informe o nome do cliente: ");
					String nome = leia.next();
					fila.add(nome);
					System.out.println("Quer adicionar mais um cliente a fila? (Sim/Não)");
					resposta = leia.next();

				}while(resposta.equalsIgnoreCase("Sim"));
	
			break;
			case 2:
				
				if(fila.isEmpty()) {
					System.out.println("Fila está fazia"); 
				}else
				{
					System.out.println("*****************"); 
					System.out.println("Cliente na fila: "); 
					System.out.println("*****************"); 
					for(String fil:fila)
					{
						System.out.println(fil);
					}
				}
			break;
			case 3:
			{
				if(fila.isEmpty()) {
					System.out.println("Fila está fazia"); 
				}else
				{
					System.out.println("*****************"); 
					System.out.println("Cliente na fila: "); 
					System.out.println("*****************"); 
					for(String fil:fila)
					{
						System.out.println(fil);
					}
					System.out.println("**********************************"); 
					System.out.println("Qual cliente você deseja excluir? ");
					System.out.println("**********************************"); 
					resposta = leia.next();
					
					if(fila.contains(resposta) == true)
					{
						System.out.println("Cliente selecionado para ser excluído: "+resposta);
						fila.remove(resposta);
						System.out.println("***************");
						System.out.println("Fila atualizada");
						System.out.println("***************");
						for(String fil:fila)
						{
							
							System.out.println(fil);
						}
						
						
					}else
					{
						System.out.println("********************");
						System.out.println("Nome não encontrado!");
						System.out.println("********************");
					}
				}
				
				
				
			}
			break;
			case 0:
			{
				break filas;
			}
			}
			System.out.println("Deseja fazer mais uma operação? ");
			resposta = leia.next();
		}while(resposta.equalsIgnoreCase("Sim"));

	}

}
