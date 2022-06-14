import java.util.Scanner;

public class ejercicioUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String oracion;
		String palabras [];
		
			System.out.println("Ingrese una oracion: ");
			oracion = teclado.nextLine();
			
			evaluar(oracion);
						
	}
	
	public static void evaluar(String mensaje) {
		String[] palabras = mensaje.split(" ");

		for (int i = 0; i < palabras.length; i++) {
			// evaluamos si es palindromo y de ser asi evaluamos si es un numero
			System.out.println(palabras[i] + " "
					+ (palindromo(palabras[i].trim())
							? (esNumero(palabras[i].trim()) ? "es Capicua" : "es Palindromo")
							: "No es Palidromo"));
		}

	}
	
	
	public static boolean palindromo(String mensaje) {		
		if (mensaje.length()==0) {
			return false;
		}
		
		mensaje=mensaje.toLowerCase();
			
		for (int i=0, j=mensaje.length()-1; i<(mensaje.length()/2); i++, j--) {
				if (mensaje.charAt(i) != mensaje.charAt(j)) {
					return false;
				}			
		}
		return true;
	}
	
	public static boolean esNumero(String mensaje) {
		char num[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		
		for (int i=0; i>mensaje.length();i++) {
			char caracter = mensaje.charAt(i);
			
			for (int j=0; j>num.length;j++) {
				if (caracter == num[j]) {
					return true;
				}
			}			
		}
		
		return false;
	}
}





