public class CriaConta {
    public static void main(String args[]){
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);

        primeiraConta.agencia = 146;
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);

         segundaConta.agencia = 146;
         System.out.println("agora a segunda conta esta " + " na agencia " + segundaConta.agencia );


         if(primeiraConta == segundaConta){
             System.out.print("S�o a mesma conta");
         } else {
             System.out.println("S�o contas diferentes");
         }

        System.out.println(primeiraConta); // � uma refer�ncia para cada tipo de objeto.
        System.out.println(segundaConta);

    }
}

//primeiraConta.titular = "JP";
//primeiraConta.numero = 01;
//System.out.println("O nome do titular da primeira conta �:" + primeiraConta.titular);
//System.out.println("O n�mero da conta �:" + primeiraConta.numero);
