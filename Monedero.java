package ejercicios.gral;

import java.util.Scanner;

/*Defina una clase ‘Monedero’ que permita gestionar la cantidad de dinero de que una
persona dispone en un momento dado. La clase deberá tener un constructor que permitirá
crear un monedero con una cantidad de dinero inicial y deberá definir un método para
meter dinero en el monedero, otro para sacarlo y finalmente, otro para consultar el
disponible; solo podrá conocerse la cantidad de dinero del monedero a través de este último
método. Por supuesto, no se podrá sacar más dinero del que haya en un momento dado en
el monedero. Para probar el funcionamiento de la clase, escriba un método ‘main’ con una
serie de instrucciones que hagan uso de los métodos definidos.
*/

public class Monedero {
	// 1.
	public float dineroMonedero;

	// 2. Construir monedero
	public Monedero(float dinero) {
		this.dineroMonedero = dinero;
	}

	// 3. Crear métodos para ingresar, sustraer y ver dinero
	public float Ingresa_Dinero(float dinero) {
		float total = 0;

		return total;
	}

	public float Egresa_Dinero(float dinero) {
		float total = 0;

		return total;
	}

	public float Ver_Dinero(float dinero) {
		float total = 0;

		return total;
	}

	// ---MAIN---
	public static void main(String[] args) {
		System.out.println(
				"Quieres ahorrar para comprarte una nueva PC. \nAsi que decides construir tu proprio chanchito.");
		System.out.println("---------------------------------");

		// Escoge el material para crear tu chanchito
		System.out.println(
				"Buscando en tu casa, encontraste estos 3 elementos\n---------------------------\n1. Caja de metal\n2. Caja de madera\n3. Jarron de vidrio");
		Scanner sc = new Scanner(System.in);

		System.out.println("Escoge el recipiente para crear tu chanchito: ");
		int recipiente = sc.nextInt();
		
		if(recipiente == 1)
			System.out.println("Luego de pensarlo, optas por la caja metalica");
		if(recipiente == 2)
			System.out.println("Luego de pensarlo, optas por la caja de madera");
		if(recipiente == 3)
			System.out.println("Luego de pensarlo, optas por el jarron de vidrio");

		//Escoges el color de tu chanchito
		System.out.println("-----------------------------\nHabiendo escogido el recipiente, solo queda decorarlo\n----------------------------------\n1. Rosa\n2. Celeste\n3. Blanco");
		System.out.println("Escoge el color para decorar a tu chanchito: ");
		int color = sc.nextInt();
		
		if(color == 1)
			System.out.println("Luego de pensarlo, decides pintar el chanchito con su color tradicional, el rosa");
		if(color == 2)
			System.out.println("Luego de pensarlo, decides pintar flores en el chanchito de color celeste cielo");
		if(color == 3)
			System.out.println("Luego de pensarlo, decides pintar al chanchito con formas blancas");
		
		// Se ingresa dinero al chanchito por primera vez.

		System.out.println("-----------------------------\nUna vez terminado el chanchito, piensas que es hora de dejar tus primeros billetes");
		
		System.out.println("Ingrese dinero al Chanchito: ");
		float dinero = sc.nextFloat();
		sc.close();

		// 4. Inicializar dineroMonedero
		Monedero Chanchito = new Monedero(dinero);

		// 5. Imprimir en pantalla la cantidad final de dinero
		System.out.println("La cantidad de dinero que hay en el chanchito es: " + Chanchito.dineroMonedero);
	}

}
