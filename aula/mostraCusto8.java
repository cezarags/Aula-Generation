package PacoteJava;

import java.util.Scanner;

public class mostraCusto8 {
	
	
	public static void main (String args[]) 
	{
		
		
		double custoConsumidor;
		double custoFabrica;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor de custo de fabrica");
		custoFabrica = sc.nextDouble();
		custoConsumidor = custoFabrica + (custoFabrica * 0.73);
		System.out.println("O custo do consumidor final será " + custoConsumidor);
				
		sc.close();
	}
	
	

}

