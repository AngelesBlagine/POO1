package ejercicio.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

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
	
	
	public Map<Genero, Integer> cuantosLibrosPorGeneroLiterario() {
		Map<Genero, Integer> mapita = new HashMap<>();
		int valorLibros;
		
		//Ciclo for recorre los libros
		for(Libro cadaLibro : libros) {
			//Creamos la clave / valor
			Genero claveGenero = cadaLibro.getGenero();
			//Si mapita contiene claveGenero
			if(mapita.containsKey(claveGenero)) {
				//Actualizar
				valorLibros = mapita.get(claveGenero) + 1;
			}
			else {
				//Crea nueva entrada
				valorLibros = 1;
			}
			//Hacer put actualizado
			mapita.put(claveGenero, valorLibros);
		}
		return mapita;
	}
	
	public Map<Genero, List<Libro>> librosPorGeneroLiterario(){
		Map<Genero, List<Libro>> mapita = new TreeMap<>();
		
		for(Libro cadaLibro : libros) {
			
			Genero claveGenero = cadaLibro.getGenero();
			List<Libro> listaDeLibros;
			
			if(mapita.containsKey(claveGenero)) {
				listaDeLibros = mapita.get(claveGenero);
			}else {
				listaDeLibros = new ArrayList<Libro>();
			}
			listaDeLibros.add(cadaLibro);
			mapita.put(claveGenero, listaDeLibros);
		}
		
		return mapita;
	}
	
	public String ordenarMapita(Map<Genero, List<Libro>> map) {
		String s = "";
		List<Libro> lista;
		
		//Snippet 
		for (Entry<Genero, List<Libro>> cadaFila : map.entrySet()) {
            
			Genero claveGenero = cadaFila.getKey();
			s += "\n--------------------------------------------------------------------\n" + claveGenero + "\n";
			
			lista = cadaFila.getValue();
			
			for(Libro cadaLibro : lista) {
				s += cadaLibro.toString(); // Se puede sumar por el toString, puedo no agregar el .toString y es lo mismo
				s += "\n";
			}	
        }
		return s;
	}

	//Informe por pantalla la cantidad de libros que hay por cada género literario.
	/*public void librosPorGeneroLiterario() {
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
	}*/

	public static void main(String[] args) {
		Biblioteca pedilooYa = new Biblioteca();
		pedilooYa.agregarLibro("El Sinmarillion", "J.R.R. Tolkien", Genero.FANTASIA, 448);
		pedilooYa.agregarLibro("Rebelion en la Granja", "George Orwell", Genero.SATIRA, 152);
		pedilooYa.agregarLibro("1984", "George Orwell", Genero.CIENCIA_FICCION, 328);
		pedilooYa.agregarLibro("El Principito", "Antoine de Saint-Exupéry", Genero.INFANTILES, 96);
		pedilooYa.agregarLibro("El Hobbit", "J.R.R. Tolkien", Genero.AVENTURA, 310);
		pedilooYa.agregarLibro("Los miserables", "Victor Hugo", Genero.NOVELA, 1463);
		pedilooYa.agregarLibro("Una breve historia del tiempo", "Stephen Hawking", Genero.CIENCIA_FICCION, 256);
		pedilooYa.agregarLibro("La historia del tiempo", "Stephen Hawking", Genero.HISTORIA, 224);
		pedilooYa.agregarLibro("Cien años de soledad", "Gabriel García Márquez", Genero.NOVELA, 400);
		pedilooYa.agregarLibro("El ingenioso hidalgo Don Quijote de la Mancha", "Miguel de Cervantes", Genero.NOVELA, 800);
		pedilooYa.agregarLibro("Crónicas de una muerte anunciada", "Gabriel García Márquez", Genero.NOVELA, 120);
		pedilooYa.agregarLibro("Harry Potter y la piedra filosofal", "J.K. Rowling", Genero.AVENTURA, 309);
		
		System.out.println(pedilooYa.cuantosLibrosPorGeneroLiterario());
		System.out.println("\n------------------------------------\n");
		System.out.println(pedilooYa.librosPorGeneroLiterario());
		System.out.println(pedilooYa.ordenarMapita(pedilooYa.librosPorGeneroLiterario()));
	}

	// 10. Para cada uno de los puntos anteriores confeccionar los casos de prueba JUnit.
}
