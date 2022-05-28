package listadeatividades1;

import java.util.Scanner;

public class atividade17 {

	public static void main(String args[]) {

		int velocidadeDocarro;
		double valorMultaPorVelocidade = 5;
		int valorMaximoDeVelocidade = 80;
		
		// double valorMultaVelocidade = velocidadeDocarro * valorMultaPorVelocidade;

		Scanner velocidade = new Scanner(System.in);

		System.out.println("Informe a velocidade que do carro: ");
		velocidadeDocarro = velocidade.nextInt();
		System.out.println("A velocidade do carro foi de " + velocidadeDocarro + "km/h");

		double valorDoKmUltrapassado = velocidadeDocarro - valorMaximoDeVelocidade;
		double valorMultaVelocidadee =  valorDoKmUltrapassado * valorMultaPorVelocidade; 
	
		
		if (velocidadeDocarro > 80) {
			System.out.println("Você foi multado por ultrapassar 80km/ por hora");
			System.out.println("O valor da multa por excesso de velocidade foi de R$ " + valorMultaVelocidadee + " reais" );
		} else {
			System.out.println("Você não tomou multa por excesso de velocidade.");
		}

		
	}
}
