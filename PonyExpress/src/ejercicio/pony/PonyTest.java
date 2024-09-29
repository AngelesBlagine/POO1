package ejercicio.pony;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PonyTest {

	@Test
	public void recursosTrasladoTest() {
		//Verifica que el metodo enviarMensaje calcule correctamente la cantidad de
		//Caballos y jinetes necesarios para hacer llegar el mensaje de un lado a otro.
		PonyExpress ponyExpress = new PonyExpress();
		ponyExpress.enviarMensaje(new int[] {15, 15, 15, 15, 15, 15, 15, 15});
		
		assertEquals(8, ponyExpress.caballos);
		assertEquals(2, ponyExpress.jinetes);
	}

}
