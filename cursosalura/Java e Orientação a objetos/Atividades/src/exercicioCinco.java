
public class exercicioCinco {

	public static void main(String args[]) {

		int conjuntosDeNumerosUm = 8 + 9 + 7;
		int conjuntosDeNumerosDois = 4 + 5 + 6;
		int media = 3;

		int mediaConjuntosDeNumeroUm = conjuntosDeNumerosUm / media;
		System.out.println("A m�dia do primeiro conjunto de n�meros � de : " + mediaConjuntosDeNumeroUm);

		int mediaConjuntosDeNumeroDois = conjuntosDeNumerosDois / media;
		System.out.println("A m�dia do segundo conjunto de n�meros � de : " + mediaConjuntosDeNumeroDois);

		int somaDasDuasMedias = mediaConjuntosDeNumeroUm + mediaConjuntosDeNumeroDois;
		int mediaDasMedias = somaDasDuasMedias/ 2;
		
		 System.out.println(" A soma das duas m�dias �: " + somaDasDuasMedias);
		 System.out.println("A m�dia das m�dias �:" + mediaDasMedias);
		
		
	}
}
