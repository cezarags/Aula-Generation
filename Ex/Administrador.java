package Ex;

public class Administrador extends Pessoa {
	
	private double ajudaDeCusto = 150;
	
		
	
	public Administrador(String nome, String endereco, int numero, int telefone, double ajudaDeCusto) {
		super(nome, endereco, numero, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
		
		}
	
	public void imprimir() {
		
		System.out.println("Ajuda de custo no valor de : " + ajudaDeCusto);
	
	
		
		
	
		
		
	}
	
	
	}


