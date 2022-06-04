
public class ejerciocioUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float interesMensual = 0.02f, inversion = 1000f, acumulado;
		
		for (int i=1; i<=12; i++) {
			acumulado = inversion*interesMensual;
			inversion+=acumulado;
		}
		
		System.out.println("La cantidad que esta persona obtendra al finalizar el año es de: "+ inversion);
		System.out.println();
		
		int acumulador=0;
		for (int i=1; i<=25; i++) {
			if(i%2==0) {
				acumulador+=i;
			}
			
		}
		System.out.println("La suma de los numero pares del 1 al 25 es: "+ acumulador);
		
		
		
	}

}
