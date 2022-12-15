package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String args[]){

    	ContaCorrente cc = new ContaCorrente (222,333);
    	ContaCorrente vv = new ContaCorrente (555,777);
        cc.deposita(100.0);
        vv.deposita(500.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(cc);
        calc.registra(seguro);
        //calc.registra(vv);

        System.out.println(calc.getTotalImposto());
    }
}
