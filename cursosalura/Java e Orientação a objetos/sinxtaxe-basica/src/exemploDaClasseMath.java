
public class exemploDaClasseMath {
	
	public static void main(String args[]) {
		
		
		// 2 elevado a 3
		System.out.println(Math.pow(2, 3));
		
		
		//Caso seja acima do .5 arredonda para cima
		System.out.println(Math.round(4.7));
		// Caso for abaixo arrendoda para baixo
		System.out.println(Math.round(4.4));
		
		
		// Arredondamento para cima
		System.out.println(Math.ceil(4.4));
		System.out.println(Math.ceil(4.7));
		
		//Arredondamento para baixo
		System.out.println(Math.floor(4.4));
		System.out.println(Math.floor(4.7));
		
		//Gerar numero aleatorio
		System.out.println(Math.round(Math.random() * 10));
		
		
		System.out.println(Math.sin(Math.toRadians(30))); // Calculo do Seno
		System.out.println(Math.cos(Math.toRadians(1))); // Calculo de Cosseno
		System.out.println(Math.tan(Math.toRadians(45))); // Caluloc de tangente
		
		
		
		
	}
}	
