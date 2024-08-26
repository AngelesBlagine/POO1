package ejercicio.encapsulamiento;

import java.util.Scanner;

public class NotasAlumnos {
	//Atributos
	private int valorNota;
	
	//Constructor
	public NotasAlumnos(int valorInicial) {
		if(valorInicial < 0 || valorInicial > 10) {
			throw new Error("Nota inválida");
		}
		this.valorNota = valorInicial;	
	}	

	//Métodos
	
	public int getNotas() {
		return this.valorNota;
	}
	
	public int notaRecuperatorio(int valorRecuperatorio) {
		return this.valorNota = valorRecuperatorio;
	}
	
	public int notaFinal(int valorFinal) {
		return this.valorNota = valorFinal;
	}
	
	public boolean aprobado() {
		return this.getNotas() >= 4;
	}
	
	public boolean desapobado() {
		return !this.aprobado();
	}

	public boolean promocion() {
		return this.getNotas() >= 7;
	}
	
	
	//Main
	public static void main(String[] args) {
		int valorInicial;
		int valorFinal;
		int valorRecuperatorio;
		int hacerRecuperatorio = 0;
		
		System.out.println("Dia de parciales, salvese quien pueda!\n------------------------------------\n");
		
		Scanner sc = new Scanner(System.in);
		
		//Ingreso la nota del parcial y a valorInicial se le asigna dicho valor
		System.out.println("Ingrese el valor de la nota: ");
		valorInicial = sc.nextInt();
		
		//Creamos el objeto notita1 que va a almacenar el valor de nuestra nota
		NotasAlumnos notita1 = new NotasAlumnos(valorInicial);
		
		//Se imprime en pantalla la nota de nuestro parcial junto al estado de aprobación de la nota
		System.out.println("\nSu nota es: " + notita1.getNotas());
		System.out.println("Estado de aprobación: " + notita1.aprobado());
		
		if(notita1.aprobado()) {//Si nuestra nota está aprobada, no es neceario dar el recuperatorio, así que se lo consultamos.
			System.out.println("\n------------\nQuieres ir al recuperatorio? SI(1)/NO(2): ");
			hacerRecuperatorio = sc.nextInt();
		}
		else {//Si no está aprobado, deberá hacer el recuperatorio
			System.out.println("Has desaprobado, debes hacer el recuperatorio\n----------------------\n");
		}
		
		if(hacerRecuperatorio == 1 || !notita1.aprobado()) {//El alumno desea hacer el recuperatorio o debe hacerlo porque ha desaprobado
			System.out.println("\nDia de recuperatorios, suerte!\n------------------------------------\n");
			System.out.println("Ingrese la nota del recuperatorio: ");
			valorRecuperatorio = sc.nextInt();
			notita1.notaRecuperatorio(valorRecuperatorio);
		}
		
		if(notita1.promocion()) { //Si el alumno ha sacado 7 o más de 7 en el parcial/recuperatorio, entonces ha promocionado y no debe hacer el final
			System.out.println("\nFelicidades, has promocionado! No debes dar el final :)");
		}
		else if(notita1.aprobado() && !notita1.promocion()) {//Si ha aprobado el parcial/recuperatorio, pero no ha promocionado, debe hacer el final
			System.out.println("\nDia de finales, éxitos!\n------------------------------------\n");
			System.out.println("Ingrese la nota del final: ");
			valorFinal = sc.nextInt();
			notita1.notaFinal(valorFinal);
		}
		else { //Si el alumno no apueba con sus notas, no puede rendir el final. Por lo tanto, debe recursarla
			System.out.println("\nLo lamento, parece que no has regularizado la materia. Nos vemos el cuatrimestre que viene");
		}
		
		
		System.out.println("\n--------------------------");
		
		sc.close();
		
	}
}
