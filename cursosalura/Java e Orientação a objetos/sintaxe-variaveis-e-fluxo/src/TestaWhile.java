
public class TestaWhile {
	
	
	public static void main(String args[]) {
		
		int contador = 0;
		
		while(contador <= 10) {
			System.out.println(contador);
			
			//contador += 1; 
			// contador = contador + 1;
			++contador; // <- aparece mais frequentimente
		}
		// Escopo de vari�vel
		System.out.println(contador);
		
	}
}

/*


Na express�o condicional do while � poss�vel utilizar qualquer operador de compara��o (< [menor], > [maior], <= [menor ou igual], >= [maior ou igual], == [igual a] e != [diferente de]) e qualquer operador l�gico (&& [and], || [ou])



*/