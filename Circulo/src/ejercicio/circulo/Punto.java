package ejercicio.circulo;

public class Punto {
	//----Atributos----
    private double x;
    private double y;

    //----Constructor----
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //----Métodos---

    // Métodos para verificar si el punto está en el eje X o Y
    public boolean estaSobreElEjeX() {
        return y == 0;
    }

    public boolean estaSobreElEjeY() {
        return x == 0;
    }

    // Método para verificar si el punto es el origen (0,0)
    public boolean esElOrigenDeCoordenadas() {
        return x == 0 && y == 0;
    }

    // Método para calcular la distancia al origen
    public double distanciaAlOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    // Método estático para calcular la distancia entre dos puntos
    public static double distancia(Punto p1, Punto p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    // Método para calcular la distancia entre el punto actual y otro punto
    public double distancia(Punto p) {
        return Punto.distancia(this, p);
    }
    
    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
