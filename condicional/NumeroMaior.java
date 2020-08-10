package condicional;
import java.util.Scanner;

public class NumeroMaior {
	
	public static void main (String args[]) {
		
//		int num1,num2,num3,maiorN=0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Digite os 3 numeros");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		
//		
//		if (maiorN < num1 ){
//			
//			maiorN = num1;
//		} if (num2> num1) {
//			
//			maiorN = num2;
//		}if (num3 >num2) {
//			
//			maiorN = num3;
//		}
//		
//				
//		System.out.println("O maior Numero Digitado foi " + maiorN);
		
		
		//==================================================================
		
		int num4=0,maiorNo=0,i;
		
		@SuppressWarnings("resource")
		Scanner sc2 = new  Scanner(System.in);
		
		System.out.println("Digite os 3 numeros");
		for(i=0;i<=2;i++) {
			
			
			num4 = sc2.nextInt();
			
			if (maiorNo < num4) {
				
				maiorNo = num4;
			}
			
			

		
	
	}
		System.out.println("O maior numero Digitado foi" + maiorNo);
		sc2.close();
	}
}
