package Lacos;

import java.util.Scanner;

public class Ex4Whime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 /*
		  4 - Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		 psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
		 era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
		 (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		 agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		 pessoas, calcule e mostre: (WHILE)
		 o n�mero de pessoas calmas; ok
		 o n�mero de mulheres nervosas;ok
		 o n�mero de homens agressivos; ok
		 o n�mero de outros calmos; ok
		 o n�mero de pessoas nervosas com mais de 40 anos;ok
		 o n�mero de pessoas calmas com menos de 18 anos. ok
		 */
	
	
	Scanner sc = new Scanner(System.in);
	
	int idade = -99, sexo = 0, estado= 0, pCalmas= 0, mNervosa= 0, homensAgr= 0, outrosC= 0, nervoso40= 0, calmos18= 0;
	
	while(idade != 0) {
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Informe: \n1 - Feminino \n2 - Masculino \n3 - Outros");
		sexo = sc.nextInt();
		System.out.println("Informe: \n1 - Calmo(a) \n2 - Nervoso(a) \n3 - Agressivo(a)");
		estado = sc.nextInt();
		
		if (estado == 1) { // Calmos
			pCalmas++; // Conta Qtde Pessoas Calmas
			
			if(sexo == 3) {
				outrosC++; // Conta Qtde Outros Calmos
			}
			if(idade > 0 && idade < 18) {
				calmos18++; // Conta Qtde de Calmos Menores de 18 anos
			}
		}
		
		else if (estado == 2) { // Nervosos
			if(sexo == 1) {
				mNervosa++; // Conta Qtde de Mulheres Nervosas
			}
			if(idade > 40) {
				nervoso40++; // Conts Qtde de nervosos Acima dos 40
			}
		}
		
		else if (estado == 3 && sexo == 2) { // Agressivos
			homensAgr++; // Conta Qtde de Homens Agressivos
		}	
	}
	
	System.out.println("-- Informa��es Pesquisa -- ");
	System.out.println("N�mero de pessoas calmas: "+pCalmas);
	System.out.println("N�mero de mulheres nervosas: "+mNervosa);
	System.out.println("N�mero de homens agressivos: "+homensAgr);
	System.out.println("N�mero de outros calmos: "+outrosC);
	System.out.println("N�mero de pessoas nervosas com mais de 40 anos: "+nervoso40);
	System.out.println("N�mero de pessoas calmas com menos de 18 anos: "+calmos18);
	
	sc.close();

}

}
