// Exemplo de exceção criada, ela é unchecked
public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
