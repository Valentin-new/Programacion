package entornos_de_desarrollo;

import java.util.Scanner;

public class ej22_hoja2 {
	public static void main(String[] args) {
	
		//HABILITAMOS LALECTURA POR CONSOLA
		Scanner entrada = new Scanner (System.in);
		
		//declaracion vaiales
		int i, num, suma=0;
		double media=0;
		
		for (i=1;i<=3;i++) {
			
				System.out.println("introduce un numero");
				//leer num
				num= entrada.nextInt();
				suma=suma+num;
			
		}
		media=suma/10;
		System.out.print("La media es: "+media);
	}

}
