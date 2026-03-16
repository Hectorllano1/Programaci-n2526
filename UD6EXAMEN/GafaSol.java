package ud6.examen.llano;

public class GafaSol extends Gafa{

	private LenteSinGraduar lenteSol1;
	private LenteSinGraduar lenteSol2;
	private Proveedor prov;
	
	public GafaSol(Montura montura, LenteSinGraduar lenteSol1, LenteSinGraduar lenteSol2, double coste, double precio, Proveedor prov) {
		super(montura, coste, precio);
	}
	
}
