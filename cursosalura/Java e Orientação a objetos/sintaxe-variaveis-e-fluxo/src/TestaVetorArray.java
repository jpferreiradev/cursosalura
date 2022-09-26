
public class TestaVetorArray {
	public static void main(String args[]) {
		
		/*
		double tempDi001 = 31.3;
		double tempDi002 = 32;
		double tempDi003 = 33.7;
		double tempDi004 = 34;
		double tempDi005 = 33.1;
		*/
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
			
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		
		// Saber o tamanho do seu array
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: ");
		
		for(int i =0; i < temperaturas.length; i++) {
			System.out.println(" O valor da temperatura do dia " + (i+1) + " é " + temperaturas[i]);
		}
		
		// "nova forma do for, introduzido no Java 5"
		
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		
	}
}	
