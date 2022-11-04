public class Fluxo {

    public static void main(String[] args) {
        
    	System.out.println("Inicialização do main");
        try {
            metodo1();
        } catch (Exception ex){
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();

        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Inicialização do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Inicialização do metodo2");
        
        throw new MinhaExcecao("Deu muito errado");
        //System.out.println("Fim do método 2");
    }
}

/*
-Forma antiga de lançar uma excesão com o throw:
ArithmeticException exception = new ArithmeticException();
throw exception;

- Jeito usado pelo mercado para usar o método throw
 throw new ArithmeticException("Deu errado");

- try{
            metodo1
       } ArithmeticException | NullPointerException | MinhaExcecao ex {

       }


 */