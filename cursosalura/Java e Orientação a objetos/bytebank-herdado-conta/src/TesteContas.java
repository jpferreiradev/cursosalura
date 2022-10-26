public class TesteContas {
    public static void main(String[] args) {

        //int a = 3;
        //int b = a / 0;
        //System.out.println(b);

        ContaCorrente cc = new ContaCorrente(111,111);
        ContaCorrente ff = new ContaCorrente(777,4567);
        //ContaCorrente outra = null;

        //outra.deposita(200.0);

        cc.deposita(100.0);
        ff.deposita(400.0);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.0);





        cc.transfere(10.0,cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());






    }
}