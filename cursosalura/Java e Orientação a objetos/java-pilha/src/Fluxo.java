public class Fluxo {

    public static void main(String[] args) {
        
    	System.out.println("Inicialização do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex){
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();

        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicialização do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicialização do metodo2");
        
        throw new ArithmeticException("Você pode comentar aqui");
        //System.out.println("Fim do método 2");
    }
}

/*
-Jeito antigo de lançar uma excesão com o throw:
ArithmeticException exception = new ArithmeticException();
throw exception;

- Jeito usado pelo mercado para usar o método throw
 throw new ArithmeticException("Deu errado");

 */