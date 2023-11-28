package ud3;
/*25. Que calcule el sueldo que le corresponde al trabajador 
 * de una empresa que cobra
40.000 euros anuales, el programa debe realizar los cálculos 
en función de los
siguientes criterios:
a. Si lleva más de 10 años en la empresa se le aplica un aumento del 10%.
b. Si lleva menos de 10 años pero más que 5 se le aplica un aumento del 7%.
c. Si lleva menos de 5 años pero más que 3 se le aplica un aumento del 5%.
d. Si lleva menos de 3 años se le aplica un aumento del 3%.

 * */
public class H1Ej25 {

	public static void main(String[] args) {
		//declaracion de variables
		int anyo;
		double sueldo;
		//inicializo las variables
		anyo=0;
		sueldo=0;

		System.out.println("Introduce sueldo y antigüedad");
		//emulamos lectura
		anyo=6;
		sueldo=40000;
		//a. Si lleva más de 10 años
		// en la empresa se le aplica un aumento del 10%. 
		if (anyo>10) {
			sueldo=sueldo*1.1;
		}
		
		if ((anyo<=10)&&(anyo>5)) {
			sueldo=1.07*sueldo;
		}
		
		if ((anyo<=5)&&(anyo>3)) {
			sueldo=1.05*sueldo;
		}
		if ((anyo<=3)&&(anyo>0)) {
			sueldo=1.03*sueldo;
		}
		System.out.println("El sueldo es:"+sueldo);
		
	}

}
