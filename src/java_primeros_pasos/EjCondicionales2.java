package java_primeros_pasos;

public class EjCondicionales2 {

		public static void main(String[] args) {
			
			System.out.println("Comensemen: \n");

			int edad = 18;
			int personas = 2;
			//  || or
			//  && a
			// == si es igual a
			boolean esPareja = personas >1;
			boolean puedeEntrar = edad >= 18 && esPareja==true;
			if (puedeEntrar) {
				System.out.println("Puede pasar");
				System.out.println("Bienvenido");
			}  
			
			else {
					System.out.println("Usted, ha sido rechazado");
			}
		
		}
	
}
