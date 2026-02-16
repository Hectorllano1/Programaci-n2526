package ud5.examen;

import java.util.Arrays;

public class Coro extends AgrupacionOficial{

	public Coro(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int puntosObtenidos, int totalAgrupaciones) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
		totalAgrupaciones++;
	}							//Constructor que hereda los atributos del padre
	
	private int numBandurrias;		//Declaramos los atributos propios de la clase
	private int numGuitarras;

	@Override								//Sobreescribimos los métodos de las clases padre con Override 
	public void mostrarTipo() {
		System.out.println("El Coro "+getNombre()+" va de "+getTipo());
		
	}

	@Override
	public void cantarLaPresentacion() {
		System.out.println("Cantando la presentación del Coro con nombre "+getNombre());
	}

	public int getPuntosObtenidos() {
		return puntosObtenidos;
	}
	
	@Override
	public void caminitoDelFalla() {	
		System.out.println("El Coro "+getNombre()+" va caminito del falla");
	}

	@Override
	public String toString() {
		return "Coro [numBandurrias=" + numBandurrias + ", numGuitarras=" + numGuitarras + ", puntosObtenidos="
				+ puntosObtenidos + ", integrante=" + Arrays.toString(integrante) + ", toString()=" + super.toString()
				+ ", getNombre()=" + getNombre() + ", getAutor()=" + getAutor() + ", getAutorMusica()="
				+ getAutorMusica() + ", getAutorLetras()=" + getAutorLetras() + ", getTipo()=" + getTipo() + "]";
	}
	
	
}
