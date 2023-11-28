package entornos_de_desarrollo;

import java.util.Scanner;

public class ej22_hoja2 {
	public static void main(String[] args) {
	//INICIALIZAMOS LAS VARIABLES	
		//entidad 10 numeros
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		int num6=0;
		int num7=0;
		int num8=0;
		int num9=0;
		int num10=0;
		//entidad multiplicador
		int mu=0;
		//entidad acumulador
		int acum=0;
		//entidad resultado
		int result=0;
		
	//HABILITAMOS LALECTURA POR CONSOLA
		Scanner entrada = new Scanner (System.in);
		
		while (acum<=10) {
			while (acum>1) {
				System.out.println(+result);
				mu= mu+1;
				result=mu*num;
			}
			mu=mu+1;
			
		}
		
		System.out.print("Resultado es: "+num+"*"+mu+"="+result);
	}

}
