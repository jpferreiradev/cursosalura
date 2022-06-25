
public class CriaConta {

	public static void main(String args[]) {

		// criar um objeto tipo conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
	
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta est�" + "na agencia" + segundaConta.agencia);
		
		
		
		if(primeiraConta == segundaConta) {
			System.out.println("S�o a mesma conta");
		} else {
			System.out.println("N�o s�o a mesma conta");
		}
	
		System.out.println(primeiraConta); // Exemplo que s�o objetos diferentes. 
		System.out.println(segundaConta); // Exemplo que s�o objetos diferentes.
	}
}

/*
Conta segundaConta = new Conta();
segundaConta.saldo = 400;
System.out.println(segundaConta.saldo);

Conta terceiraConta = new Conta();
terceiraConta.saldo = 700;
System.out.println(terceiraConta.saldo);
*/