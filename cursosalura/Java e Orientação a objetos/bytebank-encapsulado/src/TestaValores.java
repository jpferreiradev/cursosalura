public class TestaValores {
    public static void main(String args[]){

        Conta conta = new Conta(1337,24226);


        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337,16549);
        Conta conta3 = new Conta(2112,14660);

        System.out.println(Conta.getTotal());
    }
}

/*
 Essa conta está inconssitente com as regas de negocio
Deletando os setters
conta.setAgencia(-50);
conta.setNumero(-330);

*/