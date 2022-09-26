
public class TestaWhile {
	
	
	public static void main(String args[]) {
		
		int contador = 0;
		
		while(contador <= 10) {
			System.out.println(contador);
			
			//contador += 1; 
			// contador = contador + 1;
			++contador; // <- aparece mais frequentimente
		}
		// Escopo de variável
		System.out.println(contador);
		
	}
}

/*


Na expressão condicional do while é possível utilizar qualquer operador de comparação (< [menor], > [maior], <= [menor ou igual], >= [maior ou igual], == [igual a] e != [diferente de]) e qualquer operador lógico (&& [and], || [ou])



*/