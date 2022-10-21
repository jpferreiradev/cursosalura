// Gerente é um Funcionario, Gerente herda da class Funcionario, assina o contrato Autentical, é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonicacao(){
        System.out.println("Chamando o método de bonificação do GERENTE");
        return super.getSalario();
    }


    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }


}




