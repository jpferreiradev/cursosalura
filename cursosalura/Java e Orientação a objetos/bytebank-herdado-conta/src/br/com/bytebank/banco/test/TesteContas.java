package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
//import java.lang.




//br.com.bytebank.banco.test.TesteContas CQN -> Nome verdadeiro da classe
public class TesteContas {
    
	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException{

       
		ContaCorrente cc = new ContaCorrente(111,111);
        ContaCorrente ff = new ContaCorrente(777,4567);
        
        cc.deposita(100.0);
        ff.deposita(400.0);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.0);


        cc.transfere(10.0,cp);

        
        //java.lang.System -> Origem do System, vendo do pacote java.lang
        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}

//ContaEspecial ce = new ContaEspecial(123,5555);
// Acesso só para as filhas usando o proteteted