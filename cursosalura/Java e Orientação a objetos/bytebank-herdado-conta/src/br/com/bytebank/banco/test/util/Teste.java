package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

    public static void main(String[] args) {

       ArrayList lista = new ArrayList();

        //Conta cc = new ContaCorrente(22,11);
        Cliente cliente = new Cliente();
        lista.add(cliente);

        Conta cc2 = new ContaCorrente(22,22);
        lista.add(cc2);


        System.out.println("Tamanho: " + lista.size());
        //Object ref =   lista.get(0); -> Transformando referencia generica e uma referencia especifica
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho:" + lista.size());

        Conta cc3 = new ContaCorrente(33,311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 332);
        lista.add(cc4);


        //  for, código legado
        for(int i = 0;i < lista.size(); i++){
           Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("-------------");

        // Forma nova de usar o for hoje me dia
        for(Object oRef : lista){
            System.out.println(oRef);
        }


    }






    //Conta cc2 = new ContaCorrente(22,22);
    //lista.add(cc2);






}
