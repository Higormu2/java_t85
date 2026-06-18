package aula_05_Array;

public class Atividade_03_Matriz_Diagonal {

	public static void main(String[] args) {
		int matriz[][] = {
							{1,2,3},
							{4,5,6},
							{7,8,9}
							};
		
		System.out.println("Elementos da Diagonal Principal: ");
		for(int i=0; i<matriz.length; i++) {
			
			System.out.print(matriz[i][i]+" ");
		}System.out.println("\n");
//====================================================================		
	
		System.out.println("Elementos da Diagonal Secundario: ");
		for(int i=0; i<matriz.length; i++) {

			
			System.out.print(matriz[i][matriz.length -1 - i]+ "");
			
			
		}
		
		
		
	}

}
