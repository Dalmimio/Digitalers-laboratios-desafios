package desafioModulo5;

import java.util.Arrays;

public class ejercicioUno {

	public static void main(String[] args) {
		int total=0, maximo=0, repite=0;
		int vec [] = {10,20,5,15,30,20};
		
		for (int i=0; i<=5;i++) {
			total += vec[i];
			if (vec[i]%2!=0) {
				System.out.println("Indice "+ i + " valor: "+ vec[i] + " es impar.");
			}
			if (vec[i]>maximo) {
				maximo=vec[i];
			}
			if (vec[i]==20) {
				repite++;
			}
		}
		
		System.out.println("El valor maximo es: " + maximo);
		System.out.println("El valor 20 se repite " + repite+ " veces");
		System.out.println("La suma total es: " + total);

	}
	
	
}
