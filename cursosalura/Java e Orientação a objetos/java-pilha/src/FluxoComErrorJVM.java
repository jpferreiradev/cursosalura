public class FluxoComErrorJVM {

    public static void main(String[] args) {
        
    	System.out.println("Inicialização do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao ex){
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
        System.out.println("Inicio método 2");
        metodo2();
        System.out.println("Fim do método 2");
    }
}
