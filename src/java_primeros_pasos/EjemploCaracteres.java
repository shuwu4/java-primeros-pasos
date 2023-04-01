package java_primeros_pasos;

public class EjemploCaracteres {
	
	public static void main(String[] args) {
	
		char caracter = 'c';
		System.out.println(caracter);
		
		caracter = 65;
		System.out.println(caracter);
		
		caracter = 65 + 1;
		char segundoCaracter = (char) (caracter +1);
		System.out.println(segundoCaracter);
		
		String word = "Hello my baby";
		System.out.println(word);
		
		word = word + "\nHello my honey";
		System.out.println(word);
		
		String cuota1 = "10";
		String cuota2 = "20";
		System.out.println (cuota1 + cuota2);
}
	
}
