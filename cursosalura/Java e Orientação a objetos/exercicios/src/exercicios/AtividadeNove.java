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
			System.out.println("O primeiro n�mero maior � :" + primeiroNumeroMaior);
		} else {
			primeiroNumeroMaior = numeroDois;
			System.out.println("O primeiro n�mero maior �: " + primeiroNumeroMaior);
		}

		if (numeroUm > numeroTres) {
			segundoNumeroMaior = numeroUm;
			System.out.println("O segundo n�mero maior �: " + segundoNumeroMaior);
		} else {
			segundoNumeroMaior = numeroTres;
			System.out.println("O segundo n�mero maior �: " + segundoNumeroMaior);
		}

		double mediaAritmeticaDosDoisMaiores = (primeiroNumeroMaior + segundoNumeroMaior) / 2;
		System.out.printf("A m�dia dos dois n�meros maiores �: %.2f ", mediaAritmeticaDosDoisMaiores);
		
	}

}

// System.out.println(mediaDosDoisMaiores);

/*
 * 
 * media aritmetrica => n1+n2+n3 / 3 = media
 * 
 * Fa�a um programa em Java, para ler 3 n�meros quaisquer e calcular ( imprimir
 * com duas casas decimais) a m�dia aritm�tica dois maiores
 * 
 * 
 * 
 * 
 * 
 */