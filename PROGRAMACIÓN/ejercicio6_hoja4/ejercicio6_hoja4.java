package primer_trimestre;
import java.util.Scanner;
//que guarde 10 numeros y haga operaciones mat.
public class ejercicio6_hoja4 {
	public static void main (String [] args) {
		//Habilitamos la entrada por teclado
		Scanner entrada=new Scanner(System.in);
		// definimos el array que guarda 10 numeros
		int []numeros;
		int suma=0;
		int resta=0;
		int multiplicacion=1;
		double division=1;
		//contrimos el array de 10 posiciones
		numeros=new int[10];
		//Introducimos notas en el array
		for(int i=0;i<10;i++) {
			System.out.print("introduce un valor");
			numeros[i]=entrada.nextInt();
			suma=suma+numeros[i];
			resta=resta-numeros[i];
			multiplicacion=multiplicacion*numeros[i];
			division=division/numeros[i];
		}
		//Mostramos las operaciones realizadas
		System.out.print("El resultado de la suma es: "+suma);
		System.out.print("El resultado de la resta es: "+resta);
		System.out.print("El resultado de la multiplicación es: "+multiplicacion);
		System.out.print("El resultado de la división es: "+division);
	}
}
