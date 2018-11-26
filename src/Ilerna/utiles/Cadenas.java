package Ilerna.utiles;

public class Cadenas {

	
	public  static void main (String[] args) {
		
		
		
		int numero = busca("banana", 'a');
		System.out.println(numero);
	}
	
	
	
	
	
	public static int vocales(String palabra) {
		
		int vocales = 0;
		char[] inspection = palabra.toCharArray();
		
		for (int i = 0; i < inspection.length; i ++) {
			
			
			if(inspection[i] == 'a' | inspection[i] == 'e' | inspection[i] == 'i' | inspection[i] == 'o' | inspection[i] == 'u'
					| inspection[i] == 'A' | inspection[i] == 'E' | inspection[i] == 'I' | inspection[i] == 'O' | inspection[i] == 'U') {
				
				
				vocales ++;
				
				
			}else {
				
				
				
			}
			
			
		}
		
		return vocales;
	}
	
	public static String inverso(String palabra) {
		
		String palabraDe = new String();
		
		
		for(int i = palabra.length(); i > 0; i -- ) {
			
			
			palabraDe = palabraDe + palabra.charAt(i-1);
			
			
		}
		
		
		
		
		return palabraDe;
		
	}
	public static int busca(String palabra, char caracter) {
		
		int repeticiones = 0;
		
		for(int i = 0; i < palabra.length(); i ++) {
			
			
			if(palabra.charAt(i) == caracter) {
				
				repeticiones ++;
			}
			
			
		}
		
		return repeticiones;
	}
	
	
}
