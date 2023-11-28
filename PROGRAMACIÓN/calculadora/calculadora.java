package entornos_de_desarrollo;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		//habilitamos la entrada por teclado
		Scanner entrada =new Scanner(System.in);
		
		int num=entrada.nextInt();
		//limpiamos buffer: capturamos el enter
		entrada.next().line
		
		//declaro las variables
		double numero1, numero2,resultado;
		int suma;
		//la idea es selecionar una letra 
		char letra = entrada.nextLine().charAt(0);
		char ='s';
		char ='n';
		char ='m';
		char ='d';
		char ='a';
		//menú
		do {
			
			System.out.println("Eliga letra para hacer una operación matemática");
			System.out.println("Eliga s o S para SUMAR");
			if 
			System.out.println("Eliga r o R para RESTAR ");
			System.out.println("Eliga m o M para MULTIPLICAR");
			System.out.println("Eliga d o D para DIVIDIR");
			
			//leemos opcion
			switch(letra) {
			//caso letra s
			case 1:
				System.out.println("Ha elegido s o S para SUMAR");
				suma = numero1+numero2;
			break;	
			//caso letra r
			case 2:
				System.out.println("Ha elegido r o R para RESTAR");
				resta = numero1-numero2;
			break;	
			//caso letra m 
			case 3:
				System.out.println("Ha elegido r o R para RESTAR");
				resta = numero1-numero2;
			break;	
			//caso letra d
				System.out.println("Ha elegido m o M para MULTIPLICAR");
				multiplicacion = numero1*numero2;
			case 4:
				System.out.println("Ha elegido d o D para DIVIDIR");
				dividir = numero1/numero2;
			break;	
			//caso letra a
			case 5:
				
			break;	
			}
			
			
		}while(letra!='s'); {
			
		}
	}

}
