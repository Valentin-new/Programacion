package entornos_de_desarrollo;

import java.util.Scanner;

public class Calculadora_mejorada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, resultado = 0;
        char letra;

        System.out.println("Eliga letra para hacer una operación matemática");
        System.out.println("Eliga s o S para SUMAR");
        System.out.println("Eliga r o R para RESTAR ");
        System.out.println("Eliga m o M para MULTIPLICAR");
        System.out.println("Eliga d o D para DIVIDIR");

        letra = entrada.nextLine().charAt(0);

        switch (letra) {
            case 's':
            case 'S':
                System.out.println("Ha elegido s o S para SUMAR");
                System.out.print("Ingrese el primer número: ");
                numero1 = entrada.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                numero2 = entrada.nextDouble();
                resultado = numero1 + numero2;
                break;

            case 'r':
            case 'R':
                System.out.println("Ha elegido r o R para RESTAR");
                System.out.print("Ingrese el primer número: ");
                numero1 = entrada.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                numero2 = entrada.nextDouble();
                resultado = numero1 - numero2;
                break;

            case 'm':
            case 'M':
                System.out.println("Ha elegido m o M para MULTIPLICAR");
                System.out.print("Ingrese el primer número: ");
                numero1 = entrada.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                numero2 = entrada.nextDouble();
                resultado = numero1 * numero2;
                break;

            case 'd':
            case 'D':
                System.out.println("Ha elegido d o D para DIVIDIR");
                System.out.print("Ingrese el primer número: ");
                numero1 = entrada.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                numero2 = entrada.nextDouble();

                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }

        if (letra == 's' || letra == 'S' || letra == 'r' || letra == 'R' || letra == 'm' || letra == 'M' || letra == 'd' || letra == 'D') {
            System.out.println("El resultado es: " + resultado);
        }

        entrada.close();
    }
}

