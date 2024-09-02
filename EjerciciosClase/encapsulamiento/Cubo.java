package ejercicio.encapsulamiento;

//import java.util.Scanner;
import java.lang.Math;

public class Cubo {
	
	//-----------Atributos
	private double lado;
	
	
	//-------CONSTRUCTOR
	
    public Cubo (double longitudLado) { 
    	/**
         * pre : longitudLado es un valor mayor a 0.
         * post: inicializa el cubo a partir de la longitud de lado dada
         */
    	this.setLado(longitudLado);
    }
    	
  //-----------MÉTODOS
    public double getLado() { 
    	/**
         * post: devuelve la longitud de todos los lados del cubo
         */
    	return this.lado;
    }
    
    
    public void setLado(double longitudLado) { 
    	/**
         * pre : longitudLado es un valor mayor a 0.
         * post: cambia la longitud de todos los lados del cubo
         */
    	if(longitudLado <= 0){
    		throw new Error("El lado debe ser mayor que cero");
    	}
    	this.lado = longitudLado;
    }
    
    
    public double getAreaCara() {
    	/**
         * post: devuelve el área de la superficie de las caras del cubo
         */
    	return Math.pow(lado, 2);
    }
    
    
    public void setAreaCara(double areaCara) {
    	/**
         * pre: areaCara es un valor mayor a 0.
         * post: cambia el área de las caras del cubo
         */
    	this.setLado(Math.sqrt(areaCara));
    }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double getVolumen() {
    	/**
         * pre: volumen es un valor mayor a 0.
         * post: cambia el volumen del cubo
         */
    	return Math.pow(lado, 3);
    }

    
    public void setVolumen(double volumen) { 
    	this.setLado(Math.cbrt(volumen));
    }

    
    
    //------------MAIN
	public static void main(String[] args) {
		//Variables 
		double longitudLado = 4;
		Cubo cubito = new Cubo(longitudLado);
		
		//Scanner
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la longitud que tienen las aristas del cubo: ");
		longitudLado = sc.nextDouble();
		
		sc.close();*/
		
		System.out.println("La longitud de la arista: " + cubito.getLado());
		System.out.println("El área de la cara del cubito: " + cubito.getAreaCara());
		System.out.println("El volumen del cubo: " + cubito.getVolumen());
		
		System.out.println("-------------------------------------");
		
		cubito.setAreaCara(20);
		
		System.out.println("La longitud de la arista: " + cubito.getLado());
		System.out.println("El área de la cara del cubito: " + cubito.getAreaCara());
		System.out.println("El volumen del cubo: " + cubito.getVolumen());
		
		System.out.println("-------------------------------------");
		
		cubito.setVolumen(1028);
		
		System.out.println("La longitud de la arista: " + cubito.getLado());
		System.out.println("El área de la cara del cubito: " + cubito.getAreaCara());
		System.out.println("El volumen del cubo: " + cubito.getVolumen());
		
		System.out.println("-------------------------------------");

	}

}
