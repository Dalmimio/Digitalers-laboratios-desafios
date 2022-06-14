import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicioUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inicializacion de variables
		
		String oracion;
		String palabraUno;
		String  [] palabras;
		 
		int cantRepeticiones=0;
		Scanner teclado = new Scanner(System.in);
		
		//bucle para ingresar oracion
		
		do {
			System.out.println("Ingrese una oracion (no puede estar vacia): ");
			oracion = teclado.nextLine();
		}while(oracion=="");
		
		palabras = oracion.split(" ");
				
		for (int i=0; i<palabras.length; i++) {
			palabraUno = palabras[i];
		
			for (int j=i+1; j<palabras.length; j++) {
				
				if (palabras[j].equalsIgnoreCase(palabraUno)) {
					cantRepeticiones++;
				}
				
			}
		}
		
		
		
		System.out.println("En la oracion hay " + cantRepeticiones + " palabras repetidas");
		System.out.println("En la oracion hay " + palabras.length + " palabras");
		
		
		
	}

}
