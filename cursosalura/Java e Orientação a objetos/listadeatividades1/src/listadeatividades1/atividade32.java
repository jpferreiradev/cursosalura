package listadeatividades1;

import java.util.Scanner;
import java.util.Random;

public class atividade32 {
	public static void main(String args[]) {

		Scanner numero = new Scanner(System.in);
		Random aleatorio = new Random();

		int numeroQualquer;
		int numeroAleatorio =  aleatorio.nextInt(5 + 1);
		
		
		System.out.println("Digite um número qualquer 1 até 5");
		numeroQualquer = numero.nextInt();
		System.out.println("O digitado foi " + numeroQualquer);

		System.out.println("O número sorteador foi :" + numeroAleatorio);
		
		if(numeroQualquer == numeroAleatorio) {
			System.out.println("Parabéns você acertou o número sorteado ");
		} else {
			System.out.println("Infelizmente você não conseguiu acertar, tente novamente");
		}
		 
	
	}
}
