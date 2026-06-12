package aula_02_Operadores;

public class operadoresAtribuicao {
	
	public static void main(String[] args)
	{
		int num1 = 4;
		int num2 = 4;
		int num3 = 4;
		int num4 = 4;
		int num5 = 4;
		
		System.out.println("Atribuição com soma: " + (num1 += 2));
		
		System.out.println("Atribuição com Subtração: " + (num2 -= 2));
		
		System.out.println("Atribuição com Multiplicação: " + (num3 *= 2));
		
		System.out.println("Atribuição com Divisão: " + (num4 /= 2));
		
		System.out.println("Atribuição com Módulo: " + (num5 %=2));
	}

}
