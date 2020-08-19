package ExHerancaPolimorfismo;

public class Ex1e2 {
	
	public static void main(String args[]) {
		
		Preguiça preguiça = new Preguiça();
		preguiça.setNome("pregui");
		preguiça.setIdade(15);
		preguiça.setSobeArvoce("Subiu na arvore");
		preguiça.setEmiteSom("hum..hum..hum");
		
		Cachorro cachorro = new  Cachorro();
		cachorro.setNome("tótó");
		cachorro.setIdade(5);
		cachorro.setCorrer("correndo");
		cachorro.setEmiteSom("Au... AU.. AU");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("sherlok");
		cavalo.setIdade(18);
		cavalo.setEmiteSom("Rhuam..Rhum.Rhum");
		
		
		System.out.println(cavalo.getNome());
		System.out.println(preguiça.getNome());
		System.out.println(cachorro.getNome());
	}

}
