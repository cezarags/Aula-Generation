package Ex;

public class Empregado extends Pessoa {
	
	private  int setor;
	private double salarioBase;
	private double  desconto;
	
	
	public Empregado(String nome, String endereco, int numero, int telefone, int setor, double salarioBase, double desconto) {
		
		super(nome, endereco, numero, telefone);
		this.salarioBase = salarioBase;
		this.desconto = desconto;
		this.setor = setor;
		
	
		
	}
	
	
	public double calcularSalario(int setor) {
		
		if(setor ==1) {
		return	(salarioBase - (salarioBase * desconto));
		
		}else if(setor == 2) {
				return	(salarioBase - (salarioBase  * desconto)) + 10.0;			
		
		}
		return setor;
	}



	public int getSetor() {
		return setor;
	}


	public void setSetor(int setor) {
		this.setor = setor;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public double getDesconto() {
		return desconto;
	}


	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
}
