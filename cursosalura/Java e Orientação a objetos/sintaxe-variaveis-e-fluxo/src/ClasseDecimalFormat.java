
import java.text.DecimalFormat;

public class ClasseDecimalFormat {
	public static void main(String args[]) {
		
		String padrao = "###.###,##";
		DecimalFormat df = new DecimalFormat(padrao);
		
		
		
		//df.applyPattern(padro);
		System.out.println(df.format(1234567890.123));
	
		
		//DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt" , "Brazil"));
		//dfs.setDecimalSeparator(',');
		
	
	
	}
}
