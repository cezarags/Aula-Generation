package PacoteJava;

import java.util.Scanner;

public class EntradaSaida {
	
	public static void main (String args[]) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,soma;
		
		System.out.print("Digite a nota A: ");
		a= sc.nextInt();
		System.out.print("Digite a nota B: ");
		b= sc.nextInt();
		
		soma = a + b;
		System.out.println("O total da soma é  " + soma);
		
		sc.close();
		
		
		
	}
}
