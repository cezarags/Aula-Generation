package Lacos;

import java.util.Scanner;

public class Ex2For {

	public static void main(String[] args) {
		
		int contPar=0, contImpar=0,i,numeroD;
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		for(i=0; i<=10; i++) {
			System.out.println("Digite os  10 numeros");
			numeroD = sc.nextInt();
			
			
			
			if (numeroD % 2==0) {
				
			
				contPar++;
			}
			
			
			else 
				
				
			
				contImpar++;
		
			
		}
		
		System.out.println("A quantidade de numeros pares são " + contPar + " e os numeros impares" + contImpar);
		
	
		
		
		

	}

}
