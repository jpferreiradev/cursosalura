
public class TestaCondicional {

	public static void main(String args[]) {

		System.out.println("Testando condicional");
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem-vindo");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você não tem 18, mas pode entrar, pois está acompanhando");
			} else {
				System.out.println("Infelizmente você não pode entrar");

			}
			
		}
	}

}
