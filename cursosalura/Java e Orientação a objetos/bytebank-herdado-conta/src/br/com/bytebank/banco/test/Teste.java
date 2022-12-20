package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;

public class Teste {
	public static void main(String args[]) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
	
		
		// Polimorfismo
		Object cc = new ContaCorrente(22,33);
		Object cp = new ContaPoupanca(33,22);
		Object cliente = new Cliente();
		
		// Reutilização de código
		System.out.println(cc);
		System.out.println(cp);	
		
		//println(cliente);
		
	}

	static void pritnln(){ 
		
	}
	
	static void println(int a) {	
	}

	static void pritnln(boolean valor) {		
	}
	
	static void println( Object referencia) {
		
	}
}
