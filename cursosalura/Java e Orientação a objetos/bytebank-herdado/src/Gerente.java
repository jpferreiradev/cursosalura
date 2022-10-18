public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    //@Override
    public double getBonicacao(){
        System.out.println("Chamando o método de bonificação do GERENTE");
        return super.getBonicacao() + super.getSalario();
    }
}
