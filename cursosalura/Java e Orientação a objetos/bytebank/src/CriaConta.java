
public class CriaConta {

	public static void main(String args[]) {

		// criar um objeto tipo conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
	
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		
	
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