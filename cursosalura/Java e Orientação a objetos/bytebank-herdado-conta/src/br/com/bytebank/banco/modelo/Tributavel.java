package br.com.bytebank.banco.modelo;

public interface Tributavel {

    double getValorImposto();

}

/*
 Normalmente não é utilizado quando colocamos os nossos atributos abstratos que ele é publico e nem abstrato. Já padrão no uso das interfaces

   public abstract double getValorImposto();
 */
