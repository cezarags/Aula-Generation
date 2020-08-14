package POO;

public class Conta {
	
	private String nomeDoCliente;
	private double saldo;
	
	
	public Conta(String nomeDoCliente, double saldo) {
		
		this.nomeDoCliente = nomeDoCliente;
		this.saldo = saldo;
		
	}
	
	
	public String imprimirInfo() {
		
		return nomeDoCliente + "O seu saldo em conta é: "+ saldo;
	}
	
	public void depositar(double valor) {
		
		saldo = saldo + valor;
		
		System.out.println("O seu valor total em conta é " + saldo);
	}
	
	
	public void sacar(double valor) {
		
		saldo = saldo - valor;
		
		System.out.println("O seu valor total em conta é " + saldo);
		
	}
	
	
	
	
	
	
	
	/// get& set


	public String getNomeDoCliente() {
		return nomeDoCliente;
	}


	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	

}
