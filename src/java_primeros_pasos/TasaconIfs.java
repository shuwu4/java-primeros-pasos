package java_primeros_pasos;

public class TasaconIfs {

	    public static void main(String[] args) {

	        double salario = 3300.0;
	        // ifs aqui
	        if(salario>=1900.0 && salario<=2800.0) {
	        	System.out.println("El IR es del 7.5% y se pueden deducir 142.");
	        }
	        else if(salario>=2800.01 && salario <= 3751.0) {
	        	System.out.println("El IR es del 15% y se pueden deducir 350");
	        }
	        else if(salario>=3751.01 && salario <= 4664.0) {
	        	System.out.println("El IR es de 22.5% y se pueden deducir 636");
	        }
	        else {
	        	System.out.println("Hubo un error al momento de deducir");
	        }
	    }
	
}
