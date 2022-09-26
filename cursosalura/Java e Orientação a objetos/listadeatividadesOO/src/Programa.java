public class Programa {
    public static void main(String args[]){

        Pessoa p = new Pessoa();

        p.nome = "Paulo";
        p.endereco.logadouro = "Avenida XYZ";
        System.out.println(p.endereco.logadouro);

    }
}

/*
Pessoa p = new Pessoa();
p.nome = "Paulo";
p.endereco = new Endereco();
p.endereco.logradouro = "Avenidade XYZ";
*/