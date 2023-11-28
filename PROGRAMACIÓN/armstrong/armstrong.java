package entornos_de_desarrollo;

import java.util.Scanner;

public class armstrong {
	//habilitamos la entrada por teclado
	Scanner entrada=new Scanner(System.in);
	//declaro variables
	int numero=0;
	//menu
	do {
		System.out.println("Introducir número de tres cifras");
		//leemos número
		numero=entrada.nextInt();
		if (numero==153||numero==370||numero==371||numero==407){
			System.out.println("El número introducido es armstrong o narcisista");
		}else {
			System.out.println("El número introducido es armstrong o narcisista");
		}
		
	}while (99<numero<=999) {
		System.out.println("Error: Introducir número de tres cifras.");
	}

}
