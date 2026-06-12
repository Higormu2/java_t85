package aula_02_Operadores;

public class operadoresRelacionais {

	
	public static void main(String[] args) {
		
		float num1 = 2.0f;
		float num2 = 2.0f;
		float num3 = 3.0f;
		
		System.out.printf("\n %.2f == %.2f = %b", num1, num2, num1 == num2);
		
		System.out.printf("\n%.2f != %.2f = %b", num1, num2, num1 != num2);
		
		System.out.printf("\n%.2f > %.2f = %b", num1, num3, num1 > num3);
		
		System.out.printf("\n%.2f >= %.2f = %b", num1, num2, num1 >= num2);
		
	}


}
