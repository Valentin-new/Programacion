package primer_trimestre;
// mostrar solo numeros pares 
public class ejercicio4_hoja4 {
	public static void main (String [] args) {
		//definimos los arrrays de numeros
		int [] numeros;
		int cont=0;
		//construimos el array de 100 numeros
		numeros=new int[100];
		//metemos 100 numeros en el array
		for(int i=0;i<100;i++) {
			cont= cont+2;
			numeros[i]=cont;
			System.out.println(numeros[i]);
		}
	}
}
