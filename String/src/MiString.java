import java.util.Scanner;

public class MiString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		String parrafoUno;
		String parrafoDos;
		
		System.out.println("Ingrese un parrafo: ");
		parrafoUno = scanner.nextLine();
		
		System.out.println("Ingrese otro parrafo: ");
		parrafoDos = scanner.nextLine();
		
		System.out.println("Son iguales los parrafos?: " + (parrafoUno == parrafoDos));
		
	 System.out.println("Son iguales en contenido? : " + parrafoUno.equalsIgnoreCase(parrafoDos));
		 System.out.println("Todo May�scula: ");
		 System.out.println(parrafoUno.toUpperCase() + "\n" + parrafoDos.toUpperCase());
		 
		 System.out.println("Todo Min�scula: ");
		 System.out.println(parrafoUno.toLowerCase() + "\n" + parrafoDos.toLowerCase());
		 
		 System.out.println("Primera letra en May�scula");
		 String pa1 = parrafoUno.substring(0, 1).toUpperCase() + parrafoUno.substring(1);
		 String pa2 = parrafoDos.substring(0, 1).toUpperCase() + parrafoDos.substring(1);		 
		 System.out.println(pa1);
		 System.out.println(pa2);
		 
		 System.out.println("Primera letra en Min�scula");
		 String pa11 = parrafoUno.substring(0, 1).toLowerCase() + parrafoUno.substring(1);
		 String pa22 = parrafoDos.substring(0, 1).toLowerCase() + parrafoDos.substring(1);
		 System.out.println(pa11);
		 System.out.println(pa22);
		 
		 System.out.println("Unidos por una coma: ");
		 System.out.println(String.join(", ",parrafoUno, parrafoDos));

	}

}