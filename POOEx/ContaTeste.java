package POO;

public class ContaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Conta cc = new Conta("Cezar Augusto ", 100);
		
		System.out.println(cc.imprimirInfo());
		cc.depositar(200);
		cc.sacar(80);
		
	}

}
