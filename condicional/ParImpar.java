package condicional;

import java.util.Scanner;

public class ParImpar {
	
	public static void main(String args[]) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero? ");
		numero = sc.nextInt();
		
		if (numero % 2==0) {
			
			System.out.println("O numero Digitado " + numero +  " par e a Raiz quadrada � " + Math.sqrt(numero));
			
			
			
		}else {
			
			System.out.println("O numero digitado � impar = "+ numero+ " e o n�mero elevado �  " + Math.pow(numero, 2));
		}
		
		
		sc.close();
		
	}

}
