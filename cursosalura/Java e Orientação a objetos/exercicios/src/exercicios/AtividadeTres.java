package exercicios;

public class AtividadeTres {
	public static void main(String args[] ) {
		
		double notaUm = 6;
		double notaDois = 7;
		double calculaMedia = (notaUm + notaDois) / 2;
		
		System.out.println(calculaMedia);
		
		
		if(calculaMedia >= 6) {
			System.out.println("Parabéns você passou");
		} else {
			System.out.println("Você não conseguiu passar");
		}
		
		//System.out.println("A nota da primeira unidade é: " + notaUm);	
	}	
}
