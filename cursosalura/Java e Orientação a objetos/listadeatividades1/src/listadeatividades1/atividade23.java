package listadeatividades1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade23 {
	public static void main(String args[]) {

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#,##0.00");

		String seuNome;
		char seuGenero = 'M';
		double valorDasCompras;

		Scanner nome = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		seuNome = nome.nextLine();
		System.out.println("Olá, " + seuNome);

		System.out.println("Qual é o seu sexo:");
		seuGenero = nome.next().charAt(0);
		System.out.println(seuGenero);

		System.out.println("Qual foi o valor das compras:");
		valorDasCompras = nome.nextDouble();
		System.out.println("O valor das compras foi R$" + valorDasCompras + " reais");

		double valorDescontoMasculino = (valorDasCompras * 5) / 100;
		double valorDescontoFeminino = (valorDasCompras * 13) / 100;

		System.out.println(
				"Estamos em promoção hoje, e os homens ganham 5% de desconto nos produtos e o valor do seu desconto foi de R$"
						+ (df.format(valorDescontoMasculino) + "reais"));

		System.out.println(
				"Estamos em promoção hoje, e as mulheres ganham 13% de desconto nos produtos e o valor do seu desconto foi de R$"
						+ (df.format(valorDescontoFeminino) + "reais"));

	}
}


// Melhorar a parte da escolha do sexo, o que é pedido é simples. Mas quero melhorar a forma.