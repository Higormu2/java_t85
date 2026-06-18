package aula_05_Array;

import java.util.Scanner;

public class Atividade_04_NotasdeClasse {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	float notas [][] = new float[10][4];
	float medias [] = new float[10];
	char add= 'S';

	outer:
	for(int alunos= 0; alunos<notas.length ; alunos ++)
	{
		for(int bimestre= 0; bimestre<notas[alunos].length; bimestre ++) 
		{

			System.out.printf("Informe a nota do %d bimestre: ",bimestre + 1);
			notas[alunos][bimestre] = leia.nextFloat();
			medias[alunos] = medias[alunos] + notas[alunos][bimestre];
			
			
			
			if(bimestre == 3)
			{
				medias[alunos] = medias[alunos]/4;
				System.out.println("Quer adicionar outro aluno? (S/N) ");
				add = leia.next().toUpperCase().charAt(0);
				if(add != 'S') {
					break outer;
				}
			}

		}
		
	}
	for(int z=0; z<medias.length; z++)
	{
		System.out.printf("Medias: %.1f |", medias[z]);
	}
	leia.close();
 }
}
