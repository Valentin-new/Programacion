package ud3;

import java.util.Scanner;

//22. Que calcule la media de 10 números.
public class H2Ej22 {

	public static void main(String[] args) {
		//Habilitamos la entrada por teclado
		Scanner entrada=new Scanner(System.in);
		//declaración variables
		int i,num;
		double media=0,suma=0;
		for (i=1;i<=10;i++) {
			System.out.println("Introduce un numero");
			//leer num
			num=entrada.nextInt();
			suma=suma+num;
		}
		media=suma/10;
		System.out.println("La media es:"+media);
		
		

	}

}
