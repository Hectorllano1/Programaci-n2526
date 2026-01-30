package tarea1.act7;

public class CajaCarton extends Caja {

    // Etiqueta numérica
    private int etiqueta;

    // Superficie total de cartón usada por TODAS las cajas
    private static double superficieTotal = 0;

    // Constructor
    public CajaCarton(double ancho, double alto, double fondo, int etiqueta) {
        // Siempre en centímetros
        super(ancho, alto, fondo, Unidades.CM);
        this.etiqueta = etiqueta;

        // Sumamos la superficie de ESTA caja al total
        superficieTotal += calcularSuperficie();
    }

    // Volumen útil: 80% del volumen real
    @Override
    public double getVolumen() {
        return super.getVolumen() * 0.8;
    }

    // Superficie de una caja (en m²)
    private double calcularSuperficie() {
        // Pasamos de cm a metros
        double a = getAncho() / 100;
        double h = getAlto() / 100;
        double f = getFondo() / 100;

        // Superficie total de un paralelepípedo
        return 2 * (a*h + a*f + h*f);
    }

    // Devuelve la superficie total de todas las cajas
    public static double getSuperficieTotal() {
        return superficieTotal;
    }

    @Override
    public String toString() {
        return "CajaCarton [etiqueta=" + etiqueta +
               ", volumen útil=" + getVolumen() + " m³]";
    }
}
