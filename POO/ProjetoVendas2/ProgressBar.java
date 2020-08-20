package ProjetoVendas2;

public class ProgressBar  extends Thread{
	
	private String nome;
	
	public ProgressBar(String nome) {
		this.nome = nome;
		start();
		
	}
	
	public void run() {
		
		for(int i=10; i>0; i--) {
		
		System.out.println("Carregando por favor aguarde"+ " "+ i +" ...\n"  );
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
		
		
		
	}
}
