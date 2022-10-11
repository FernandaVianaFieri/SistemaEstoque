import br.edu.unicid.dao.ProdutoDAO;

import javax.swing.JOptionPane;

import br.edu.unicid.bean.Produto;

public class Principal {

	public static void main(String[] args) throws Exception {

		
			ProdutoDAO dao = new ProdutoDAO();
				
			
			// Insere Produto
			Produto produto = new Produto(11, 5, "Bicicleta","Bike");
			dao.salvar(produto);
			JOptionPane.showMessageDialog(null, "Produto inserido com Sucesso"); 
			


			
			// Atualiza Produto Pelo CODIGO 
			//Produto produto = new Produto(2, 6, "Celular","Samsung 15 p");
			//dao.atualizar(produto);
			//JOptionPane.showMessageDialog(null, "Produto Atualizado com sucesso");
			

			
			// Exclui Produto Pelo CODIGO
			//dao.excluir(1);
			//JOptionPane.showMessageDialog(null, "Produto excluido com sucesso");
			

			
			// Procurar produto
			//System.out.println(dao.procurarProduto(2));
			
			//JOptionPane.showMessageDialog(null, " produto encontrado");
			
			
		
			
			// Listar Produtos
			
			//System.out.println(dao.todosProdutos());
			
			


	}
}
