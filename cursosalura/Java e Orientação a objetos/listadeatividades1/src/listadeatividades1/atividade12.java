package listadeatividades1;

public class atividade12 {
	public static void main(String args[]) {
		
		double precoDoProduto = 40;
		double precoPromocional = precoDoProduto *  5 / 100;
		double precoComDesconto = precoDoProduto - precoPromocional;
	
		System.out.println("O preço do produto é R$ " + precoDoProduto + " reais");
		System.out.println(precoPromocional);
		System.out.println("O preço promocional com 5% de desconto é de : " + precoComDesconto + " reais");
	}
}
