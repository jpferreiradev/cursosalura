package listadeatividades1;

import java.util.Scanner;

public class atividade4 {
	public static void main(String args[]) {

		

		Scanner numero = new Scanner(System.in);
		
		int valorUm;
		System.out.println("Digite um valor:");
		valorUm = numero.nextInt();
		System.out.println("O primeiro valor :" + valorUm);

		System.out.println("Digite um segundo valor: ");
		int valorDois;
		valorDois = numero.nextInt();
		System.out.println("O segundo valor é: " + valorDois);

		int somaDosDoisNumeros = valorUm + valorDois;
		
		System.out.println("A soma entre " + valorUm + " e " + valorDois + " é igual a " + somaDosDoisNumeros);
	}
}
