import java.util.Scanner;

public class ejercicioTres {

	public static void main(String[] args) {
		/*
		 Escribir un programa que tenga un procedimiento 
		 llamado mensaje, que imprima una palabra e 
		 invocar ese procedimiento 5 veces
		 */
		
		String palabra;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa la palabra que queres repetir: ");
		palabra=teclado.nextLine();
		
		for (int i=0; i<5; i++) {
			mensaje(palabra);
		}

	}
	
	public static void mensaje(String palabra) {
		
			System.out.println(palabra);
		
	}

}
