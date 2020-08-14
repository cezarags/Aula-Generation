package POO;

public class Cliente {
	
	private String primeiroNome;
	private String segundoNome;
	private char   sexo; 
	private int 	idade;
	
	
	
	public Cliente(String primeiroNome, String segundoNome, char sexo, int idade) {
		
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.sexo = sexo;
		
				
	}
	
	
	public String pegarNomeCompleto() {
		
		String nomeCompleto = primeiroNome + " " + segundoNome+ " ";
		return nomeCompleto;
	}
		
	public char pegarSexo() {
		
			char sex = sexo;
			return sex;	
	}
	
	public int pegarIdade() {
		
		@SuppressWarnings("unused")
		int idadeAtual = idade;
		return idade;
		
		
	}


	@Override
	public String toString() {
		return "Cliente [primeiroNome=" + primeiroNome + ", segundoNome=" + segundoNome + ", sexo=" + sexo + ", idade="
				+ idade + "]";
	}
	
	
	
		
	}


