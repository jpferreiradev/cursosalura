package listadeatividades1;

//import java.text.DecimalFormat;

public class atividade10 {

	public static void main(String args[]) {

		double alturaDaParede = 3;
		double larguraDaParede = 2.70;
		double calculoDoMetroQuadradoDaParede = alturaDaParede * larguraDaParede;

		double valorDoLitroPorMetroQuadrado = 2;
		double quantidadeDeTintaQueFalta = calculoDoMetroQuadradoDaParede / valorDoLitroPorMetroQuadrado;

		System.out.println("A altura da parede � " + alturaDaParede + " metros " + "e a largura � de " + larguraDaParede + " metros ");

		System.out.printf("O c�lculo por metro quadrado da parede � de : %.2f metros \n", calculoDoMetroQuadradoDaParede);
		System.out.printf("A quantidade de tinta necess�ria para pintar ser� de : %.2f metros \n", quantidadeDeTintaQueFalta);
		
		
		
		
	}	

}