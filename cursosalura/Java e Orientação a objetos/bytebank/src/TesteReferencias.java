
public class TesteReferencias {

	public static void main(String args[]) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println(" Saldo da primeira:" + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
	
	
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesma conta, esses são duas referências para o mesmo objeto");
		}
	
		System.out.println(primeiraConta); // Aqui é um exemplo referência.
		System.out.println(segundaConta); // Aqui é um exemplo referência.
	}
}
