package Biblioteca;

public class Comic extends Libro{

	private String ilustrador;
	
	
	public Comic(String isbn, String titulo, int num_pags, String editorial, String autor,String ilustrador) {
		super(isbn, titulo, num_pags, editorial, autor);
		// TODO Auto-generated constructor stub
	}


	public String getIlustrador() {
		return ilustrador;
	}


	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}


	@Override
	public String toString() {
		return "Comic [ " + super.getIsbn() + " " + super.getTitulo() + " " + super.getAutor() + " " + super.getEditorial() + " " + this.ilustrador + "";
	}
	
	

}
