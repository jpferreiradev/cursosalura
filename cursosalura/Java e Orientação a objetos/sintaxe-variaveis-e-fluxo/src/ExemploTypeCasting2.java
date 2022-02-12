
public class ExemploTypeCasting2 {
	
	public static void main(String args[]) {
		
		/*Casting feito implicitamente, pois o valor possui um tamanho menor que o tipo
		de variável que irá rebebe-lo
		
		*/
		
		char a = 'a';
		int b = 'b';
		float c = 100;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		/* Casting feito explicitamente, pois o valor possui um tamanho maior que o tipo de variavel que irá recebe-lo */
		
		
		int d = (int) 5.1987; 
		float e = (float) 5.0;
		int f = (char) (a + 5);
		char g = (char) 110.5;
		
		System.out.println(d); //Imprime 5
		System.out.println(e); //Imprime 5.0
		System.out.println(f); //Imprime 102
		System.out.println(g); //Imprime n
		
		
		
		
	}
}	
