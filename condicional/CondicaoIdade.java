package condicional;

import java.util.Scanner;

public class CondicaoIdade {
	
	public static void main(String args[]) {
		
		String nome;
		int idade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o seu nome ? ");
		nome = sc.nextLine();
		sc.nextLine();
		System.out.println("Entre com sua idade ? ");
		idade = sc.nextInt();
		
		if (idade > 18) {
			
			System.out.println(nome + " Voce pode entar");
			
		}else 
		{
			
			System.out.println("Voce é de menornão pode entrar!");
		}
		
			sc.close();
			
			
		
	}

}
