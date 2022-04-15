package exercicios;

import java.util.Scanner;
import java.lang.Math;


public class AtividadeCinco {
	public static void main(String args[]) {

		
		Scanner entrada = new Scanner(System.in);
		
		double valorCatetoA = 6;
		double valorCatetoB = 8;
		
		
		double calculoRaizQuadradaCatetoA = Math.sqrt(valorCatetoA);
		double calculoRaizQuadradaCatetoB = Math.sqrt(valorCatetoB);
		System.out.println(calculoRaizQuadradaCatetoA);
		System.out.println(calculoRaizQuadradaCatetoB);
		
		double calculoHipotenusa = (calculoRaizQuadradaCatetoA + calculoRaizQuadradaCatetoB); 
		System.out.println("O valor da hipotenusa é: 	" + calculoHipotenusa);
		
		
		
	}
}


/*
int x = 2;
Math.sqrt(x);
System.out.println(x);



*/