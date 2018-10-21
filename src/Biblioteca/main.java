package Biblioteca;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		createSocio2();
		createLibro2();
		
		
		
		
	}
	public static void createSocio2() {
		
		String nombre,apellidos,dni;
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 2; i ++) {
		
		System.out.println("introduce el Nombre, apellidos y DNI del separados por un enter");
		
		nombre = in.nextLine();
		apellidos = in.nextLine();
		dni = in.nextLine();
		
		Socio socio = new Socio(nombre,apellidos,dni);
		
		}
		
		
	}
	public static void createLibro2() {
		
		String titulo,isbn,editorial;
		int pags_num;
		
		Scanner in = new Scanner (System.in);
		
		for (int i = 0; i < 2; i ++) {
			
			System.out.println("introduce el tirulo, ISBN, editorial y el numero de paginas seprados por un enter");
			
			titulo = in.nextLine();
			isbn = in.nextLine();
			editorial = in.nextLine();
			pags_num = in.nextInt();
			
			Libro libro = new Libro(isbn,titulo,pags_num,editorial);
			
		}
		
		
		
	}

}
