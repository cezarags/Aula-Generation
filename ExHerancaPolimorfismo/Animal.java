package ExHerancaPolimorfismo;

public abstract class Animal {
	
	private  String nome;
	private int idade;
	private String EmiteSom;
	
	abstract public void emite(String som);
	
	
	public String getNome() {
		return nome;
	}
	public void setNome( final String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmiteSom() {
		return EmiteSom;
	}
	public void setEmiteSom(String emiteSom) {
		EmiteSom = emiteSom;
	}
	
	
	public String getinfo() {
		
		return getNome()+"\t"+getIdade()+"\t"+getEmiteSom();
		
	}
	
	
	
	
	
	
	
	

}
