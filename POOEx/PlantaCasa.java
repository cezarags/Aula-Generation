package POO;

public class PlantaCasa {

			

	private String nomeProprietario;
	private String endCasa;
	private int numeroCasa;
	private String corCasa;
	private int luz=0;
	private int qtdMax=15;
	private int qtdPessoas=0;
	private int qtdPessoasqEntrou;
	private int qtdLugaresDisp;
	
	//Metodo construtor com args
	public PlantaCasa (String nomeProprietario, String endCasa, int numeroCasa, String corCasa) {
		
		this.nomeProprietario = nomeProprietario;
		this.endCasa = endCasa;
		this.numeroCasa = numeroCasa;
		this.corCasa = corCasa;
		
		
	}
	
	
	
	//declaração de metodos da classe
	
	public void imprimirInfo(){
		
		System.out.println(nomeProprietario + "Sua casa fica na "+ endCasa +" : " +numeroCasa + " e a cor da sua casa é " + corCasa);
	
	}
	
	
	public void acenderLuz() {
		
		
		if(luz ==1) {
			
			System.out.println("A luz já está acessa, voce precisa apagar para conseguir acender novamente");
		}else {
			System.out.println("A luz foi acessa");
			luz =1;
			
		}
			
	}
			
	public void apagarLuz() {
		
		if(luz ==0) {
			
			System.out.println("A luz Já está apagada, voce precisa acender para apagar!");
			
		}else {
			System.out.println(" A luz foi apagada");
			luz = 0;
		}
	}
	
	public void entrarNaCasa(int qtdPessoas) {
		
		if(qtdPessoasqEntrou + qtdPessoas <= qtdMax  ) {
			
			qtdPessoasqEntrou = qtdPessoasqEntrou + qtdPessoas;
			
			
	
			}else if(qtdPessoas + qtdPessoasqEntrou >=qtdMax) {
				
				System.out.println(" A quantidade maxima é de " + qtdMax + " pessoas com conforto na casa, temos atualmente " + qtdPessoasqEntrou + " e restam " +qtdLugaresDisp+ " lugares"  );
			
		}
		qtdLugaresDisp = qtdMax - qtdPessoasqEntrou;
		
	}

	
	public void SetNomeProprietario (String nome) {
		
		this.nomeProprietario = nome;
	}
	
	public void SetCorCasa(String cor) {
		
		this.corCasa = cor;
	}

	
	
	public int getQtdMax() {
		return qtdMax;
	}



	public void setQtdMax(int qtdMax) {
		this.qtdMax = qtdMax;
	}



	public int getQtdPessoas() {
		return qtdPessoas;
	}



	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}



	public int getQtdPessoasqEntrou() {
		return qtdPessoasqEntrou;
	}



	public void setQtdPessoasqEntrou(int qtdPessoasqEntrou) {
		this.qtdPessoasqEntrou = qtdPessoasqEntrou;
	}



	public int getQtdLugaresDisp() {
		return qtdLugaresDisp;
	}



	public void setQtdLugaresDisp(int qtdLugaresDisp) {
		this.qtdLugaresDisp = qtdLugaresDisp;
	}



	public String getNomeProprietario() {
		return nomeProprietario;
	}



	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}



	public String getEndCasa() {
		return endCasa;
	}



	public void setEndCasa(String endCasa) {
		this.endCasa = endCasa;
	}



	public int getNumeroCasa() {
		return numeroCasa;
	}



	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}



	public String getCorCasa() {
		return corCasa;
	}



	public void setCorCasa(String corCasa) {
		this.corCasa = corCasa;
	}



	public int getLuz() {
		return luz;
	}



	public void setLuz(int luz) {
		this.luz = luz;
	}


}




