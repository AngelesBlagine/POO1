package ejercicio.circulo;

public class CoronaCircular {
	
	// ---- Atributos ----
    private Circulo circuloInterior;
    private Circulo circuloExterior;

    // ---- Constructor ----
    public CoronaCircular(double radioInterior, double radioExterior) {
        if (radioInterior >= radioExterior) {
            throw new IllegalArgumentException("El radio interior debe ser menor que el radio exterior.");
        }
        this.circuloInterior = new Circulo(new Punto(0, 0), radioInterior);
        this.circuloExterior = new Circulo(new Punto(0, 0), radioExterior);
    }

    
    // ---- Métodos ----
    
    // Métodos para obtener y cambiar el radio interior
    public double getRadioInterior() {
        return circuloInterior.getRadio();
    }

    public void setRadioInterior(double radioInterior) {
        if (radioInterior >= circuloExterior.getRadio()) {
            throw new IllegalArgumentException("El radio interior debe ser menor que el radio exterior.");
        }
        circuloInterior.setRadio(radioInterior);
    }

    // Métodos para obtener y cambiar el radio exterior
    public double getRadioExterior() {
        return circuloExterior.getRadio();
    }

    public void setRadioExterior(double radioExterior) {
        if (radioExterior <= circuloInterior.getRadio()) {
            throw new IllegalArgumentException("El radio exterior debe ser mayor que el radio interior.");
        }
        circuloExterior.setRadio(radioExterior);
    }

    // Obtener el perímetro interior y exterior
    public double getPerimetroInterior() {
        return circuloInterior.getPerimetro();
    }

    public double getPerimetroExterior() {
        return circuloExterior.getPerimetro();
    }

    // Obtener el área de la corona circular
    public double getAreaCorona() {
        return circuloExterior.getArea() - circuloInterior.getArea();
    }
}

