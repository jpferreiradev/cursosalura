package exercicios;

public class AtividadeNove {

	public static void main(String args[]) {

		double numeroUm = 17;
		double numeroDois = 19;
		double numeroTres = 9;
		double primeiroNumeroMaior;
		double segundoNumeroMaior;

		if (numeroUm > numeroDois) {
			primeiroNumeroMaior = numeroUm;
			System.out.println("O primeiro número maior é :" + primeiroNumeroMaior);
		} else {
			primeiroNumeroMaior = numeroDois;
			System.out.println("O primeiro número maior é: " + primeiroNumeroMaior);
		}

		if (numeroUm > numeroTres) {
			segundoNumeroMaior = numeroUm;
			System.out.println("O segundo número maior é: " + segundoNumeroMaior);
		} else {
			segundoNumeroMaior = numeroTres;
			System.out.println("O segundo número maior é: " + segundoNumeroMaior);
		}

		double mediaAritmeticaDosDoisMaiores = (primeiroNumeroMaior + segundoNumeroMaior) / 2;
		System.out.printf("A média dos dois números maiores é: %.2f ", mediaAritmeticaDosDoisMaiores);
		
	}

}

// System.out.println(mediaDosDoisMaiores);

/*
 * 
 * media aritmetrica => n1+n2+n3 / 3 = media
 * 
 * Faça um programa em Java, para ler 3 números quaisquer e calcular ( imprimir
 * com duas casas decimais) a média aritmética dois maiores
 * 
 * 
 * 
 * 
 * 
 */