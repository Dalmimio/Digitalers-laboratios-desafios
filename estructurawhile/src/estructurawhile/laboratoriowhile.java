package estructurawhile;

import java.util.Scanner;

public class laboratoriowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		// E J E R C I C I O 1
		
		int numero, sumatoria=0;
		
		System.out.println("Ingrese un n�mero, para salir, ingrese 0");
		numero = teclado.nextInt();
		
		while (numero != 0) {
			if (numero==0) {
				break;
			}else {
				sumatoria+= numero;
			}
			System.out.println("Ingrese un n�mero, para salir, ingrese 0");
			numero = teclado.nextInt();
		}
		System.out.println("La suma total es: " + sumatoria);
		
		// E J E R C I C I O 2

		int i =1;
		
		while (i<=10) {
			
			if (i!=2 && i!=5 && i!=9) {
				System.out.println(i);
			}
			i++;
		}
		
		
		// E J E R C I C I O 3
		
		int n=1;
				
		while (n<=30) {
			
			if ((n<=10) | (n>=20)) {
				System.out.println(n);
			}
			n++;
		}
		

		// E J E R C I C I O 4
		
		System.out.print("La sumatoria de los n�meros del 1 al 10 es: ");
		
		int sumar=0, contador=1;
		
		while (contador<=10) {
			sumar+=contador;
			
			contador++;
		}
		System.out.println(sumar);
		
	}

}
