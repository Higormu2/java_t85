package aula_02_Operadores;

import java.util.Scanner;

public class Atividade02_Notas {
	
	public static void main(String[] arg)
	{
		Scanner leia = new Scanner(System.in);
		float not1, not2, not3, not4, media;
		
		System.out.println("Informe a primeira Nota: ");
		not1 = leia.nextFloat();
		System.out.println("Informe a segundo Nota: ");
		not2 = leia.nextFloat();
		System.out.println("Informe a terceira Nota: ");
		not3 = leia.nextFloat();
		System.out.println("informe a quarta Nota: ");
		not4 = leia.nextFloat();
		System.out.printf("As notas são %.2f - %.2f - %.2f - %.2f. e a média final dessas notas é: %.2f", not1, not2, not3, not4, media = (not1 + not2 + not3 + not4) /4);
	}

}
