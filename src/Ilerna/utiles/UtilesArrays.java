package Ilerna.utiles;

import java.util.Random;

public class UtilesArrays {

	
	public static void main (String[] args) {
		
		
		
		
		
	}
	public static int[] alearray(int end, int Inferior, int Superior){
		
		Random aleatorio = new Random();
		int[] array = new int[end];
		
		for(int i = 0; i < end; i ++) {
			
			array[i] = Inferior + aleatorio.nextInt(Superior - Inferior) ;
			
			
		}
		
		
		return array;
		
		
		
	}
	
	public static int[] alreves(int[] entrada) {
		
		int[] vuelta = new int[entrada.length];
		
		for(int i = entrada.length; i < 0; i --) {
			
			
			vuelta[(i - entrada.length)] = entrada[i];
			
		}
		
		return vuelta;
	}
	
	public static int[] arrayTam(int tam) {
		
		int[] vuelta = new int[tam];
		
		
		for (int i = 0; i < vuelta.length; i ++) {
			
			vuelta[i] = i;
			
		}
		
		return vuelta;
		
	}
	public static int[] multiplica(int [] in1, int[] in2) {
		
		int[] vuelta = new int[in1.length];
		
		for(int i = 0; i < in1.length; i++) {
			
			
			vuelta[i] = in1[i] * in2[i];
			
			
		}
		
		
		return vuelta;
		
	}
	
	
}
