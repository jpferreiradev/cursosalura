
import java.util.Random;

public class TestaRandom {
	public static void main(String args[]) {
			
		//Metodo melhor para gerar numeros entre 10, 100...
		System.out.println(Math.floor(Math.random() * 100));
		
		Random aleatorio = new Random();
		
		System.out.println(aleatorio.nextInt());
		
		System.out.println(aleatorio.nextInt(5 + 1));
	
	}
}
