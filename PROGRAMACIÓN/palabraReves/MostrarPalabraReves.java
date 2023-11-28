package entornos_de_desarrollo;

import java.util.Scanner;

public class MostrarPalabraReves {
	public static void main(String[] args) {
		//array de caracteres de tamaño5
		char[]palabra;
		palabra=new char[4];
		//habilitamos la lectura por teclado
		Scanner entrada=new Scanner(System.in);
		
		//rellenamos el array
		for (int i=0;i<4;i++) {
			System.out.println("introduce una letra: ");
			palabra[i]=entrada.next().charAt(0);
		}
		//mostramos la palabra en su orden
		for (int i=0;i<4;i++) {
			System.out.println(palabra[i]);
		}
		System.out.println();
		for (int i=3;i<4;i--) {
			System.out.println(palabra[i]);
		}
	}

}
