package java_primeros_pasos;

public class TipoVariable {

	public static void main(String[] args) {
		System.out.println("Hello paps");
		
		int edad = 33;
		System.out.println(edad);
		
		//edad = 37;
		//System.out.println(edad);
		
		edad = 55+11;
		System.out.println("Mi edad es: " + edad+" años, awebito");
		
		double salario = 1250.50; 
		double salarioMitad = salario / 2;
		System.out.println("El salario es: "+salario + " y la mitad es: "+salarioMitad);
		int division = 1250 / 3;
		System.out.println(division);
		
		//Convertir Decimal a entero (Double to Int)
		double variable1 = 230.89; 
		int variable1Entero = (int) variable1; //Casi trunca, pero solo evita los números decimales
		
		System.out.println("Variable convertida a entero, sin decimal: "+variable1Entero+", mientras que la variable oriinal es 230.89");
		
		//Datos numéricos:
		//long prueba = 1222222222222222222L;
		//short numeroChico = 1355;
		//byte numeroMaschico = 15;
		//float numeroDecimalPequenio = 2.5F;
		
		
		//Suma entero y decimal
		double resultado =(int) variable1 + variable1Entero;
		System.out.println("\n\nAhora sumamos una varible decimal y una entera \nConseguimos lo siugiente: "+resultado);

		
	}
	
}
