package listadeatividades1;

import java.util.Scanner;

public class atividade29 {
	public static void main(String args[]) {

		Scanner fst = new Scanner(System.in);

		String seuNome;
		System.out.println("Digite o seu nome:");
		seuNome = fst.nextLine();
		System.out.println(seuNome);

		double seuSalario;
		System.out.println("Digite o seu salário:");
		seuSalario = fst.nextDouble();
		System.out.println(seuSalario);

		int anosDeTrabalhoEmpresa;
		System.out.println("Digite quantos anos você trabalha na empresa:");
		anosDeTrabalhoEmpresa = fst.nextInt();
		System.out.println(anosDeTrabalhoEmpresa);

		double calculoSalarioAteTres = (seuSalario * 3) / 100;
		double calculoSalarioEntreAnos = (seuSalario * 12.5) / 100;
		double calculoSalarioDezAnos = (seuSalario * 20) / 100;

		if (anosDeTrabalhoEmpresa < 3) {
			System.out.println(
					"Você tem até 3 anos de empresa o seu aumento de salário é de 3%: " + calculoSalarioAteTres);
		}
		if (anosDeTrabalhoEmpresa >= 3 && anosDeTrabalhoEmpresa <= 10) {
			System.out.println("Você tem entre 3 anos e 10 anos de empresa seu aumento de salário é de 12,5%:"
					+ calculoSalarioEntreAnos);
		} else if (anosDeTrabalhoEmpresa > 10) {
			System.out.println(
					"Voce tem mais de 10 anos de empresa, seu aumento de salário é de 20%: " + calculoSalarioDezAnos);
		}

	}
}

/*
 * Até 3 anos de empresa: aumento de 3% - entre 3 e 10 anos: aumento de 12.5% -
 * 10 anos ou mais: aumento de 20%
 */

//System.out.println(calculoSalarioAteTres);
// System.out.println(calculoSalarioEntreAnos);
// System.out.println(calculoSalarioDezAnos);
// salario * porcentagem / 100