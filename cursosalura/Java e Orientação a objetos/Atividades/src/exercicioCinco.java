
public class exercicioCinco {

	public static void main(String args[]) {

		int conjuntosDeNumerosUm = 8 + 9 + 7;
		int conjuntosDeNumerosDois = 4 + 5 + 6;
		int media = 3;

		int mediaConjuntosDeNumeroUm = conjuntosDeNumerosUm / media;
		System.out.println("A média do primeiro conjunto de números é de : " + mediaConjuntosDeNumeroUm);

		int mediaConjuntosDeNumeroDois = conjuntosDeNumerosDois / media;
		System.out.println("A média do segundo conjunto de números é de : " + mediaConjuntosDeNumeroDois);

		int somaDasDuasMedias = mediaConjuntosDeNumeroUm + mediaConjuntosDeNumeroDois;
		int mediaDasMedias = somaDasDuasMedias/ 2;
		
		 System.out.println(" A soma das duas médias é: " + somaDasDuasMedias);
		 System.out.println("A maior das médias é:" + mediaDasMedias);
		
		
	}
}
