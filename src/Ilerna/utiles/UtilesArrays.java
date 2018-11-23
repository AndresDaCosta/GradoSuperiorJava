package Ilerna.utiles;

import java.util.Random;

public class UtilesArrays {

	
	public static void main (String[] args) {
		
		
		int[] array = alearray(6,10,20);
		
		for(int i = 0; i < array.length; i ++) {
			
			System.out.println(array[i]);
			
		}
		
		System.out.println(alreves("ola"));
		
		
	}
	
	
	
	public static int[] alearray(int end, int Inferior, int Superior){
		
		Random aleatorio = new Random();
		int[] array = new int[end];
		
		for(int i = 0; i < end; i ++) {
			
			array[i] = Inferior + aleatorio.nextInt(Superior - Inferior) ;
			
			
		}
		
		
		return array;
		
		
		
	}
	public static String alreves(String into) {
		
		String out = new String();
		
		
		
		
		for(int i = (into.length()-1); i >= 0; i --) {
			
			out += into.charAt(i);
			
			
		}
		
		
		
		return out;
		
	}
	
	
}
