package ejercicio.circulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaCirculo {

	@Test
    public void crearPuntoTest() {
		//Verifica que la creación de un objeto Punto almacene correctamente 
		//las coordenadas x e y.
		
        Punto punto = new Punto(3, 4);
        assertEquals(3, punto.getX());
        assertEquals(4, punto.getY());
    }

    @Test
    public void distanciaEntrePuntosTest() {
    	//Calcula la distancia entre dos puntos (0, 0) y (3, 4). 
    	//Como es un triángulo rectángulo (3-4-5), la distancia esperada es 5.
    	
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 4);
        double esperado = 5.0; // Distancia esperada entre los puntos (3, 4) y (0, 0)
        double obtenido = Punto.distancia(p1, p2);
        assertEquals(esperado, obtenido);
    }

    @Test
    public void crearCirculoTest() {
    	//Verifica que al crear un objeto Circulo, el radio, diámetro, perímetro y área 
    	//se calculen correctamente.
    	
        Circulo circulo = new Circulo(new Punto(0, 0), 5);
        assertEquals(5, circulo.getRadio());
        assertEquals(10, circulo.getDiametro());
        assertEquals(Math.PI * 25, circulo.getArea());
        assertEquals(2 * Math.PI * 5, circulo.getPerimetro());
    }

    @Test
    public void interseccionCirculosTest() {
    	//Comprueba que dos círculos que deberían intersectarse 
    	//(como en el ejemplo (0, 0) y (1, 1) con radios 1 y 1.5 respectivamente) 
    	//devuelvan true en la intersección.
    	
        Circulo c1 = new Circulo(new Punto(0, 0), 1);
        Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
        assertTrue(c1.intersectaCon(c2)); // Los círculos deben intersectarse
    }

    @Test
    public void noInterseccionCirculosTest() {
    	//Comprueba que dos círculos que no deberían intersectarse 
    	//(con centros muy separados, como (0, 0) y (5, 5)) devuelvan false en la intersección.
    	
        Circulo c1 = new Circulo(new Punto(0, 0), 1);
        Circulo c2 = new Circulo(new Punto(5, 5), 1.5);
        assertFalse(c1.intersectaCon(c2)); // Los círculos no deben intersectarse
    }

    @Test
    public void areaCoronaCircularTest() {
    	//Verifica que el área de una corona circular 
    	//(la diferencia entre el área de los círculos interior y exterior) 
    	//se calcule correctamente.
    	
        CoronaCircular corona = new CoronaCircular(1, 3);
        double esperado = (Math.PI * 9) - (Math.PI * 1); // Área exterior menos interior
        double obtenido = corona.getAreaCorona();
        assertEquals(esperado, obtenido);
    }

}
