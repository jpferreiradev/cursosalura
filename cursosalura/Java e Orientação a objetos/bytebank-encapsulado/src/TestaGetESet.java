public class TestaGetESet {

  public static void main(String args[]){
      Conta conta = new Conta(1337,24226);

      System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        //conta.titular = paulo;
        paulo.setNome("joao paulo");

        conta.setTitular(paulo);

        // É importante saber isso aqui, saber trabalhar com as refências
        System.out.println(conta.getTitular().getNome());

      conta.getTitular().setProfissao("programador");
      // Agora em duas linhas:
      Cliente titularDaConta = conta.getTitular();
      titularDaConta.setProfissao("programador");


      System.out.println(titularDaConta);
      System.out.println(paulo);
      System.out.println(conta.getTitular());




  }

}

/*
conta.numero = 1337; - Não preciso mais invocar o .numero porque não funciona, ele é privado
conta.setNumero(1337); - E nem o setter, porque eu já fiz na invocação do construtor

*/