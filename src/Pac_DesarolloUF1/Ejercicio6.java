package Pac_DesarolloUF1;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Realiza un programa en Eclipse, con una función main que pida 2 números de teclado y muestre:
		- El número mayor
		- El resultado de sumarlos.
		- El resultado de multiplicarlos
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//numeros
		int a,b,c;
		
		//lectura de numeros
		Scanner in = new Scanner(System.in);
		
		System.out.println("Por favor introduce el primer numero");
		
		a = in.nextInt();
		
		System.out.println("Por favor introduce el segundo numero");
		
		b = in.nextInt();
		
		if( a > b ){
			
			//si "a" es mayor que "b"
			
			System.out.println("El primer numero que has introducido es mayor que el segundo");
			
		}else{
			
			//si "b" es mayor que "a"
			
			System.out.println("El segundo numero es mayor que el primer numero");
			
		}
		
		//suma
		
		c = a + b;
		
		System.out.println("la suma de los dos nuemro que has introducido es: " + a + " + " + b + " = " + c );
		
		//multiplicacion
		
		c = a * b;
		
		System.out.println("la suma de los dos nuemro que has introducido es: " + a + " * " + b + " = " + c );
		
	}

}
