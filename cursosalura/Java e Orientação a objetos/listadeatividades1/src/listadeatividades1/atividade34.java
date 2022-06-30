package listadeatividades1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class atividade34 {

	public static void main(String args[]) {

		Scanner imc = new Scanner(System.in);

		String padrao = "##.##";
		DecimalFormat df = new DecimalFormat(padrao);

		System.out.println("Digite o seu nome:");
		String nomeDaPessoa = imc.nextLine();
		// System.out.println(nomeDaPessoa);
		System.out.println("Digite o seu peso:");
		double pesoDaPessoa = imc.nextDouble();
		System.out.println("Digite a sua altura:");
		double alturaDaPessoa = imc.nextDouble();
		System.out.println("Ol�, " + nomeDaPessoa + " o seu peso � " + pesoDaPessoa + "kg e a sua altura � "
				+ alturaDaPessoa + "m");

		double calculoDoImc = pesoDaPessoa / Math.pow(alturaDaPessoa, 2);

		System.out.println(calculoDoImc);
		System.out.println("O c�lculo do seu IMC � de: " + df.format(calculoDoImc));

		
		if(calculoDoImc < 18.5) {
			System.out.println("Abaixo do peso");
		} if(calculoDoImc > 18.5 && calculoDoImc <= 25) {
			System.out.println("Peso ideal");
		} if(calculoDoImc > 25 && calculoDoImc <= 30) {
			System.out.println("Sobrepeso"); 
		} if(calculoDoImc > 30 && calculoDoImc <= 40) {
			System.out.println("Obesidade");
		} else if(calculoDoImc > 40) {
			System.out.println("Obesidade m�rbida");
		}
	
	
		

	}

}
