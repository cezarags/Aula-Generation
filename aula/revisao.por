programa
{
	
	funcao inicio()
	{


		real notaA,notaB,mp
		cadeia nome
		inteiro x=1
		inteiro y


	enquanto(x<=5)
	{	
		escreva("\n Digite o seu nome ")
		leia(nome)
		escreva("\n Entre com a notaA:  ")
		leia(notaA)
			enquanto(notaA>10 ou notaA<0)
				{
				escreva("\n Entre com a nota A")
				leia(notaA)
				}	

		escreva("\n Entre com a notaB")
		leia(notaB)
			enquanto(notaA>10 ou notaA<0)
				{
				escreva("\nEntre com a nota A")
				leia(notaB)
				}

	

		mp=((notaA*1)+(notaB*2))/3	
		escreva("\n Media Ponderada", mp)	

	
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */