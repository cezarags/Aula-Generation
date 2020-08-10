package condicional;

import java.util.Scanner;

public class CatIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.println("Digite seu nome");
		nome = sc.nextLine();
		
		System.out.println(" Digite Sua idade");
		idade = sc.nextInt();
		
		if (idade >=14 && idade<=14 ) {
			
			System.out.println("Voce é infatil");
		}
		else if (idade >=15 && idade <=17) {
			
			System.out.println("Voce é Juvenil");
			
		}else  if (idade >= 18 && idade <= 25) {
			
			System.out.println(nome + "Voce é adulto");
			
		}else {
			
			System.out.println("Não deveria estar aqui");
		}
		
		
		sc.close();
		
		
	}

}
