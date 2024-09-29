package ejercicio.circulo;

public class Circulo {
	// ---- Atributos ----
    private Punto centro;
    private double radio;

    // ---- Constructor ----
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    
    // ---- Métodos ----
    
    // Métodos para obtener y cambiar el radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Obtener el diámetro
    public double getDiametro() {
        return 2 * radio;
    }

    // Obtener el perímetro
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Obtener el área
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para verificar si este círculo se intersecta con otro
    public boolean intersectaCon(Circulo otro) {
        double distanciaCentros = Punto.distancia(this.centro, otro.centro);
        double sumaRadios = this.radio + otro.radio;
        return distanciaCentros <= sumaRadios;
    }
}

