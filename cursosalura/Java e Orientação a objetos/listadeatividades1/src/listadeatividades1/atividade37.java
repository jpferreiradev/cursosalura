
package listadeatividades1;

import java.util.Scanner;


public class atividade37 {
	public static void main(String args[]) {
			
	Scanner sge = new Scanner(System.in);
	
	/*
	System.out.println("Informe qual � o seu sal�rio atual:");
	double salarioAtual = sge.nextDouble();
	System.out.println("Seu sal�rio atual � de " + +salarioAtual + " reais");
	System.out.println("Informe quantos anos voc� trabalha na empresa:");
	int anosDeEmpresa = sge.nextInt();
	System.out.println("Voc� tem "+ anosDeEmpresa + " anos de empresa");
	
	*/
	System.out.println("Qual gen�ro voc� �:");
	String generoSexual = sge.nextLine();
	
	if(generoSexual == "f" || generoSexual== "F" || generoSexual == "feminino" || generoSexual == "Feminino" || generoSexual == "FEMININO") { 
		System.out.println("Seu gen�ro � feminino");
	} else if (generoSexual == "m" || generoSexual == "M" || generoSexual == "masculino" || generoSexual == "Masculino" || generoSexual == "MASCULINO" ){
		System.out.println("Seu g�nero � masculino");
	} else {
		System.out.println("Voc� n�o escolheu o seu gen�ro");
}

}

}