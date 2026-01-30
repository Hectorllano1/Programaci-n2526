package tarea1.act7;

public class Caja {

	public enum Unidades {
	    CM, M
	}
	
    // Atributos (inmutables)
    private final double ancho;
    private final double alto;
    private final double fondo;
    private final Unidades unidades;

    // Constructor
    public Caja(double ancho, double alto, double fondo, Unidades u) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidades = u;
    }

    // Devuelve el volumen en metros cúbicos
    public double getVolumen() {
        double anchoM = ancho;
        double altoM = alto;
        double fondoM = fondo;

        // Si las dimensiones están en centímetros, las convertimos a metros
        if (unidades == Unidades.CM) {
            anchoM /= 100;
            altoM /= 100;
            fondoM /= 100;
        }

        return anchoM * altoM * fondoM;
    }
    
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getFondo() {
        return fondo;
    }


    // Representación en forma de texto
    @Override
    public String toString() {
        return "Caja [ancho=" + ancho + " " + unidades +
               ", alto=" + alto + " " + unidades +
               ", fondo=" + fondo + " " + unidades +
               ", volumen=" + getVolumen() + " m³]";
    }
}
