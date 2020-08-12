package LaçosArrays;

import java.util.Scanner;

public class Ex3Matrix3x3 {

	public static void main(String[] args) {
		
		
		int[][] matriz = new int [3][3];
		
		@SuppressWarnings("unused")
		int contMaior=10,cont = 0,numMaior = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Matriz[3][3]"); //Criado a matriz 3x3
		
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				
				System.out.printf("Digite os numeros Matriz[%d][%d]: ", linha+1,coluna+1);
				matriz[linha][coluna]=sc.nextInt();
				
			}
		}
			for(int linha=0; linha<3; linha++) {
				for(int coluna=0; coluna<3; coluna++) {
					
					if (matriz[linha][coluna]>contMaior) {
						cont++;
						numMaior = matriz[linha][coluna];					
					}	
				}
				
				}
		
		
			System.out.println(" A quantidade de numeros informados maiores que 10 são " + cont);
			
			sc.close();
				}	
			
		}
	

				

	


