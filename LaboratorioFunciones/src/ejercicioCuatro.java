import java.util.Scanner;

public class ejercicioCuatro {

	public static void main(String[] args) {
		/*
		 * Escribir una funci�n que retorne un String, que 
		reciba un par�metro de tipo String llamado
		�nombre� y retorne el mensaje �Hola� y el 
		valor del par�metro enviado. 
		Invocar esa funci�n desde nuestro programa 
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
