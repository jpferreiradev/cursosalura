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
            System.out.print("S�o a mesma conta.");
        }

        System.out.println(primeiraConta); // S�o duas refer�ncias para o mesmo objeto
        System.out.println(segundaConta);
    }
}

// A primeiraConta n�o � uma conta, ela � uma flecha, ela � uma ref�rencia para uma conta, segundaConta tamb�m n�o � uma conta, ela � uma refer�ncia para uma conta
//as duas refer�nciam para o mesmo objeto.