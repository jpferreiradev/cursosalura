// Gerente é um Autenticavel, Gerente herda da class Autenticavel
public class Gerente extends Funcionario {

    //@Override
    public double getBonicacao(){
        System.out.println("Chamando o método de bonificação do GERENTE");
        return super.getSalario();
    }
}
