package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args){


        Object[] referencias =  new Object[5];

        System.out.println(referencias.length);

        ContaCorrente cc1 = new ContaCorrente(890,678);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(456,321);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;



        ContaPoupanca referencia = (ContaPoupanca) referencias[1]; // 1 exemplo de referencia de arrays / type cast
        System.out.println(cc2.getNumero()); // 2 exemplo de referencias de arrays
        System.out.println(referencia.getNumero()); // 3 exemplo de referencias de arrays



    }
}

//String teste[] = new String[5]; => Exemplo de como se faz um array!


// Forma literal de fazer um array
//int[] teste = {1,2,3,4,5};

//System.out.println(cc2.getNumero());

// Object referenciaGenerica = contas[1];//System.out.println(referenciaGenerica.getNumero());