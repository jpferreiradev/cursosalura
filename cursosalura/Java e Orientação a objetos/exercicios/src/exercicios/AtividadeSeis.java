package exercicios;

public class AtividadeSeis {
	public static void main (String args[]) {
			
		int numeroUm = 56;
		int numeroDois = 78;
		int numeroTres = 150;
		//int calculoNumeroMaior;
		
		if(numeroUm > numeroDois) {
			numeroTres = numeroDois;
		} if(numeroDois > numeroTres) {
			numeroDois = numeroTres;
		} 
		System.out.println("O numéro maior é o : " + numeroTres);
		
	}
}

/*


			int n[] = new int [3];
			n[0] = 3;
			n[1] = 5;
			n[2] = 6;
			
			for(int x=0; x >= 3; x++) {
				System.out.println(x);
			}



*/