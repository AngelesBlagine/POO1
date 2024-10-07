package ejercicio.biblioteca;

import java.util.Objects;

public class Libro implements Comparable<Libro>{
	//Atributos
	private String titulo;
	private String autor;
	private Genero genero;
	private int cantidadPaginas;
	
	//Constructor
	public Libro(String titulo, String autor, Genero genero, int cantidadPaginas) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setGenero(genero);
		this.setCantidadPaginas(cantidadPaginas);
	}
	
	//To String

	@Override
	public String toString() {
		return "\nLibro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", cantidadPaginas="
				+ cantidadPaginas + "]";
	}
	
	//HashCode y Equals

	@Override
	public int hashCode() {
		return Objects.hash(autor, cantidadPaginas, genero, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && cantidadPaginas == other.cantidadPaginas && genero == other.genero
				&& Objects.equals(titulo, other.titulo);
	}

	//Getters y Setters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	//Comparable
	@Override
	public int compareTo(Libro otro) {
		if (this.genero.compareTo(otro.genero) == 0) {
			return this.autor.compareTo(otro.autor);
		}
		else
			return this.genero.compareTo(genero);
	}
	
}

