import java.util.Scanner;

public class hacer_figuras2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cont =1;
	double cont2 = 1;
	double cont3 = 1;
     double esp;
     double cont4 = 1;

		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce un numero de filas: ");
		int num = 4;
		esp = num / 2;
		while (cont4 <= 4) {
		System.out.print(" ");
		cont4 = cont4 +1;
		}
		while (cont < num) {
			
			
			System.out.println("*");
			cont =cont + 1;
			cont2 = 1;
			cont3 =0;
			while (cont3 <= esp) {
				cont3 = cont3 +1;
				System.out.print(" ");
			}
			esp = esp - 1;
			
				while (cont2 < cont) {
			System.out.print("*");
			cont2 = cont2 +0.5;
			}
			
		}
	System.out.print("*");
	}
	}


