package listadeatividades1;

//import java.text.DecimalFormat;

public class atividade10 {

	public static void main(String args[]) {

		double alturaDaParede = 3;
		double larguraDaParede = 2.70;
		double calculoDoMetroQuadradoDaParede = alturaDaParede * larguraDaParede;

		double valorDoLitroPorMetroQuadrado = 2;
		double quantidadeDeTintaQueFalta = calculoDoMetroQuadradoDaParede / valorDoLitroPorMetroQuadrado;

		System.out.println("A altura da parede é " + alturaDaParede + " metros " + "e a largura é de " + larguraDaParede + " metros ");

		System.out.printf("O cálculo por metro quadrado da parede é de : %.2f metros \n", calculoDoMetroQuadradoDaParede);
		System.out.printf("A quantidade de tinta necessária para pintar será de : %.2f metros \n", quantidadeDeTintaQueFalta);
		
		
		
		
	}	

}