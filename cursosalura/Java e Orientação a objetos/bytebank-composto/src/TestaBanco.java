public class TestaBanco {
    public static void main(String args[]){
        Cliente jpaulo = new Cliente();
        jpaulo.nome = "João Paulo";
        jpaulo.cpf = "222.222.222-22";
        jpaulo.profissao = "desenvolvedor";

        Conta contaDoJP = new Conta();
        contaDoJP.deposita(100);

        // Associa o cliente jpaulo a conta contaDoJp
        contaDoJP.titular = jpaulo;

        System.out.println(contaDoJP.titular.nome);
        System.out.println(contaDoJP.titular);
        System.out.println(jpaulo);





    }
}
