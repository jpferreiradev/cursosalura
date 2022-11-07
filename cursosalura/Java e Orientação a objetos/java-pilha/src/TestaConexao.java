public class TestaConexao {
    public static void main(String args[]) {

    // Nova forma de fazer try/catch/ talvez o finally - Simplificada

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex){
            System.out.println("Deu erro na conexão");
        }
    }

}

//----------------------------------------------------------
// Esse código no minimo é complexo de ler
// Antigamente esse era o código para escrever, não tinha simplificação
// Ela só foi lançada no Java 1.7

    /*
        Conexao com = null;
        try {
            com = new Conexao();
            com.leDados();
        } catch (IllegalStateException ex){
            System.out.println("Deu erro na conexão");
        }
        finally {
            System.out.println("Finally");
            if(com != null){
                com.close();
            }
        }

    }
*/