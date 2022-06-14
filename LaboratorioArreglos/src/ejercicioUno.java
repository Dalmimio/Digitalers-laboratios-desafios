import java.util.Scanner;

public class ejercicioUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int cantidad, maximo,numero;
		
		System.out.println("Ingrese la cantidad de números que deseas ver: ");
		cantidad = teclado.nextInt();
		
		System.out.println("Ingrese el numero maximo sugerido: ");
		maximo = teclado.nextInt();
		
		for (int i=0; i<=maximo;i++) {
			
			numero = (int) (Math.random()*(maximo - 1 + 1))+ 1;
			
			if (numero%2==0 ) {
				System.out.println("el numero: "+ numero + " es primo");
			}else {
				System.out.println("el numero: "+ numero + " no es primo");
			}
			
			
		}
		
		

	}

}
