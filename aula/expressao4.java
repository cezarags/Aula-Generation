package PacoteJava;

import java.util.Scanner;

public class expressao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		double A, B = 0, C, D, R, S;
		
		System.out.println("Entre com A");
		A = sc.nextInt();
		
		System.out.println("Entre com B");
		B = sc.nextInt();
		
		System.out.println("Entre com C");
		C = sc.nextInt();
		
		R = (A + B) * (A + B);
		
		S = (B + C) * (B + C);
		
		D = R + S /2;
		
		System.out.println(" A resposta é "+  D);
		
		
		
		sc.close();
		
		
		
		

	}

}
