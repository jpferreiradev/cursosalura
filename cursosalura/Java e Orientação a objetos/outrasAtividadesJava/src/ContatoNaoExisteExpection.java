public class ContatoNaoExisteExpection extends Exception{

    private String nomeContato;

    public ContatoNaoExisteExpection(String nomeContato){
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato" + nomeContato + "não existe na agenda";
    }
}
