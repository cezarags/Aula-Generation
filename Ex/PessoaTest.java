package Ex;

public class PessoaTest {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Cezar Augusto");
		p1.setCpf(39856537800L);
		p1.setEndereco("Av Brasil");
		p1.setNumero(79);
		p1.setTelefone(1137811247);
		
		
		System.out.println(p1.getNome());
		System.out.println(p1.getEndereco());
		System.out.println(p1.getNumero());
		System.out.println(p1.getTelefone());
		
		
		

	}

}
