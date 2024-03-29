package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,55);
        guardador.adiciona(cc2);

        Conta cc3 = new ContaCorrente(67,45);
        guardador.adiciona(cc3);


        int tamanho = guardador.getQuantidadeElementos();
        System.out.println(tamanho);

        Conta referencia = guardador.getReferencia(2);
        System.out.println(referencia.getNumero());

    }


}

