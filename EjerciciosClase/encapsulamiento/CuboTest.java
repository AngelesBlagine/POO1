package ejercicio.encapsulamiento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuboTest {

	@Test
	void volumenTest() {
		Cubo cubito = new Cubo(5);
		double esperado = 125;
		double obtenido = cubito.getVolumen();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void areaCaraTest() {
		Cubo cubito = new Cubo(5);
		double esperado = 25;
		double obtenido = cubito.getAreaCara();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void cambioAreaTest() {
		Cubo cubito = new Cubo(5);
		cubito.setAreaCara(16);
		double esperado = 4;
		double obtenido = cubito.getLado();
		assertEquals(esperado, obtenido);
	}

	@Test
	void cambioVolumenTest() {
		Cubo cubito = new Cubo(5);
		cubito.setVolumen(64);
		double esperado = 4;
		double obtenido = cubito.getVolumen();
		assertEquals(esperado, obtenido);
	}
	
	
	
}
