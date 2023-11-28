import java.util.Scanner;

//Autor: Vasile Valentin Vladu

public class calculadora_funciones {
	public static void main(String[] args) {
		//Habilitamos la entrada por teclado en el main
		Scanner entrada = new Scanner(System.in);
		//Declaramos las variables que vamos a usar:
		//1.Variable numero 1 y numero 2
		//2.Resultado
		//3.La letra que indica la oeración matemática a ejecutar
        double op1, op2;
        char letra;
        
        do {
	        //la entrada de del valor letra esta en main para ejecutarse
	        letra = entrada.nextLine().charAt(0);
			
	        //Mostrar el menú
	        mostrar_menu();
	        
			switch (letra) {
		        case 's':
		        case 'S':
		            System.out.println("Ha elegido s o S para SUMAR");
		            System.out.print("Ingrese el primer número: ");
		            op1 = entrada.nextDouble();
		            System.out.print("Ingrese el segundo número: ");
		            op2 = entrada.nextDouble();
		            //Lamada a la función suma
		            suma (op1, op2);
		            		
		            break;
		
		        case 'r':
		        case 'R':
		            System.out.println("Ha elegido r o R para RESTAR");
		            System.out.print("Ingrese el primer número: ");
		            op1 = entrada.nextDouble();
		            System.out.print("Ingrese el segundo número: ");
		            op2 = entrada.nextDouble();
		            //Llamada a la función resta
		            resta (op1,op2);
		            break;
		
		        case 'm':
		        case 'M':
		            System.out.println("Ha elegido m o M para MULTIPLICAR");
		            System.out.print("Ingrese el primer número: ");
		            op1 = entrada.nextDouble();
		            System.out.print("Ingrese el segundo número: ");
		            op2 = entrada.nextDouble();
		            //Llamada a la función multiplicación 
		            multiplicacion (op1,op2);
		            break;
		
		        case 'd':
		        case 'D':
		            System.out.println("Ha elegido d o D para DIVIDIR");
		            System.out.print("Ingrese el primer número: ");
		            op1 = entrada.nextDouble();
		            System.out.print("Ingrese el segundo número: ");
		            op2 = entrada.nextDouble();
		            if (op2 != 0) {
		            	//Llamada a la función división
		            	division (op1,op2);
		            } else {
		                System.out.println("No se puede dividir por cero.");
		            }
		           
		            break;
		
		        default:
		            System.out.println("Opción no válida");
		            break;
		    }
			if (letra != 'a' && letra != 'A') {
	            System.out.println("Ha salido de la calculadorta. ");
	        }
	
	        entrada.nextLine(); // Limpiar el buffer
	        
        } while (true);

        entrada.close();
    }

	        
	
		
	
	public static double suma (double op1, double op2) {
		return op1 + op2;
	}
	public static double resta (double op1, double op2) {
		return op1 - op2;
	}
	public static double multiplicacion (double op1, double op2) {
		return op1 * op2;
	}
	public static double division (double op1, double op2) {
		return op1 / op2;
	} 
	
		
	public static void mostrar_menu () {
		System.out.println("Eliga letra para hacer una operación matemática");
        System.out.println("Eliga s o S para SUMAR");
        System.out.println("Eliga r o R para RESTAR ");
        System.out.println("Eliga m o M para MULTIPLICAR");
        System.out.println("Eliga d o D para DIVIDIR");
        System.out.println("Eliga a o A para finalizar");  
	}

}

