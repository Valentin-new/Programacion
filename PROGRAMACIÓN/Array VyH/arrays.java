package entornos_de_desarrollo;
//que pida 100 numeros enteros y que los muetre en 
public class arrays {
	public static void main (String [] args) {
		//definimos el array de numeros
		int [] numeros;
		int cont=0;
		//construimos el array de 100 numeros
		numeros=new int[100];
		//metemos 100 numeros en el arrray
		for(int i=0;i<100;i++) {
			cont= cont +1;
			numeros[i]=cont;
			System.out.println(numeros[i]);
		}
		
	}
	

}
