package entornos_de_desarrollo;

public class Hoja2_ej22 {
	public static void main(String[] args) {
		//entidad numero
		int num=0;
		//entidad multiplicador
		int mu=0;
		//entidad acumulador
		int acum=0;
		//entidad resultado
		int result=0;
		
		while (num<=10) {
			while (num>1) {
				System.out.println(+result);
				mu= mu+1;
				result=mu*num;
			}
			mu=mu+1;
			
		}
		
		System.out.print("Resultado es: "+num+"*"+mu+"="+result);
	}

}
