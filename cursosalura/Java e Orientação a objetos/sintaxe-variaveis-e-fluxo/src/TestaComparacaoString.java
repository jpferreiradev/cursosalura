
public class TestaComparacaoString {
	public static void main(String args[]) {
		
		String exemplo1 = "123";
		String exemplo2 = "123";
		
		// exemplo true
		System.out.println(exemplo1 == exemplo2);
		
		String exemplo3 = "123";
		String exemplo4  = new String ("123");
		
		System.out.println(exemplo3 == exemplo4);
		
		

	}
}	
