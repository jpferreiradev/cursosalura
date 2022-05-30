package listadeatividades1;

import java.util.Scanner;

public class atividade19 {
	public static void main(String args[]) {

		double primeiraNota;
		double segundaNota;
		String meuNome;

		Scanner nota = new Scanner(System.in);

		System.out.println("Informe o seu nome: ");
		meuNome = nota.nextLine();
		System.out.println("Olá, " + meuNome);

		System.out.println("Informe a primeira nota:");
		primeiraNota = nota.nextDouble();
		System.out.println("A primeira nota é: " + primeiraNota);

		System.out.println("Informe a segund nota: ");
		segundaNota = nota.nextDouble();
		System.out.println("A segunda nota é:" + segundaNota);

		
		double calculoMedia = (primeiraNota + segundaNota) / 2;
		
		//System.out.printf("A sua média foi : /n" + calculoMedia);
		System.out.printf("A sua média foi  %.2f %n", (calculoMedia)); 
		
		if(calculoMedia >= 7)  {
			System.out.println(" Parabéns, você teve um bom aproveitamento");
		} else {
			System.out.println("Você não teve um bom aproveitamento");
		}
		
	}

}
