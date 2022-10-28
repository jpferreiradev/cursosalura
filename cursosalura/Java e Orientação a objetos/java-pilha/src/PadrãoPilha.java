public class PadrãoPilha {

    public static void main(String args[]){
        System.out.println("Inicialização do main");
        metodo1();
        System.out.println("Fim do método main");
    }

    private static void metodo1(){
        System.out.println("Inicialização do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }
    private static void metodo2(){
        System.out.println("Inicializando o método 2");
        System.out.println("Fim do método 2");
    }
}
