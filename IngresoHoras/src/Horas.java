import java.util.Scanner;

public class Horas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horasTot=0, semanas=0, dias=0, horas=0, restoSemanas = 0;
		
		Scanner identificador = new Scanner(System.in);
				
		System.out.println("Ingrese hs totales");
		horasTot = identificador.nextInt();
		
		//CALCULOS
		semanas = horasTot/168; //24*7
		
		restoSemanas = horasTot%(168);
		
		dias=restoSemanas/24;
		
		horas = restoSemanas%24;
		
				
		System.out.println("Semanas: " + semanas);
		System.out.println("Dias: " + dias);
		System.out.println("Horas: " + horas);
	}

}
