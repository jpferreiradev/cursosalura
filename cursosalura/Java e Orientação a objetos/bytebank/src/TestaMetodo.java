public class TestaMetodo {
    public static void main(String args[]){

        Conta contaDoJP = new Conta();
        contaDoJP.saldo = 100;

        //Usando o m�todo deposita
        contaDoJP.deposita(50);
        System.out.println(contaDoJP.saldo);

        // Usando o m�todo saca
        boolean conseguiuRetirar = contaDoJP.saca(20);
        System.out.println(contaDoJP.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaThay = new Conta();
        contaDaThay.deposita(1000);

        boolean sucessoTransferencia = contaDaThay.transfere(3000,contaDoJP);
        if(sucessoTransferencia){
            System.out.println("Transfer�ncia feita com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaDaThay.saldo);
        System.out.println(contaDoJP.saldo);



    }
}


/*
Conta contaDaThay = new Conta();
contaDaThay.saldo = 100;
contaDaThay.deposita(200);
System.out.println(contaDaThay.saldo);
*/
