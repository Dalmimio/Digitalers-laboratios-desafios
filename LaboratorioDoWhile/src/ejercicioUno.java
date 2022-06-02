import java.util.Scanner;

public class ejercicioUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int numero, mayor=0, menor=0, sumatoria=0;
		System.out.println("Ingrese un número, para salir ingrese 0");
		numero = teclado.nextInt();
		
		do {
			sumatoria+=numero;
			
			mayor=Math.max(mayor, numero);
			menor=Math.min(menor, numero);
			
			
			System.out.println("Ingrese un número, para salir ingrese 0");
			numero = teclado.nextInt();
			
		} while (numero != 0);
		
		System.out.println("La sumatoria es: "+sumatoria+"\nEl menor es: "+menor+"\nEl mayor es: "+ mayor);
		
	}

}
