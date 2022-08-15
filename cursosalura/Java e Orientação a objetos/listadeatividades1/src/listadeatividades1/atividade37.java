package listadeatividades1;

import java.awt.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade37 {

    public static void main(String args[]){

        Scanner sae = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");

        System.out.println("Informe o seu salário:");
        double valorDoSalario = sae.nextDouble();
        System.out.println("O seu salário atual é " + valorDoSalario);
        System.out.println("Informe a quantidade de anos trabalhados empresa:");
        int quantidadeAnosTrabalho = sae.nextInt();
        System.out.println("Você trabalhou " + quantidadeAnosTrabalho + " anos na empresa");

        System.out.println("Informe qual é o seu gênero, digite M para ( Homem) ou F para (Mulher)");
        char qualGenero = sae.next().charAt(0);
        System.out.println(qualGenero);

        char sexMas = 'm';
        char sexFem = 'f';

        //double valorReajuste = 0;
        double valorSalarioReajusteMulher;
        double valorSalarioReajusteHomen;

        double conversaoSalarioAjustado;

        if(qualGenero == sexFem){
            System.out.println("Sexo feminino");
            if(quantidadeAnosTrabalho < 15){
                conversaoSalarioAjustado = ( valorDoSalario * 5 ) / 100;
                valorSalarioReajusteMulher = conversaoSalarioAjustado + valorDoSalario;
                System.out.println("Seu novo salário é de " + df.format(valorSalarioReajusteMulher));

            } else if (quantidadeAnosTrabalho > 15 && quantidadeAnosTrabalho < 20) {
                conversaoSalarioAjustado = ( valorDoSalario * 12) / 100;
                valorSalarioReajusteMulher = conversaoSalarioAjustado + valorDoSalario;
                System.out.println("Seu novo salário é de " + df.format(valorSalarioReajusteMulher));

            } else if (quantidadeAnosTrabalho > 20) {
                conversaoSalarioAjustado = ( valorDoSalario * 23) / 100;
                valorSalarioReajusteMulher = conversaoSalarioAjustado + valorDoSalario;
                System.out.println("Seu novo salário é de " + df.format(valorSalarioReajusteMulher));

            }


        } else {
            System.out.println("Sexo masculino");
            if(quantidadeAnosTrabalho < 20){
                conversaoSalarioAjustado = ( valorDoSalario * 3 ) / 100;
                valorSalarioReajusteHomen = conversaoSalarioAjustado + valorDoSalario;
                System.out.println("Seu novo salário é de" + df.format(valorSalarioReajusteHomen));

            } else if (quantidadeAnosTrabalho > 20 && quantidadeAnosTrabalho < 30) {
                conversaoSalarioAjustado = ( valorDoSalario * 13 ) / 100;
                valorSalarioReajusteHomen = conversaoSalarioAjustado + valorDoSalario;
                System.out.println("Seu novo salário é de" + df.format(valorSalarioReajusteHomen));

            } else if (quantidadeAnosTrabalho > 30) {
                conversaoSalarioAjustado = ( valorDoSalario * 25 ) / 100;
                valorSalarioReajusteHomen = conversaoSalarioAjustado + valorDoSalario;
                System.out.println("Seu novo salário é de" + df.format(valorSalarioReajusteHomen));
            }


        }


    }
}




