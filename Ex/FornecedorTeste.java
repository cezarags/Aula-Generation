package Ex;

public class FornecedorTeste {

	public static void main(String[] args) {
		
		Fornecedor forn1 = new Fornecedor("Fruit", "Rua Carlos", 79, 1137811247, 1800, 1200);
		
		System.out.println(forn1.getNome()+ forn1.getTelefone());
		System.out.println("O valor do saldo é " + forn1.obterSaldo());

	}

}
