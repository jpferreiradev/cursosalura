import java.util.Scanner;

public class atividade37 {
    public static void main(String args[]){

        Scanner sae = new Scanner(System.in);

        System.out.println("Informe o seu salário:");
        double valorDoSalario = sae.nextDouble();
        System.out.println("O seu salário atual é " + valorDoSalario);
        System.out.println("Informe a quantidade de anos trabalhados empresa:");
        int quantidadeAnosTrabalho = sae.nextInt();
        System.out.println("Você trabalhou " + quantidadeAnosTrabalho + " anos na empresa");

        System.out.println("Informe qual é o seu gênero:");
        char qualGenero = sae.next().charAt(0);
        System.out.println(qualGenero);
        char sexMas = 'm';
        char sexFem = 'f';

        if(qualGenero == sexMas){
            System.out.println("Sexo masculino");
        } else {
            System.out.println("Sexo feminino");
        }

    }
}
