// Aqui são os atributos da classe
// Criação da nossa primeira "classe", a gente difiniu o primeiro tipo "Conta"
public class Conta {

    double saldo;
    int agencia = 42;
    int numero;
    String titular;

    //Primeiro método, não returna nada
    public void deposita(double valor) {
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    //Segundo método, returna boolean
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    //Terceiro método, returna boolean
    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}





