package POO;

public class Aviao {
		
	private String nomeDaCompanhia;
	private char   classe;
	@SuppressWarnings("unused")
	private boolean noAr;
	@SuppressWarnings("unused")
	private boolean todosComCinto;
	
	
	public Aviao(String nomeDaCompanhia, char classe) {
		
		this.nomeDaCompanhia = nomeDaCompanhia;
		this.classe = classe;
		
	}
	
		public void imprimirinfo(){
			
			System.out.println("Sua companhia Area � a " + nomeDaCompanhia + " e voce faz parte da classe " + classe);
			
		}
		
		public Aviao() {
			
			noAr = false;
			todosComCinto= false;
		}
		
		
		
		public void decolar(boolean todosComCinto) {
			
			
			if (todosComCinto == true) {
				noAr = true;	
			System.out.println(" O avi�o est� decolando ");	
				
			}else if (todosComCinto == false){
				
				System.out.println(" Todos precisam estar com o cinto de seguran�a");	
				
			}
			
			
		}
		
		public void pousar() {
			
			noAr = false;
			
		}
		
	
}


