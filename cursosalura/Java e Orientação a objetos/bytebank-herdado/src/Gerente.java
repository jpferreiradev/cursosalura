// Gerente é um FuncionarioAutenticavel, Gerente herda da class FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {

    //@Override
    public double getBonicacao(){
        System.out.println("Chamando o método de bonificação do GERENTE");
        return super.getSalario();
    }
}
