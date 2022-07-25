
package listadeatividades1;

import java.util.Scanner;


public class atividade37 {
	public static void main(String args[]) {
			
	Scanner sge = new Scanner(System.in);
	
	/*
	System.out.println("Informe qual é o seu salário atual:");
	double salarioAtual = sge.nextDouble();
	System.out.println("Seu salário atual é de " + +salarioAtual + " reais");
	System.out.println("Informe quantos anos você trabalha na empresa:");
	int anosDeEmpresa = sge.nextInt();
	System.out.println("Você tem "+ anosDeEmpresa + " anos de empresa");
	
	*/
	System.out.println("Qual genêro você é:");
	String generoSexual = sge.nextLine();
	
	if(generoSexual == "f" || generoSexual== "F" || generoSexual == "feminino" || generoSexual == "Feminino" || generoSexual == "FEMININO") { 
		System.out.println("Seu genêro é feminino");
	} else if (generoSexual == "m" || generoSexual == "M" || generoSexual == "masculino" || generoSexual == "Masculino" || generoSexual == "MASCULINO" ){
		System.out.println("Seu gênero é masculino");
	} else {
		System.out.println("Você não escolheu o seu genêro");
}

}

}