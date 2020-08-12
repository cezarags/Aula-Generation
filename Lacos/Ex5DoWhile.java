package Lacos;

import java.util.Scanner;

public class Ex5DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int numero,soma=0;
		
		do {
			System.out.println("Digite os numeros");
			numero = sc.nextInt();
			
			soma = soma + numero;
			
			
		}
		while(numero !=0);
		
		System.out.println(" A soma dos numeros é" + soma);
		sc.close();
	}
	
}
	 
