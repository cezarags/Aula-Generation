package LaçosArrays;

import java.util.Scanner;

public class ExSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia;
		System.out.println("Digite o numero do dia da semana / 0 - domingo / 1-segunda / 2-terça / 3-quarta / 4-quinta / 5- sexta ");
		Scanner sc = new Scanner(System.in);
		dia = sc.nextInt();
		
		
		switch(dia) {
		case 0:
			System.out.println("Domingo");
			
			break;
		case 1:
			
			System.out.println("Segunda");
			break;
			
		case 2:
			
			System.out.println("Terça");
			break;
			
		case 3:
			System.out.println("Quarta");
			break;
			
		case 4:
			System.out.println("Quinta");
			break;
			
		case 5:	
			System.out.println("Sexta");
			break;
			
		default:
			System.out.println("Não existe esse dia");
		
		}
		sc.close();
	}

}
