public class Cliente implements Autenticavel {


    private AutenticacaoUtil autenticador;

    public Cliente(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);

    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);

    }

}

/*
Outro jeito de fazer o método autentica
 public boolean autentica(int senha) {
        boolean autenticou = this.util.autentica(senha);
        return autenticou;



 */

