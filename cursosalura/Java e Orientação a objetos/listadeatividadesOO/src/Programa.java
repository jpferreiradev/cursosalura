public class Programa {
    public static void main(String args[]){

        Pessoa p = new Pessoa();

        p.nome = "Paulo";
        p.endereco.logadouro = "Avenida XYZ";
        System.out.println(p.endereco.logadouro);

    }
}
