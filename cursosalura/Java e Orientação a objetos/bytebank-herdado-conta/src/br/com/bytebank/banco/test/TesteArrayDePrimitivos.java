package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

    // Array[]
    public static void main(String[] args) {


        int idades [] = new int[5]; // inicializa o array com os valores padrões

        // Exemplo de arrays com laços
        for(int i = 0; i < idades.length;i++){
            idades[i] = i * i;

        }

        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }

    }
}


/*

idades[0] = 29;
        idades[1] = 45;
        idades[2] = 56;
        idades[3] = 67;
        idades[4] = 78;

        System.out.println(idades.length);

        //System.out.println("O tamanho do meu Array é de " + idades.length);



 */



