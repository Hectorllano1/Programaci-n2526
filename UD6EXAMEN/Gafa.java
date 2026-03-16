package ud6.examen.llano;

public class Gafa implements Promocion{
	
	private Montura montura;
	private double coste;
	private static double precio;
	private int idNumerico;
	private TipoGafa tipo;
	
	public Gafa(Montura montura, double coste, double precio) {
		super();
		this.montura = montura;
		this.coste = coste;
		this.precio = precio;
		idNumerico++;
	}

	@Override
	public double aplicaDescuento() {
		double descuentoSol;
		double descuentoGrad;
		if (tipo == TipoGafa.GRADUADA) {
			descuentoGrad = (precio * 20) / 100;
			precio -= descuentoGrad;
		}else if (tipo == TipoGafa.SOL) {
			descuentoSol = (precio * 30) / 100;
			precio -= descuentoSol;
		}
		
		return precio;
	}

	public static double getPrecio() {
		return precio;
	}

	public double getCoste() {
		return coste;
	}

}
