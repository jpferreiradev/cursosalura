
public class TestaLacos2 {
	
	// Corrigido código do curso de For
	
	public static void main(String[] args) {
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna != linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}

/*
 * public static void main(String[] args) {
 * 
 * for (int linha = 0; linha < 10; linha++) { for (int coluna = 0; coluna <=
 * linha;coluna++) System.out.println("*");
 * 
 * } System.out.println(); }
 * 
 * }
 * 
 * 
 * public static void main(String[] args) { for(int linha = 0; linha < 10;
 * linha++) for(int coluna = 0; coluna != linha; coluna++) {
 * System.out.print("*"); } System.out.println(); } }
 */
