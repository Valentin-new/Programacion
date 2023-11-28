package entornos_de_desarrollo;
//2. Que pida un número y diga si es par o impar.

//Inicio
public class oha1_ejercicio2 {

	public static void main(String[] args) {
		//declaración de variable
		//tipo_dato nombre_variable;
		int num;
		//inicializo la variable
		//num<-0
		num=0;
		//mostrar "introduce un número"
		System.out.println("introduce un numero");
		//leer num
		num=5;
		//Si (num MOD 2)=0 ENTONCES
		if ((num%2)==0) {
			//MOSTRAR "ES PAR"
			System.out.println("El numero es par");
		//SINO
		}else {
			//MOSTRAR "ES IMPAR"
			System.out.println("El numero es impar");
		//Fin_si
		}

		
		//FIN
	}
}