
public class CalculandoIR {
	
	public static void main (String[] args) {
		 
		double salario = 3.845;
		//double porcentagem;
		// 3300.0
		
		
		if (salario <= 2.800) {
			System.out.println("Foi descontado a porcentagem de 7.5% no seu sal�rio");
		} else {
			System.out.println("N�o foi descontado do seu sal�rio");
		}
		
		if ( salario <= 3.751) {
			System.out.println("Foi descontado a porcentagem de 15% no seu sal�rio");
		} else {
			System.out.println("N�o foi descontado do seu sal�rio");
		}
	
		if (salario <= 4.664) {
			System.out.println(" Foi descontado a porcentagem de 22.5% no seu sal�rio");
		} else {
			System.out.println("N�o foi descontado do seu sal�rio");
		}
		
	}
}

// Refatorar esse c�digo
/*
 double salario = 3300.0;

        if(salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("A sua aliquota � de 7%");
            System.out.println("Voc� pode deduzir at� R$ 142");
        
        } else if(salario >= 2800.01 && salario <= 375	1.0) {
            System.out.println("A sua aliquota � de 15%");
            System.out.println("Voc� pode deduzir at� R$ 350");
        
        } else if(salario >= 3751.01 && salario <= 4664.0) {
            System.out.println("A sua aliquota � de 22.5%");
            System.out.println("Voc� pode deduzir at� R$ 636");
        }
    }
}











*/