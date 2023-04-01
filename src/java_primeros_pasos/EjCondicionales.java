package java_primeros_pasos;

public class EjCondicionales {

	public static void main(String[] args) {

		System.out.println("Comensemen: \n");

		int edad = 10;
		int cantidad = 2;
		if (edad >= 18) {
			System.out.println("Puede pasar");
			System.out.println("Bienvenido");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad, pero puede accesar");
			} else {
				System.out.println("Usted, ha sido rechazado");
			}

		}
	}

}
