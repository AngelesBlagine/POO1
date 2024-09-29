package ejercicio.pony;

public class PonyExpress {
	//Atributos
	public int caballos;
	public int jinetes;
	public int distanciaC;
	public int distanciaJ;
	
	
	//Constructor
	public PonyExpress() {
		this.caballos = 1;  
        this.jinetes = 1;   
        this.distanciaC = 0;
        this.distanciaJ = 0;
	}
	
	//Métodos
	public void enviarMensaje(int[] distancias) {
		
		//Usamos un forEach para recorrer cada distancia del array "distancias"
		for(int distancia : distancias) {
			
			//Verificar que no se superen las 15 millas
			if(distancia > 15) {
				throw new IllegalArgumentException("Los caballos no pueden recorrer distancias mayores a 15 millas");
			}
			
			//Acumulamos la distancia recorrida por el caballo y por el jinete
			distanciaC += distancia;
			distanciaJ += distancia;
			
			//Si la distancia recorrida por el caballo supera las 15 millas, se agrega otro caballo
			// y la distancia se actualiza.
			if(distanciaC > 15) {
				caballos++;
				distanciaC = distancia;
			}
			//Si la distancia recorrida por el jinete supera las 100 millas, se agrega otro jinete
			// y la distancia se actualiza.
			if(distanciaJ > 100) {
				jinetes++;
				distanciaJ = distancia;
			}	
		}	
	}
}
