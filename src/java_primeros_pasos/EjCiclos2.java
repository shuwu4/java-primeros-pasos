package java_primeros_pasos;

public class EjCiclos2 {

	public static void main(String[] args) {
		System.out.println("Ejemplos de ciclos.");

		int contador = 0;
		int total =0;
		
		while (contador <= 10) { // Compila ciclo si la condición es verdadera
			
			total = total + contador;
			//System.out.println(total);
			// contador += 1;
			contador++;
		}
			System.out.println(total);
	}

}