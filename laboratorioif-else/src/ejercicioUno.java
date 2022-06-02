import java.util.Scanner;

public class ejercicioUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String user, contra;
		
		System.out.print("Ingrese usuario :");
		user = teclado.nextLine();
		
		System.out.print("Ingrese su contraseña: ");
		contra = teclado.nextLine();
		
		if (user.equals("usuario") && contra.equals("clave")) {
			System.out.println("Bienvenido al sistema :P");
		}else {
			System.out.println("Credenciales incorrectas x-x ");
		}
	}

}
