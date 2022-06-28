
public class TestaBanco {
	
	public static void main(String args[]) {
		
		Cliente jp = new Cliente();
		jp.nome = "João Paulo Ferreira";
		jp.cpf = "045.888.033-44";
		jp.profissao = "programador";
		
		Conta contaDoJP = new Conta();
		contaDoJP.deposita(100);
	
		// associa o cliente JP para a conta contaDoJP
		contaDoJP.titular = jp;
		
		System.out.println(contaDoJP.titular.nome);
		System.out.println(contaDoJP.titular);
		System.out.println(jp);
		
	}
}
