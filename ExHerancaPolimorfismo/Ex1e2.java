package ExHerancaPolimorfismo;

public class Ex1e2 {
	
	public static void main(String args[]) {
		
		Pregui�a pregui�a = new Pregui�a();
		pregui�a.setNome("pregui");
		pregui�a.setIdade(15);
		pregui�a.setSobeArvoce("Subiu na arvore");
		pregui�a.setEmiteSom("hum..hum..hum");
		
		Cachorro cachorro = new  Cachorro();
		cachorro.setNome("t�t�");
		cachorro.setIdade(5);
		cachorro.setCorrer("correndo");
		cachorro.setEmiteSom("Au... AU.. AU");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("sherlok");
		cavalo.setIdade(18);
		cavalo.setEmiteSom("Rhuam..Rhum.Rhum");
		
		
		System.out.println(cavalo.getNome());
		System.out.println(pregui�a.getNome());
		System.out.println(cachorro.getNome());
	}

}
