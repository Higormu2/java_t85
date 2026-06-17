package aula_04_repeticoes;

import java.util.Scanner;

public class Atividade_04_Genero {
	
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int idade, gen, dev;
		char resp = 'S';
		int back = 0;
		int front = 0;
		int mfront = 0;
		int mob = 0;
		int mmob = 0;
		int full = 0;
		int nfull = 0;
		int mulher = 0;
		int homem = 0;
		int nBi = 0;
		int mTrans = 0;
		int hTrans = 0;
		int outros = 0;
		int i = 0;
		int media = 0;
		
		while(resp == 'S') {
			
			i = i + 1;
			
		
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		media = media + idade;
		System.out.println("********************************");
		System.out.println("*** IDENTIDADE DE GENERO 	 ***");
		System.out.println("********************************");
		System.out.println("								");
		System.out.println("	1 - Mulher Cis				");
		System.out.println("	2 - Homem Cis				");
		System.out.println("	3 - Não Binario				");
		System.out.println("	4 - Mulher Trans			");
		System.out.println("	5 - Homem Trans				");
		System.out.println("	6 - Outros					");
		System.out.println("								");
		System.out.println("********************************");
		System.out.println("********************************");
		
		System.out.println("Informe seu genero");
		gen = leia.nextInt();

		switch(gen) {
		case 1:
			mulher = mulher + 1;
		break;
		case 2:
			homem = homem + 1;
		break;
		case 3:
			nBi = nBi + 1;
		break;
		case 4:
			mTrans = mTrans + 1;
		break;
		case 5:
			hTrans = hTrans + 1;
		break;
		case 6:
			outros = outros + 1;
		break;
		default:
			System.out.println("Opção invalida");
		}
			
			System.out.print("\033[H\033[2J");
			System.out.flush();
		
		System.out.println("********************************");
		System.out.println("*** PESSOA DESENVOLVEDORA 	 ***");
		System.out.println("********************************");
		System.out.println("								");
		System.out.println("	1 - Backend					");
		System.out.println("	2 - Frontend				");
		System.out.println("	3 - Mobile					");
		System.out.println("	4 - FullStack				");
		System.out.println("								");
		System.out.println("********************************");
		System.out.println("********************************");
		
		System.out.println("Informe sua profissão utilizando os numeros: ");
		dev = leia.nextInt();
		
		switch(dev) {
		case 1:
			 back = back + 1;
		break;
		case 2:
			
			if(gen == 1 || gen == 4) {
				mfront = mfront + 1;
			}else
			{
				front = front + 1;
			}
				
		break;
		case 3:
			if(gen == 2 || gen == 5 && idade > 40) {
				mob = mob + 1;
			}else
			{
				mmob = mmob + 1;
			}
			
		break;
		case 4:
			if(gen == 3 && idade < 30) {
				nfull = nfull + 1;
			}else
			{
				full = full + 1;
			}
		break;
		default:
			System.out.println("Opção invalida");
		}
		
		System.out.println("Quer adicionar mais um colaborador? ");
		resp = leia.next().toUpperCase().charAt(0);
		
		if(resp != 'S') {
			
			System.out.printf("O número de pessoas desenvolvedoras Backend: %d\n", back);
			System.out.printf("O número de Mulheres Cis e Trans desenvolvedoras Frontend: %d\n", mfront);
			System.out.printf("O número de Homens Cis e Trans desenvolvedoras mobile maiores de 40 anos: %d\n", mob);
			System.out.printf("O número de não binarios desenvolvedoras FullStack menores de 30 anos: %d\n", nfull);
			System.out.printf("O número total de pessoas que responderam à pesquisa: %d\n", mulher = mulher + homem + nBi + mTrans + hTrans + outros);
			System.out.printf("A média de idade das pessoas que responderam à pesquisa: %d\n", media = media/i);
		}
		} 
		
		

		
	}

}
