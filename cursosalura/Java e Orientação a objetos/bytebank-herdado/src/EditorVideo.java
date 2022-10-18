public class EditorVideo extends Funcionario {

    public double getBonicacao() {
        System.out.println("Chamando o método de bonificacao do editor de video");
        return super.getBonicacao() + 100;
    }
}
