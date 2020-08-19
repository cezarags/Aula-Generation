package ExHerancaPolimorfismo;

public class Preguiça  extends Animal  {
	
	private String sobeArvoce;
	
	public String getSobeArvoce() {
		return sobeArvoce;
	}

	public void setSobeArvoce(String sobeArvoce) {
		this.sobeArvoce = sobeArvoce;
	}

	@Override
	public void emite(String som) {
		System.out.println(" hu..hum..hum");
		
	}
		
	public String  getinfo() {
		
		return getNome()+"\t"+getIdade()+"\t"+getEmiteSom()+"\t"+getSobeArvoce();
	}
		
	}


