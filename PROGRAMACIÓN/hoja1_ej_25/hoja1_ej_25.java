package entornos_de_desarrollo;

public class hoja1_ej_25 {
	public static void main(String[] args) {
		//Inicio del programa
		  // Ingresar salario anual
		int sal;
		//inicializo la variable
		//num<-0
		sal=0;
		int an;
		//inicializo la variable
		//num<-0
		an=0;
		int sueldo;
		//inicializo la variable
		//num<-0
		sueldo =0;
		//mostrar "introduce un número"
		System.out.println("introduce un numero");
		//leer salario
		sal=5000;
		//leer años
		an=10;
		//Si (num MOD 2)=0 ENTONCES
		if (an>=10) {
			//System.out.println("");
			sueldo= (sal*1.1);
		//SINO
		}else {
			//System.out.println("");
			if (an>=5) {
				sueldo= (sal*1.07);
			}else {
				//System.out.println("");
				if (an>=3) {
					sueldo= (sal*1.05);
				}else {
					sueldo= (sal*1.03);
				}
			}
			}//Fin_si
		//Mostrar sueldo
			System.out.println("este es tu sueldo: ",sueldo);
		}
			
			
}
		
		  // Ingresar años en la empresa
		  // Si años en la empresa > 10 entonces
		     //  Sueldo = salario + (salario * 0.10)
		  //Sino, si años en la empresa > 5 entonces
		    //  Sueldo = salario + (salario * 0.07)
		  // Sino, si años en la empresa > 3 entonces
		    //  Sueldo = salario + (salario * 0.05)
		  // Sino
		    //  Sueldo = salario + (salario * 0.03)
		  //Fin Si
		  // Mostrar Sueldo
		//Fin del programa

		
	

