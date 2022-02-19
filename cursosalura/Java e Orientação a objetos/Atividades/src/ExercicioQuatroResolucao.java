
import java.util.Scanner;

public class ExercicioQuatroResolucao {
	
		private static final int DIAS_NO_ANO = 365;
		private static final int DIAS_NO_MES = 30;
	
		public static void main2(String[] args ) {
			int idadeEmAnos = 39;
			int idadeEmMeses = 0;
			int idadeEmDias = 18;
			
			int totalEmDias = (idadeEmAnos * DIAS_NO_ANO) + (idadeEmMeses * DIAS_NO_MES) + idadeEmDias;
			
		}
	
	
		public static void main(String[] args) {
			
			try(Scanner scanner = new Scanner(System.in)){
				System.out.println("Insira sua idade informando os anos, mes e dia. Separados por espaço: ");
			
			
			String line = scanner.nextLine();
			String[] split = line.split(" ");
			int idadeEmAnos = Integer.parseInt(split[0]);
			int idadeEmMeses = Integer.parseInt(split[1]);;
			int idadeEmDias = Integer.parseInt(split[2]);
			
			int totalEmDias = (idadeEmAnos * DIAS_NO_ANO) + (idadeEmMeses * DIAS_NO_MES) + idadeEmDias;
			
			System.out.println(totalEmDias);
			
			
			
			}
		}
}


