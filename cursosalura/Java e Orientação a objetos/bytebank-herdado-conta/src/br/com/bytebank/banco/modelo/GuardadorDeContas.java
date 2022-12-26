package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas(){
        this.referencias = new Conta[10];
        this.posicaoLivre = 0; // Não precisaria, porque ela já começa com 0, mas é bom colocar por fins de estudo
    }

    public void adiciona(Conta ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }


    public int getQuantidadeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int posicao) {
        return this.referencias[posicao];
    }
}
