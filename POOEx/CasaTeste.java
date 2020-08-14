package POO;

public class CasaTeste {
	
	public static void main(String[] args) {   // metodo main inicia a aplicação
		
		
		PlantaCasa casa1 = new PlantaCasa("Cezar ", "Rua: quatro reis", 79,"vermelha");
		
		//Troca de mensagem, chama os metodos
		casa1.imprimirInfo();
		casa1.acenderLuz();
		casa1.apagarLuz();
		casa1.entrarNaCasa(10);
		casa1.entrarNaCasa(1);
		casa1.entrarNaCasa(3);
		casa1.entrarNaCasa(1);
		casa1.entrarNaCasa(1);
		
	}

}
