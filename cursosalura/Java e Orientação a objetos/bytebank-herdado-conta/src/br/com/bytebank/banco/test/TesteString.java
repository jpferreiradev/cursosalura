package br.com.bytebank.banco.test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TesteString {
	
	public static void main(String args[]) {
					
		
		
		String teste = "Bora";
		//CharSequence seq = "é uma sequencia de caractgeres";
		
		
		String vazioDois = "Alura";
		System.out.println(vazioDois.contains("Alu"));
		
		
		String vazio = " Alura ";
		String outroVazio = vazio.trim();
		
		
		System.out.println(vazio);
		System.out.println(outroVazio); // Ele tirou os espaços da String
		
		
		
		//  Quando algum usuario esqueceu de preencher alguma formulario
		//System.out.println(outroVazio.isEmpty());
		
		
		
		
		String nome = "Alura"; // [object literal] // Nessa situação em letra maiscula é um Classe;
	

		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
		
		
		//		char c = nome.charAt(0);
//		System.out.println(c);
		
		//System.out.println(nome);
		//System.out.println(outra);
		
		
		
		
		
	}
}

//String outro = new String("Alura"); -> Aqui é considerado má prática.
//int a = 3; // O int nessa situação é uma palavra chave



//char c = 'A';
//char d = 'a';
//String outra = nome.replace(c,d);


//String outra = nome.toLowerCase();
//String outraDois = nome.toUpperCase();