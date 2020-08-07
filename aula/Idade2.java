package PacoteJava;

import java.util.Scanner;

public class Idade2 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		int anos,mes,dias,dia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias");
		dias = sc.nextInt();
		
		anos = (dias/365);
		mes = (dias%365)/30;
		dia =(dias%365)%30;
		
		
		System.out.println("sua idade convertida é " + anos +" "+ mes+" " +dia  );
		
		sc.close();
	}

}
