import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);

		char letra;
		System.out.println("¡Gracias por contactarte con nosotros!");
		System.out.println("¿En qué podemos ayudarte?");
		System.out.println("A) Documentación \nB) Cotización \nC) Asistencia \nD) Siniestros\nE) Información de pagos\nF) Otras consultas\nG) Anulación");
		
		System.out.print("Escribe la letra de la opción elegida: ");
		letra = teclado.next().charAt(0);
		
		switch (letra){
			case 'A':
				System.out.println("Ha seleccionado Documentación");
				break;
			case 'B':
				System.out.println("Ha seleccionado Cotización");
				break;
			case 'C':
				System.out.println("Ha seleccionado Asistencia");
				break;
			case 'D':
				System.out.println("Ha seleccionado Información de pagos");
				break;
			case 'E':
				System.out.println("Ha seleccionado Otras consultas");
				break;
			case 'G':
				System.out.println("Ha seleccionado Anulación");
				break;
		}
	}

}
