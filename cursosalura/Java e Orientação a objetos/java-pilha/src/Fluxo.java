public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicialização do main"); // Passo 1
        try {
            metodo1(); // Passo 2
        } catch (ArithmeticException | NullPointerException ex){
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main"); // Passo 3
    }

    private static void metodo1() {
        System.out.println("Inicialização do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicialização do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0;
            //Conta c = null;
            //c.deposita();
        }
            System.out.println("Fim do metodo2");
        }
    }

/*

} catch (ArithmeticException | NullPointerException ex){ // Nova forma para ter varios catchs
            //String msg = ex.getMessage();
            //System.out.println("ArithmeticException" + msg);
            ex.printStackTrace();
        } catch (NullPointerException ex){
            String msg = ex.getMessage();
            System.out.println("NullPointerException - Isso aqui é uma exceção" + msg);
            //ex.printStackTrace();

 */

