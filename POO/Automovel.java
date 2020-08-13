package POO;


	//declara��o de pacotes
	//defini��o da classe Automovel
	public class Automovel {
	  //declara��o dos atributos da classe
	  private String nomeProprietario;
	  private String modelo;
	  private String placa;
	  private int ano;
	 
	  //m�todo construtor
	  public Automovel (String nomeProprietario, String modelo, String placa, int ano) {
	    this.nomeProprietario = nomeProprietario;
	    this.modelo = modelo;
	    this.placa = placa;
	    this.ano = ano;
	  }    
	  
	  //declara��o dos demais m�todos da classe
	  public void imprimirInfo (){
	    System.out.println(nomeProprietario+ " possui um(a) " + modelo + " com placa " + placa + " e ano " + ano);
	  }
	  public void setNomeProprietario (String nome){
	    this.nomeProprietario = nome;
	  }
	  public void setPlaca (String nPlaca){
	    this.placa = nPlaca;
	  }

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public String getPlaca() {
		return placa;
	}
	  
	  


}
