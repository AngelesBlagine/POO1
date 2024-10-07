package ejercicio.biblioteca;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class BibliotecaTest {

	@Test
	void libroConMasPaginasTest() {
		Biblioteca pedilooYa = new Biblioteca();
		pedilooYa.agregarLibro("El Sinmarillion", "J.R.R. Tolkien", Genero.FANTASIA, 448);
		pedilooYa.agregarLibro("Rebelion en la Granja", "George Orwell", Genero.SATIRA, 152);
		pedilooYa.agregarLibro("1984", "George Orwell", Genero.CIENCIA_FICCION, 328);
		pedilooYa.agregarLibro("El Principito", "Antoine de Saint-Exupéry", Genero.INFANTILES, 96);
		pedilooYa.agregarLibro("El Hobbit", "J.R.R. Tolkien", Genero.AVENTURA, 310);
		pedilooYa.agregarLibro("Los miserables", "Victor Hugo", Genero.NOVELA, 1463);
		pedilooYa.agregarLibro("Una breve historia del tiempo", "Stephen Hawking", Genero.CIENCIA_FICCION, 256);
		pedilooYa.agregarLibro("La historia del tiempo", "Stephen Hawking", Genero.HISTORIA, 224);
		
		Libro esperado = new Libro("Los miserables", "Victor Hugo", Genero.NOVELA, 1463);
		assertEquals(esperado, pedilooYa.libroConMasPaginas());
		
	}
	
	@Test
	void librosDelAutorTest() {
	    Biblioteca pedilooYa = new Biblioteca();
	    pedilooYa.agregarLibro("El Hobbit", "J.R.R. Tolkien", Genero.AVENTURA, 310);
	    pedilooYa.agregarLibro("El Silmarillion", "J.R.R. Tolkien", Genero.FANTASIA, 448);
	    pedilooYa.agregarLibro("Rebelión en la granja", "George Orwell", Genero.SATIRA, 152);
	    pedilooYa.agregarLibro("1984", "George Orwell", Genero.CIENCIA_FICCION, 328);

	    List<Libro> librosEsperados = new ArrayList<>();
	    librosEsperados.add(new Libro("El Hobbit", "J.R.R. Tolkien", Genero.AVENTURA, 310));
	    librosEsperados.add(new Libro("El Silmarillion", "J.R.R. Tolkien", Genero.FANTASIA, 448));

	    assertEquals(librosEsperados, pedilooYa.librosDelAutor("J.R.R. Tolkien"));
	}

	
	@Test
	void librosOrdenadosTest() {
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
		
		pedilooYa.ordenarLibros();
		pedilooYa.listarLibros();
	}
	
	/*@Test
	void libroConMasPaginasSinLibrosTest() {
	    Biblioteca pedilooYa = new Biblioteca();
	    assertNull(pedilooYa.libroConMasPaginas(), "Si no hay libros, debería devolver null.");
	}*/

	/*@Test
	void agregarLibroDuplicadoTest() {
	    Biblioteca pedilooYa = new Biblioteca();
	    assertTrue(pedilooYa.agregarLibro("1984", "George Orwell", Genero.CIENCIA_FICCION, 328));
	    assertFalse(pedilooYa.agregarLibro("1984", "George Orwell", Genero.CIENCIA_FICCION, 328), "No debería permitir agregar libros duplicados.");
	}*/

	/*@Test
	void librosPorGeneroTest() {
	    Biblioteca pedilooYa = new Biblioteca();
	    pedilooYa.agregarLibro("El Hobbit", "J.R.R. Tolkien", Genero.AVENTURA, 310);
	    pedilooYa.agregarLibro("El Silmarillion", "J.R.R. Tolkien", Genero.FANTASIA, 448);
	    pedilooYa.agregarLibro("1984", "George Orwell", Genero.CIENCIA_FICCION, 328);

	    List<Libro> librosEsperados = new ArrayList<>();
	    librosEsperados.add(new Libro("1984", "George Orwell", Genero.CIENCIA_FICCION, 328));

	    assertEquals(librosEsperados, pedilooYa.librosPorGenero(Genero.CIENCIA_FICCION));
	}*/
	
	/*@Test
	void eliminarLibroTest() {
	    Biblioteca pedilooYa = new Biblioteca();
	    pedilooYa.agregarLibro("El Hobbit", "J.R.R. Tolkien", Genero.AVENTURA, 310);
	    pedilooYa.agregarLibro("1984", "George Orwell", Genero.CIENCIA_FICCION, 328);

	    assertTrue(pedilooYa.eliminarLibro("1984"), "Debería permitir eliminar un libro existente.");
	    assertFalse(pedilooYa.eliminarLibro("1984"), "No debería permitir eliminar un libro que ya ha sido eliminado.");
	}*/

	/*@Test
	void libroInexistenteTest() {
	    Biblioteca pedilooYa = new Biblioteca();
	    pedilooYa.agregarLibro("El Hobbit", "J.R.R. Tolkien", Genero.AVENTURA, 310);

	    assertNull(pedilooYa.buscarLibro("1984"), "Debería devolver null cuando no se encuentra el libro.");
	}*/

	

	

}
