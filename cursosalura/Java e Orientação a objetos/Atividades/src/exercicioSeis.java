import java.util.Scanner;

public class exercicioSeis {
	public static void main(String[] args) {

		Scanner salario = new Scanner(System.in);
		
		System.out.println("Informe o seu sal�rio :");
		double meuSalario = salario.nextDouble();
		System.out.println("Seu sal�rio � de: " + meuSalario);
		double reajusteSalario = meuSalario * 0.01;
		
		
		System.out.println("O seu s�lario ajustado � de R$ " + reajusteSalario + " reais");
		
		
		

	}
}
