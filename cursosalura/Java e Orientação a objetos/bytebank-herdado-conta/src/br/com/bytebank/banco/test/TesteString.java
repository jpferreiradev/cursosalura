package br.com.bytebank.banco.test;

public class TesteString {
	
	public static void main(String args[]) {
					
		
		
		String nome = "Alura"; // [object literal] // Nessa situação em letra maiscula é um Classe;
	
		
		//String outra = nome.replace("A", "a");
		
		
		String outra = nome.toLowerCase();
		
		System.out.println(nome);
		System.out.println(outra);
		
		
		
	}
}

//String outro = new String("Alura"); -> Aqui é considerado má prática.
//int a = 3; // O int nessa situação é uma palavra chave