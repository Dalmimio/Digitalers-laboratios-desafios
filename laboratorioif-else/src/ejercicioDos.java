import java.util.Scanner;

public class ejercicioDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		short temperatura;
		String tiempo;		
		System.out.println("¿Cómo está el tiempo hoy?: ");
		System.out.println("soleado - lluvia - nieve ");
		
		System.out.print("Ingresa el clima: ");
		tiempo = teclado.next();
		
		System.out.print("Ingresa la temperatura: ");
		temperatura = teclado.nextShort();
		
		System.out.print("El clima está perfecto para ");
		
		if (tiempo.equalsIgnoreCase("soleado")) {
			if (temperatura > 25) {
				System.out.println("salir a caminar y tomar sol");
			}
			if (temperatura <= 25 && temperatura > 15) {
				System.out.println("para salir a caminar ");
			}
			if (temperatura<=15) {
				System.out.println("salir a caminar con campera ");
			}
			
		}else if(tiempo.equalsIgnoreCase("lluvia")&& temperatura==10){
			System.out.println("quedarse en casa o salir con paraguas y campera");
		} else {
			System.out.println("salir a esquiar");
		}

	}

}
