package ejercicio.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
	// Atributos
	private ArrayList<Libro> libros;

	// Constructor
	public Biblioteca() {
		this.libros = new ArrayList<Libro>(); // A partir de Java 7 no es necesario volver a indicar el atributo al cual
												// nos referimos
	}

	//--------------------------------------------------------
	
	
	// Consultar la cantidad de libros que contiene.
	public int cuantosLibros() {
		return this.libros.size();
	}


	public void agregarLibro(String titulo, String autor, Genero genero, int paginas) {
		Libro libro = new Libro(titulo, autor, genero, paginas);
		libros.add(libro);
	}

	//Devuelve el título de un libro a partir de la posición.
	public String libroEnLaPosicion(int posicion) {
		if(posicion < 1 || posicion > libros.size())
			throw new Error("Posicion fuera de rango");
		
		return libros.get(posicion-1).getTitulo();
	}

	public String libroEnLaUltimaPosicion() {
		int ultimaPosicion = libros.size();
		return this.libroEnLaPosicion(ultimaPosicion);
	}
	
	//Devuelve el libro con más cantidad de páginas.
	public Libro libroConMasPaginas() {
		int maxPag = libros.get(0).getCantidadPaginas();
		Libro libroMax = libros.get(0);
		
		for(Libro cadaLibro : libros) {
			if(cadaLibro.getCantidadPaginas() > maxPag) {
				maxPag = cadaLibro.getCantidadPaginas();
				libroMax = cadaLibro;
			}
		}
		
		return libroMax;
	}

	// Consultar cuántos libros hay de determinado autor.
	public int cuantosLibrosDelAutor(String autor) {
		int contador = 0;
		for(Libro cadalibro : libros) {
			if(cadalibro.getAutor().equals(autor)) {
				contador++;
			}
		}
		
		return contador;
	}

	//Devuelve una lista con todos los Libros de un autor que se pasa por parámetro.
	public List<Libro> librosDelAutor(String autor) {
		List<Libro> aux = new LinkedList<Libro>();
		for(Libro cadaLibro : libros) {
			if(cadaLibro.getAutor().equals(autor)) {
				aux.add(cadaLibro);
			}
		}
		return aux;
	}
	
	public void ordenarLibros() {
		Collections.sort(this.libros);
	}
	public void listarLibros() {
		System.out.println(libros);
	}
	

	//Informe por pantalla la cantidad de libros que hay por cada género literario.
	public void librosPorGeneroLiterario() {
	    // Mapa para contar la cantidad de libros por género
	    EnumMap<Genero, Integer> conteoPorGenero = new EnumMap<>(Genero.class);
	    
	    // Inicializamos el conteo de cada género en 0
	    for (Genero genero : Genero.values()) {
	        conteoPorGenero.put(genero, 0);
	    }

	    // Contamos los libros por género
	    for (Libro libro : libros) {
	        Genero genero = libro.getGenero();
	        conteoPorGenero.put(genero, conteoPorGenero.get(genero) + 1);
	    }

	    // Imprimimos los resultados
	    for (Genero genero : Genero.values()) {
	        System.out.println("Género " + genero + ": " + conteoPorGenero.get(genero) + " libro(s).");
	    }
	}


	// 10. Para cada uno de los puntos anteriores confeccionar los casos de prueba JUnit.
}

