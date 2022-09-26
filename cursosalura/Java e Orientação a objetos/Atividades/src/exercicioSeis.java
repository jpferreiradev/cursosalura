import java.util.Scanner;

public class exercicioSeis {
	public static void main(String[] args) {

		Scanner salario = new Scanner(System.in);
		
		System.out.println("Informe o seu salário :");
		double meuSalario = salario.nextDouble();
		System.out.println("Seu salário é de: " + meuSalario);
		double reajusteSalario = meuSalario * 0.01;
		
		
		System.out.println("O seu sálario ajustado é de R$ " + reajusteSalario + " reais");
		
		
		

	}
}
