package desafioModulo5;

public class ejercicioDos {
	public static void main(String[] args) {
		float inflacion []={0.8f, 0.1f, 0.3f, 0.4f, 0.3f, 0.6f, 0.5f, 0.3f, 0.7f, 0.3f, 0.2f, 0.9f};
		String meses[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		float mayor=inflacion[0], menor=inflacion[0], media=0, sumatoria=0;
		int indiceMenor=0, indiceMayor=0;
		
		for (int i=0; i<12;i++) {
			sumatoria += inflacion[i];
			
			if (inflacion[i]>mayor) {
				mayor=inflacion[i];
				indiceMayor=i;
			}
			if (inflacion[i]<menor) {
				menor=inflacion[i];
				indiceMenor=i;
			}
		}
		
		System.out.println("Inflación anual: "+ sumatoria);
		System.out.println("El indice de inflacion más bajo fue en el mes "+ meses[indiceMenor] +" con "+ menor);
		System.out.println("El indice de inflacion más alto fue en el mes "+ meses[indiceMayor] +" con "+ mayor);
		System.out.println("Promedio de inflacion "+ sumatoria/12);
	}
}
