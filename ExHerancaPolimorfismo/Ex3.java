package ExHerancaPolimorfismo;

import java.util.ArrayList;
import java.util.Collection;

//3-	Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
//
//Armazenar dados da List
//Remover dados da list;
//Atualizar dados da list.
//Apresentar todos os dados da list.


public class Ex3 {
	
	Collection<String> produtos = new ArrayList<String>();
	
	
	
	public void cadastrarProduto(String produto) {
		
		produtos.add(produto);
		
	}

	
	public void remover(String produto) {
		
		produtos.remove(produto);
		
	}
	
	//public void atualizar(String produto) {
		
	//	produtos.
	//}
	
	public String listar() {
		
		for (String lista: produtos) {
			System.out.println(lista);
			
			
		}
		return listar();
		
		
		
	}
	
	

	public Collection<String> getProdutos() {
		return produtos;
	}


	public void setProdutos(Collection<String> produtos) {
		this.produtos = produtos;
	}

	
	
}
