package Biblioteca;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num_pags;
		 String autor,titulo,isbn,editorial,nombre,apellidos,dni;

		 
		
		Scanner in = new Scanner(System.in);
		
		//creacion de los socios.
		
		System.out.println("introcuce el nombre - apellidos - Dni del primer socio separados por enter.");
		nombre = in.nextLine();
		apellidos = in.nextLine();
		dni = in.nextLine();
		
		Socio socio1 = new Socio(nombre, apellidos, dni);
		
		System.out.println(socio1.getDni());
		
		System.out.println("introcuce el nombre - apellidos - Dni del segundo socio separados por enter.");
		nombre = in.nextLine();
		apellidos = in.nextLine();
		dni = in.nextLine();
		
		Socio socio2 = new Socio(nombre, apellidos, dni);
		
		//creacion de los libros
		
		System.out.println("introduce ISBN - titulo - num_pags - editorial - autor del primer libro separados por enter");
		isbn = in.nextLine();
		titulo = in.nextLine();
		num_pags = in.nextInt();
		editorial = in.nextLine();
		autor = in.nextLine();
		
		Libro libro1 = new Libro(isbn,titulo,num_pags,editorial,autor);
		
		
		System.out.println("introduce ISBN - titulo - num_pags - editorial - autor del segundo libro separados por enter");
		isbn = in.nextLine();
		titulo = in.nextLine();
		num_pags = in.nextInt();
		editorial = in.nextLine();
		autor = in.nextLine();
		
		Libro libro2 = new Libro(isbn,titulo,num_pags,editorial,autor);
		
		//modificacion parametro nombre 
		
		System.out.println("introduce el nuevo nombre para el socio 1");
		
		socio1.setNombre(in.nextLine());
		
		//modificacion autor libro
		System.out.println("introduce el nuevo autor para el libro 1");
		
		libro1.setAutor(in.nextLine());
		
		
		//creacion Comic.
		
		String ilustrador;
		
		System.out.println("introduce ISBN - titulo - num_pags - editorial - autor  - ilustrador del comic separados por enter");
		isbn = in.nextLine();
		titulo = in.nextLine();
		num_pags = in.nextInt();
		editorial = in.nextLine();
		autor = in.nextLine();
		ilustrador = in.nextLine();
		
		
		//creacion comic
		Comic comic1 = new Comic(isbn, titulo, num_pags, editorial, autor, ilustrador);
		
		System.out.println(comic1.toString());
		
		
	}
	
		
		
		
	
}
