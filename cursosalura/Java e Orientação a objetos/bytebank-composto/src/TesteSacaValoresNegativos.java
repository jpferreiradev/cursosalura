public class TesteSacaValoresNegativos {
    public static void main(String args[]){

        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(101));

        conta.saca(101);

        System.out.println(conta.getSaldo());

        //conta.numero = 1377;
    }
}

/*

 System.out.println(conta.saldo);
// Antigo
// proibido:
conta.saldo = conta.saldo - 101;
System.out.println(conta.saldo);

 */