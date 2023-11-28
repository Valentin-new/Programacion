//package primer_trimestre;

/** Fecha: 21/11/2023
 * @author Vasile Valentin Vladu
 * Curso DAW
 */

import java.util.Scanner;

public class TresEnRaya_Beta {
    static Scanner in = new Scanner(System.in);
    //Variables globales
    static char[] tablero = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};//Creo array para tablero de 2 dimensiones
    static char jugadorActual = 'X'; // Inicia el jugador 1

    //Inicializo las variables para estadísticas
    static int partidasGanadasJugador1 = 0;
    static int partidasGanadasJugador2 = 0;
    static int empates = 0;

    //Función principal
    public static void main(String[] args) {
        //Inicializo la variable opción que sera ingresada por el usuario
        int opcion;
        do {
            //Imprimo el Menu
            System.out.println("1. Jugar una partida");
            System.out.println("2. Mostrar estadísticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = in.nextInt();

            //Implemento los casos
            switch (opcion) {
                case 1:
                    jugarPartida();
                    break;
                case 2:
                    mostrarEstadisticas();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                //Implemento caso por defecto 
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        //Ejecuta el switch hasta que la opción sea distinta de 3 (corresponde al caso de salida)
        } while (opcion != 3);
    }

    public static void jugarPartida() {
        tablero = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; // Reinicia el tablero
        jugadorActual = 'X'; // Reinicia el jugador 1

        do {
            dibujaTablero(tablero);

            boolean movimientoValido = false;
            while (!movimientoValido) {
                System.out.print("Introduzca movimiento (Jugador " + jugadorActual + "): ");
                int posicion = in.nextInt();
                if (posicion >= 1 && posicion <= 9 && tablero[posicion - 1] == ' ') {
                    tablero[posicion - 1] = jugadorActual;
                    movimientoValido = true;
                } else {
                    System.out.println("Movimiento no válido. Inténtalo de nuevo.");
                }
            }

            if (ganaJugador(tablero, jugadorActual)) {
                dibujaTablero(tablero);
                System.out.println("Ha Ganado el Jugador " + jugadorActual + "!");
                actualizarEstadisticas(jugadorActual);
                break;
            } else if (!quedanCasillas(tablero)) {
                dibujaTablero(tablero);
                System.out.println("Empate. No quedan más casillas.");
                actualizarEstadisticas('E');
                break;
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        } while (true);
    }

    public static void dibujaTablero(char[] tablero) {
        System.out.println("-------------"); //Optimización de código
        for (int i = 0; i < 9; i += 3) {  //El += es un operador de asignación compuesta
            System.out.println("| " + tablero[i] + " | " + tablero[i + 1] + " | " + tablero[i + 2] + " |");
            System.out.println("-------------");

        /**
         * System.out.println(tablero[1] + " | " + tablero[2] + " | " + tablero[3]);
         * System.out.println("---------");
         * System.out.println(tablero[4] + " | " + tablero[5] + " | " + tablero[6]);
         * System.out.println("---------");
         * System.out.println(tablero[7] + " | " + tablero[8] + " | " + tablero[9]);
         */
        }
    }

    public static boolean ganaJugador(char[] tablero, char jugador) {
        // Verifica todas las combinaciones ganadoras
        for (int i = 0; i < 9; i += 3) { //operador de asignación compuesta
            if (tablero[i] == jugador && tablero[i + 1] == jugador && tablero[i + 2] == jugador) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (tablero[i] == jugador && tablero[i + 3] == jugador && tablero[i + 6] == jugador) {
                return true;
            }
        }

        if (tablero[0] == jugador && tablero[4] == jugador && tablero[8] == jugador) {
            return true;
        }

        if (tablero[2] == jugador && tablero[4] == jugador && tablero[6] == jugador) {
            return true;
        }

        return false;
    }

    //Función que comprueba si ya están ocupadas todas las posiciones del tablero
    public static boolean quedanCasillas(char[] tablero) {
        for (char casilla : tablero) {
            if (casilla == ' ') {
                return true;
            }
        }
        return false;
    }

    public static boolean ganaJugador1() {
    // Verificar filas y columnas
    for (int i = 0; i < 3; i++) {
        if (tablero[i] == 'X' && tablero[i + 3] == 'X' && tablero[i + 6] == 'X') {
            return true; // Ganador en columna
        }
        if (tablero[i * 3] == 'X' && tablero[i * 3 + 1] == 'X' && tablero[i * 3 + 2] == 'X') {
            return true; // Ganador en fila
        }
    }

    // Verificar diagonales
    if (tablero[0] == 'X' && tablero[4] == 'X' && tablero[8] == 'X') {
        return true; // Ganador en diagonal principal
    }
    if (tablero[2] == 'X' && tablero[4] == 'X' && tablero[6] == 'X') {
        return true; // Ganador en diagonal secundaria
    }

    return false;
}

public static boolean ganaJugador2() {
    // Verificar filas y columnas
    for (int i = 0; i < 3; i++) {
        if (tablero[i] == 'O' && tablero[i + 3] == 'O' && tablero[i + 6] == 'O') {
            return true; // Ganador en columna
        }
        if (tablero[i * 3] == 'O' && tablero[i * 3 + 1] == 'O' && tablero[i * 3 + 2] == 'O') {
            return true; // Ganador en fila
        }
    }

    // Verificar diagonales
    if (tablero[0] == 'O' && tablero[4] == 'O' && tablero[8] == 'O') {
        return true; // Ganador en diagonal principal
    }
    if (tablero[2] == 'O' && tablero[4] == 'O' && tablero[6] == 'O') {
        return true; // Ganador en diagonal secundaria
    }

    return false;
}


    //Función que actualiza las estadísticas
    public static void actualizarEstadisticas(char resultado) {
        if (resultado == 'X') {
            partidasGanadasJugador1++;
        } else if (resultado == 'O') {
            partidasGanadasJugador2++;
        } else {
            empates++;
        }
    }

    // Función para mostrar estadísticas
    public static void mostrarEstadisticas() { //Muestro estadísticas
        System.out.println("Estadísticas:");
        System.out.println("Partidas ganadas por Jugador 1: " + partidasGanadasJugador1);
        System.out.println("Partidas ganadas por Jugador 2: " + partidasGanadasJugador2);
        if (partidasGanadasJugador1 == partidasGanadasJugador2){
        	System.out.println("Han empatado. ");
        }
    }
}