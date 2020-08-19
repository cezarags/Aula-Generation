package ExHerancaPolimorfismo;

public class Cachorro extends Animal {
	
	private String Correr;
	
	@Override
	public void emite(String som) {
		System.out.println("AU.. AU.. AU");
	}

	public String getCorrer() {
		return Correr;
	}

	public void setCorrer(String correr) {
		Correr = correr;
	}
	
public String  getinfo() {
		
		return getNome()+"\t"+getIdade()+"\t"+getEmiteSom()+"\t"+getCorrer();
	}
	
}
