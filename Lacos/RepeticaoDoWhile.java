package Lacos;

import java.util.Scanner;

public class RepeticaoDoWhile {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
		
		int idade; 
		
		System.out.println("\n Entre com a sua idade");
		idade = sc.nextInt();
			
		do
		{
			
			
			System.out.printf("\n Sua idade � %d", idade);
			if(idade>=18) 
			{
				System.out.printf("\n Voce �  maior de idade");	
			}
			else 
			
			{
				
				System.out.printf("\n Voce � de menor");
			}
			System.out.printf("\n Entre com sua idade");
			idade = sc.nextInt();

		}
		
		while(idade>=1); 
		sc.close();
	
	}

}

