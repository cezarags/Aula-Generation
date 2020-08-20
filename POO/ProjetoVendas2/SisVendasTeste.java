package ProjetoVendas2;

public class SisVendasTeste {

	public static void main(String[] args) 
	{
		
		long n = (long) (Math.random()*100000000000.0);
		SisVendas venda1 = new SisVendas("Kalunga", 35382629000128L, n);
		
		ProgressBar thread = new ProgressBar("Thread #1");
		
		System.out.println("================================Sistema de vendas===================================");
		System.out.println();
		//thread.start();
		System.out.println();
		venda1.login();
		System.out.println();
		System.out.println();
		System.out.println("====================================================================================");
		
		venda1.cpf();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t CPF do Cliente:" +venda1.retornacpf());
		
		venda1.valor();
		System.out.println(); //pular linha
		System.out.println("Imprimindo nota fiscal paulista"); //ai puxamos as informações
		System.out.println(venda1.getinfo()); // puxa info da loja
		venda1.getlista(); // puxa array list
		venda1.compra(); // puxa total da compra
		
	}


}

	
	

