package exercicios;

import java.util.Scanner;

public class AtividadeQuatro {
	public static void main(String args[]) {
		
		Scanner nome = new Scanner(System.in);
		String meuNome;
		System.out.println("Digite o seu nome:");
		meuNome = nome.nextLine();
		//System.out.println("Bem vindo :" + meuNome);
		
		int peso; 
		System.out.println(meuNome + " digite o seu peso: ");
		peso = nome.nextInt();
		System.out.println("O seu peso �: " + (double)peso + "kg");
		
		double altura;
		System.out.println(meuNome + " digite a sua altura:");
		altura = nome.nextDouble();
		System.out.println("A sua altura � de:" + altura + " metros");
		
		double calculoImc = peso / (altura * altura);
		
		System.out.println( meuNome + " o c�lculo do seu IMC � de: " + calculoImc);
		System.out.printf( meuNome + " o c�lculo do seu IMC � de: %.2f" , calculoImc); // 1) Controle das casas decimais
		
		
		
		
		
		
		
		
		
		
		//double calculoImc = peso / (altura * altura);
		 
		 
	}
}	
