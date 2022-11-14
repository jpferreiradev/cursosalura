public class Agenda {

    private Contato[] contatos;


    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {   // Não foi feito da melhor maneira possivel, mas uma forma mais simples

        boolean cheia = true;
        // Como saber qual a posição da agenda podemos adicionar esse contato
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                break;
            }
        }

        if (cheia) {
            throw new AgendaCheiaException();
        }
    }


    public int consultaContatoPorNome(String nome) throws ContatoNaoExisteExpection {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }
            }
        }
        throw new ContatoNaoExisteExpection(nome);

    }


    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos) {
            if (c != null) {
                s += c.toString() + "/n";
            }

        }
        return s;
    }

}

