public class TesteReferencias {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        //System.out.print(primeiraConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.print("São a mesma conta.");
        }

        System.out.println(primeiraConta); // São duas referências para o mesmo objeto
        System.out.println(segundaConta);
    }
}

// A primeiraConta não é uma conta, ela é uma flecha, ela é uma refêrencia para uma conta, segundaConta também não é uma conta, ela é uma referência para uma conta
//as duas referênciam para o mesmo objeto.