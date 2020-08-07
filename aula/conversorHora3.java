package PacoteJava;

import java.util.Scanner;

public class conversorHora3 {
	
	
	public static void main(String args[]) {
		
		
		int h=3600,min,seg; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os segundos");
		seg = sc.nextInt();
		h =		((seg/h));
		min =	((seg % h) / 60);	
		seg =   ((seg % h) % 60);
		
		
		
		System.out.println("horas" + h + "minutos" + min + "segundos" + seg);
		sc.close();
		
	}
	
	
	
	
	
}
