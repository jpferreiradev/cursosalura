
public class CalculandoIR {
	
	public static void main (String[] args) {
		 
		double salario = 3.845;
		//double porcentagem;
		// 3300.0
		
		
		if (salario <= 2.800) {
			System.out.println("Foi descontado a porcentagem de 7.5% no seu salário");
		} else {
			System.out.println("Não foi descontado do seu salário");
		}
		
		if ( salario <= 3.751) {
			System.out.println("Foi descontado a porcentagem de 15% no seu salário");
		} else {
			System.out.println("Não foi descontado do seu salário");
		}
	
		if (salario <= 4.664) {
			System.out.println(" Foi descontado a porcentagem de 22.5% no seu salário");
		} else {
			System.out.println("Não foi descontado do seu salário");
		}
		
	}
}

// Refatorar esse código
/*
 double salario = 3300.0;

        if(salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("A sua aliquota é de 7%");
            System.out.println("Você pode deduzir até R$ 142");
        
        } else if(salario >= 2800.01 && salario <= 375	1.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350");
        
        } else if(salario >= 3751.01 && salario <= 4664.0) {
            System.out.println("A sua aliquota é de 22.5%");
            System.out.println("Você pode deduzir até R$ 636");
        }
    }
}











*/