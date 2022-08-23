public class TestaValores {
    public static void main(String args[]){

        Conta conta = new Conta(1337,24226);

        System.out.println(conta.getAgencia());



    }
}

/*
 Essa conta está inconssitente com as regas de negocio
Deletando os setters
conta.setAgencia(-50);
conta.setNumero(-330);

*/