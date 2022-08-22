public class TestaContaSemCliente {
    public static void main(String args[]){

        Conta contaDaThay = new Conta();
        System.out.println(contaDaThay.getSaldo());

        contaDaThay.titular = new Cliente();
        System.out.println(contaDaThay.titular);

        contaDaThay.titular.nome = "Thaynara";
        System.out.println(contaDaThay.titular.nome);
    }
}
