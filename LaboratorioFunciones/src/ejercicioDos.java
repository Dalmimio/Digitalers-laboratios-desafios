import java.util.Scanner;

public class ejercicioDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
        Crear una función suma que reciba dos parámetros, uno de tipo entero y otro de tipo double, 
		que realice la suma y retorne la suma de ambos 
		como un double
        */
		Scanner teclado = new Scanner(System.in);
		int a;
		double b;
		
		System.out.println("Ingresa dos numeros: ");
		System.out.print("numero a: ");
		a=teclado.nextInt();
		System.out.println();
		
		System.out.print("numero b: ");
		b=teclado.nextDouble();
		
		System.out.print("El resultado es: " + suma(a,b));
		
	}
	
	public static double suma(int primero, double segundo) {
		double resultado = primero + segundo;
		
		return resultado;	
		
	}
}
