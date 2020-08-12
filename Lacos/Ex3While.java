package Lacos;

import java.util.Scanner;

public class Ex3While {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int idade=0, idade21=0, idade50=0;
		
		
		while(idade != -99) {
			
			System.out.println("Digite a sua idade ");
			idade = sc.nextInt();
			
			if (idade <= 21) {
				
				idade21++;
				
				
			}if (idade >= 50) {
				
				
				idade50++;
			}
				
			
			System.out.println("idades abaixo 21 anos" + idade21);
			System.out.println(" idades acima de 50 anos" + idade50);
			
			}
			
		sc.close();	
		}

	}


