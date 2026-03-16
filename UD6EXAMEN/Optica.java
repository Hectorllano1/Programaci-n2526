package ud6.examen.llano;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Optica {
	
	protected String nombreOpt;
	protected String CIF;
	public Optica(String nombreOpt, String cIF) {
		this.nombreOpt = nombreOpt;
		this.CIF = CIF;
	}
	
	Map<TipoGafa, Gafa> gafas = new LinkedHashMap<>();
	private int totalGafas;
	
	public int cuantasGafas() {
		return totalGafas;
	}
	
	public void addGafa(TipoGafa tipo, Gafa g) {
		gafas.put(tipo, g);
		totalGafas++;
	}
	
	public void delGafas(Gafa g) {
		gafas.remove(g);
		totalGafas--;
	}
	
	public double damePrecioGafa(Gafa g) {
		return g.aplicaDescuento();
	}
	
	
	public void gafasByProveedor() {
		for (int i = 0; i < gafas.size(); i++) {
			System.out.println(Proveedor.getNombre());
		}
	}
	
	public void costeGafasByTipo(TipoGafa tipo) {
		double costeTotalSol = 0;
		double costeTotalGraduadas= 0;
		for (int i = 0; i < gafas.size(); i++) {
			if (gafas.containsKey(TipoGafa.SOL)) {
				costeTotalSol+= Gafa.getPrecio();
				System.out.println(costeTotalSol);
			}
			
			if (gafas.containsKey(TipoGafa.GRADUADA)) {
				costeTotalGraduadas+= Gafa.getPrecio();
				System.out.println(costeTotalGraduadas);
			}
		}
	}
	
}
