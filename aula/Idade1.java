package PacoteJava;

import java.util.Scanner;

public class Idade1 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int dia, mes, ano, dias;
		
	
		
		System.out.println(" Digite sua idade");
		ano = sc.nextInt();
		System.out.println("Digite seu dia de nascimento ");
		dia = sc.nextInt();
		System.out.println("Digite o mes do nascimento");
		mes = sc.nextInt();
		
		dias = ((ano*365) + (mes*30) + (dia*1));
		
		System.out.println("Contando sua idade em dias são " + dias +" dias");
				
		sc.close();
		
		
		
	}

}
