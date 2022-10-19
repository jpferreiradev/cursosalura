// Não pode instanciar dessa clase, porque é abstrata
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;



// Método sem corpo, não há implementação, fazer a implementação nos filhos
    public abstract double getBonicacao();

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }


}
