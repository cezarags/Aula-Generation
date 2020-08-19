package ExHerancaPolimorfismo;

public class Cavalo extends Animal {
	
	 private String correr;
		
	

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	
	
	@Override
	public void emite(String som) {
		System.out.println("rhim.. rhim.. rhim");
		
		
		
	}

public String  getinfo() {
		
		return getNome()+"\t"+getIdade()+"\t"+getEmiteSom()+"\t"+getCorrer();
	}
}
