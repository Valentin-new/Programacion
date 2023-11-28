package ud3;
//10. Que imprima la suma de todos los números 
// impares que van del 1 al 100 y diga cuántos
// hay.
public class H2Ej10 {

	public static void main(String[] args) {
		int i;
		int cont=0;
		int suma=0;
		for (i=1;i<=100;i=i+2) {
			suma=suma+i;
			cont=cont+1;
		}
		System.out.println("suma:"+suma+" cont:"+cont);
		

	}

}
