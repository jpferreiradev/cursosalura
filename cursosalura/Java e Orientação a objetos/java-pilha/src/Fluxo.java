public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicialização do main"); // Passo 1
        metodo1(); // Passo 2
        System.out.println("Fim do main"); // Passo 3
    }
    private static void metodo1(){
        System.out.println("Inicialização do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    private static void metodo2(){
        System.out.println("Inicialização d o metodo2");
        for(int i = 1; i <= 5;i++){
            System.out.println(i);
        }
        System.out.println("Fim do metodo2");
    }
}
