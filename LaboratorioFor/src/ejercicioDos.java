import java.util.Scanner;

public class ejercicioDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		// E J E R C I C I O 3
		for (int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		// E J E R C I C I O 4
		
		int sumatoria= 0;
		
		for (int i=0; i<=10; i++) {
			if ((i%2!=0)) {
				sumatoria += i;
			}
		}
		System.out.println("La sumatoria de los impares del 1 al 10 es: "+ sumatoria);
		
		System.out.println();
		// E J E R C I C I O 5
		int sumar= 0, producto=1;
		
		for (int i=1; i<=5; i++) {
			sumar+=i;
			producto*=i;
		}
		int resta=producto-sumar;
		
		System.out.println("La resta entre el producto: "+ producto + " y la suma: "+ sumar + " es: "+ resta);
		

		System.out.println();
		// E J E R C I C I O 6
		
		for (int i=1;i<5;i++) {
			System.out.println("@");
		}
		
		
		
		
		
	}

}
