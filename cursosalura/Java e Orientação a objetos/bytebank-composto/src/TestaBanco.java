public class TestaBanco {
    public static void main(String[] args) {
        Cliente jpaulo = new Cliente();
        jpaulo.nome = "João Paulo";
        jpaulo.cpf = "222.222.222.";
        jpaulo.profissao = "desenvolvedor";

        Conta contaDoJpaulo = new Conta();
        contaDoJpaulo.deposita(100);

        // Associa o cliente jpaulo a conta contaDoJpaulo
        contaDoJpaulo.titular = jpaulo;

        System.out.println(contaDoJpaulo.titular.nome);
        System.out.println(contaDoJpaulo.titular);
        System.out.println(jpaulo);
    }
}
