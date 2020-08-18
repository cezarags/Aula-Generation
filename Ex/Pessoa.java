package Ex;

public class Pessoa {

	private  String nome;
	private  String endereco;
	private  int   numero;
	private  int  telefone;
	private  Long   cpf;
	
	
	public Pessoa() {
		
	}
	
	public void imprimirinfo() {
		
		System.out.println(nome +" " +endereco +" "+ numero);
		
	}
	
	public Pessoa(String nome, String endereco, int numero, int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		this.telefone = telefone;
		
		
	}
	
	public Pessoa(Long cpf) {
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	

	
	
	
}


