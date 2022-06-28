
public class TestaMetodo {

	public static void main(String args[]) {

		Conta contaDoJP = new Conta();
		contaDoJP.saldo = 100;
		contaDoJP.deposita(50); // chama-se invocar o método
		System.out.println(contaDoJP.saldo);
		
		boolean conseguiuRetirar = contaDoJP.saca(20);
		System.out.println(contaDoJP.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaThaynara = new Conta();
		contaDaThaynara.deposita(1000);
		boolean sucessoTransferencia = contaDaThaynara.transfere(300, contaDoJP);
		
		if(sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaThaynara.saldo);
		System.out.println(contaDoJP.saldo);
	}
}
