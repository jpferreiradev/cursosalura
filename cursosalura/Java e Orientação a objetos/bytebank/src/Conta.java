public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

// exemplo de um método e o que valor que ele recebe	
// exemplo de metodo que não tem retorno
	public void deposita(double valor) {

		// this.saldo = this.saldo + valor;
		this.saldo += valor;
	}

	// exemplo de metodo que tem retorno
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

}