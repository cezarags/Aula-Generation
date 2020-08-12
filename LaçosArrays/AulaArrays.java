package LaçosArrays;

import java.util.Scanner;

public class AulaArrays {
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner (System.in);
	
	
	int [] arrayUm = {12,15,23,16,89,45,80,9,70,36,30,301}; // Array iniciado com dados
	int [] arrayDois = {43,42,8,9,55,6,45,2};
	
	
	float [] nota = new float[5];  // instanciando um array sem dados e com 5 posiçoes
			
	// verificando o tamanho do array se é maior ou menor
	if(arrayDois.length > 8) {
		
		System.out.println("Tamanho do array é maior que 8! ");
		
	}else {
		
		System.out.println("Tamanho do array é menor que  8! ");
		
	}
	System.out.println("\n O tamanho do ArrayUm =  " + arrayUm.length);
	
	
	//---------------------------------//-----------------------------------------------
	
	String [] cars = {"Volvo", "", "Ford", "Mazda"};			// array de string com dados
	
	 for (String i : cars) {                                    //utilização do for-eah
		 
		 System.out.println(i);                                 // exibe na tela
	 }
			
			
	// populando um array com um laço
	 
	 for(int i=0;i<5;i++) {
		 	
		 System.out.println("Entre com uma nota");
		 nota[i]=sc.nextFloat();
	 }
	 
	 //apresentado os dados do array nota
	 
	 for(int i=0;i<5;i++) {
		 
		 System.out.println("Nota " +i+1+"="+nota[i]);
	 }
	 sc.close();
	
	}
}
