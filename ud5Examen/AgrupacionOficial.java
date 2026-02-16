package ud5.examen;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion{

	protected int puntosObtenidos;
	static int NUM_INTEGRANTES=10;
	Integrante[] integrante = new Integrante[NUM_INTEGRANTES];	//Esta clase es hija de agrupacion y esta hereda sus atributos
	static int totalAgrupaciones;								//Declaramos tambien los atributos de la clase
	
	public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
		
	}
	
	public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int totalAgrupaciones,
			int puntosObtenidos) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
		this.puntosObtenidos = puntosObtenidos;
		totalAgrupaciones++;	
	}												//Generamos constructores para las clases hijas

	@Override
	public void mostrarTipo() {
	}

	@Override
	public void cantarLaPresentacion() {
	}
	
	public abstract void caminitoDelFalla();	//Metodo abstracto que se complementará en las clases hijas
	
	public int mostrarTotalAgrupaciones() {		//Muestra el total de agrupaciones
		
		return totalAgrupaciones;
	}

	@Override
	public String toString() {
		return "AgrupacionOficial [puntosObtenidos=" + puntosObtenidos + ", integrante=" + Arrays.toString(integrante)
				+ ", getNombre()=" + getNombre() + ", getAutor()=" + getAutor() + ", getAutorMusica()="
				+ getAutorMusica() + ", getAutorLetras()=" + getAutorLetras() + ", getTipo()=" + getTipo() + "]";
	}
	
	//Añade un integrante a la Agrupacion
	public void insertarIntegrante(Integrante i) {
		
		integrante[NUM_INTEGRANTES] = i;
		NUM_INTEGRANTES++;
	}
	
	//Elimina un integrante de la Agrupacion
	public boolean eliminarIntegrante(Integrante i) {
		
		if (NUM_INTEGRANTES > -1) {
			integrante[NUM_INTEGRANTES] = i;
			NUM_INTEGRANTES--;
			return true;
		}
		
		return false;
	}

}
