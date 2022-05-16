// O ponto é o separador decimal do Java

package listadeatividades1;



public class atividade8 {
	public static void main(String args[]) {
		
		double distanciaEmMetros = 185.72;
		double distanciaEmKilometros = distanciaEmMetros / 1000, distanciaEmHectometro = distanciaEmMetros / 100 ,distanciaEmDecametro = distanciaEmMetros / 10;
		double distanciaEmDecimetro = distanciaEmMetros * 10, distanciaEmCentrimetro = distanciaEmMetros * 100,distanciaEmMilimetro = distanciaEmMetros * 1000;
	
		
		
		
		
		System.out.println("Digite uma distância em metros: " + distanciaEmMetros);
		System.out.println("A distância de :" + distanciaEmMetros + " metros");
		
		System.out.println(distanciaEmKilometros + "km");
		System.out.println(distanciaEmHectometro + "Hm");
		System.out.println(distanciaEmDecametro + "Dam");
		
		System.out.println(distanciaEmDecimetro + "dm");
		System.out.println(distanciaEmCentrimetro + "cm");
		System.out.println(distanciaEmMilimetro + "mm");
	}
}
