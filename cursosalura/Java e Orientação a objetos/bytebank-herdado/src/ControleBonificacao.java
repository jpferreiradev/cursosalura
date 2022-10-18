public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f){
        double boni = f.getBonicacao();
        this.soma = this.soma + boni;
    }
    public double getSoma(){
        return this.soma;
    }


}
