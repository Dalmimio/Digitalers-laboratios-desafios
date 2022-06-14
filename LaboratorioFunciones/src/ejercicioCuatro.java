import java.util.Scanner;

public class ejercicioCuatro {

	public static void main(String[] args) {
		/*
		 * Escribir una función que retorne un String, que 
		reciba un parámetro de tipo String llamado
		“nombre” y retorne el mensaje “Hola” y el 
		valor del parámetro enviado. 
		Invocar esa función desde nuestro programa 
		e imprimir el resultado por consola
		 */
		String palabra;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		palabra=teclado.nextLine();
		
		saludo(palabra);

	}
	
	public static void saludo (String nombre) {
		System.out.println("Hola "+ nombre+ "!!");
	}

}
