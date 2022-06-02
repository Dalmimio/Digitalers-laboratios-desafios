import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		/*2. Mostrar los resultados con doble precisión 
		(20 decimales) y sin decimales*/
		
		
		System.out.println("Ingrese dos números con decimales simples o de una sola precisión");
		Scanner scanner = new Scanner(System.in);
		
		float numeroUno;
		float numeroDos;
		float suma;
		float resta;
		
		System.out.println("Ingrese el primero: ");
		numeroUno = scanner.nextFloat();
		System.out.println();
		System.out.println("Ingrese el segundo: ");
		numeroDos = scanner.nextFloat();		
		
		suma = numeroUno+numeroDos;
		resta = numeroUno-numeroDos;
		System.out.println();
		
		System.out.println("Multiplicacion entre 1 y 2: "+ numeroUno*numeroDos);
		System.out.println("División entre el 1 y 2: "+ numeroUno/numeroDos);
		System.out.println("Suma entre el 1 y 2: "+ suma);
		System.out.println("Resta entre el 1 y 2: "+ resta);
		
		double numero1doble = numeroUno;
		double numero2doble = numeroDos;
		double sumaDoble = suma;
		double restaDoble = resta;
		double divDoble = numero1doble/numero2doble;
		double multDoble = numero1doble*numero2doble;
		System.out.println();
		System.out.println("Resultados con doble presición: ");
		System.out.println("Multiplicacion entre 1 y 2: "+ multDoble);
		System.out.println("División entre el 1 y 2: "+ divDoble);
		System.out.println("Suma entre el 1 y 2: "+ sumaDoble);
		System.out.println("Resta entre el 1 y 2: "+ restaDoble);
		
		int numero1int = (int) numeroUno;
		int numero2int = (int) numeroDos;
		int sumaInt = (int) suma;
		int restaInt = (int) resta;
		int divInt = (int) divDoble;
		int multInt = (int) multDoble;
		System.out.println();
		System.out.println("Resultados enteros: ");
		System.out.println("Multiplicacion entre 1 y 2: "+ multInt);
		System.out.println("División entre el 1 y 2: "+ divInt);
		System.out.println("Suma entre el 1 y 2: "+ sumaInt);
		System.out.println("Resta entre el 1 y 2: "+ restaInt);
		

	}

}
