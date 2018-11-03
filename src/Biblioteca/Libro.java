package Biblioteca;

public class Libro {

	//atributes 
	private String titulo;
	private final String isbn;
	private int num_pags;
	private String editorial;
	private String autor;
	

	//builder with atributes
	public Libro(String isbn, String titulo, int num_pags, String editorial, String autor) {
		
		this.isbn = isbn;
		this.titulo = titulo;
		this.num_pags = num_pags;
		this.editorial = editorial;
		this.autor = autor;
		
	}	
	
	//getters and setters 
	
	public String getIsbn() {
		return isbn;
		
	}

	@Override
	public String toString() {
		return " " + isbn + " - " + titulo + " - " + autor + " - " + editorial +"";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNum_pags() {
		return num_pags;
	}

	public void setNum_pags(int num_pags) {
		this.num_pags = num_pags;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	
	
	
}
