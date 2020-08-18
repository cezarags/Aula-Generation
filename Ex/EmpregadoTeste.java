package Ex;

public class EmpregadoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empregado empregado1 = new Empregado("Jose", "Rua Alves Cardoso ", 101, 1137814747, 1, 2000, 0.10);
		
		System.out.printf("salario  base %.2f \n" , empregado1.getSalarioBase());
		System.out.println("Desconto " + empregado1.getDesconto());
		System.out.println("Valor apos desconto " + empregado1.calcularSalario(2));
		
	}

}
