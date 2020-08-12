package Lacos;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int idade; 
		System.out.println("Entre com a sua idade");
		idade = sc.nextInt();
		
		while(idade>=1) {
			
			
			System.out.printf("Sua idade é %d", idade);
			if(idade>=18) 
			{
				System.out.printf("Voce pe de maior");	
			}
			else 
			
			{
				
				System.out.printf("Voce é de menor");
			}
			System.out.printf("Entre com sua idade");
			idade = sc.nextInt();

		}
		sc.close();
	}
}
