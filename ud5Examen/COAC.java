package ud5.examen;

public class COAC {
	
	public static int NUM_AGRUPACIONES=100;
	AgrupacionOficial[] agrupacion = new AgrupacionOficial[NUM_AGRUPACIONES];
	
	public void inscribirAgrupacion(AgrupacionOficial agrupacion) {
		NUM_AGRUPACIONES++;
	}
	
	public boolean eliminarAgrupacion(Agrupacion agrupacion) {
		if (NUM_AGRUPACIONES > 0) {
			NUM_AGRUPACIONES--;
			return true;
		}
		return false;
	}
	
	
	
	void ordenarPorPuntos() {
	}
	
	void ordenarPorNombre() {}
	
	void ordenarPorAutor() {}
}

