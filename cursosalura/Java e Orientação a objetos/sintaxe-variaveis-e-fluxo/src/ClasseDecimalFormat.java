
import java.text.DecimalFormat;

public class ClasseDecimalFormat {
	public static void main(String args[]) {
		
		String padrao = "###.###,##";
		DecimalFormat df = new DecimalFormat(padrao);
		//String padraoDois = ("R$#,##0.00 ");
		//DecimalFormat dfz = new DecimalFormat(padraoDois);


		
		
		//df.applyPattern(padrao);
		System.out.println(df.format(1234567890.123));
		//System.out.println(dfz.format(1234567.123));
		
		//DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt" , "Brazil"));
		//dfs.setDecimalSeparator(',');

		//DecimalFormat dfs = new DecimalFormat();
		//df.applyPattern("R$ #,##0.00");
	
	}
}
