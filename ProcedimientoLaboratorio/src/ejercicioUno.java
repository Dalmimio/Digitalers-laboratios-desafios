import java.util.Scanner;

public class ejercicioUno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float numUno, numDos;
		char op;
		
		System.out.println("Ingrese un numero: ");
		numUno=teclado.nextFloat();
		
		System.out.println("Ingrese otro numero: ");
		numDos=teclado.nextFloat();
		
		System.out.println("Ingrese la operación que sea realizar: \nSuma: +\nResta: -\nProducto: *\nDivision: / \nResto: % ");
		op=teclado.next().charAt(0);
		
		operaciones(numUno, numDos, op);
		

	}
	
	public static void operaciones(float num1, float num2, char operacion) {
		float resultado;
		switch(operacion){
			case '+': 
				resultado=num1+num2;
				System.out.println("El resultado de la suma es: "+ resultado);
				break;
			case '-': 
				resultado=num1-num2;
				System.out.println("El resultado de la resta es: "+ resultado);
				break;
			case '*': 
				resultado=num1*num2;
				System.out.println("El resultado del producto es: "+ resultado);
				break;
			case '/': 
				resultado=num1/num2;
				System.out.println("El resultado de la división es: "+ resultado);
				break;
			case '%': 
				resultado=num1%num2;
				System.out.println("El resultado del resto es: "+ resultado);
				break;
		}
	}

}
