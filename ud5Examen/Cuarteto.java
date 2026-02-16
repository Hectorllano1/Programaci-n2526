package ud5.examen;

import java.util.Arrays;

public class Cuarteto extends AgrupacionOficial implements Callejera{

	public Cuarteto(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int puntosObtenidos, int totalAgrupaciones) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
		totalAgrupaciones++;
	}									//Constructor con los atributos heredados del padre
	
	private int numMiembros;		//Atributos propios de la clase
	
	@Override									//Sobreescribimos los métodos de las clases padre con Override 
	public void mostrarTipo() {
		System.out.println("El Cuarteto "+getNombre()+" va de "+getTipo());
	}

	@Override
	public void cantarLaPresentacion() {
		System.out.println("Cantando la presentación del Cuarteto con nombre "+getNombre());
	}

	public int getPuntosObtenidos() {
		return puntosObtenidos;
	}
	
	@Override
	public void caminitoDelFalla() {	
		System.out.println("El Cuarteto "+getNombre()+" va caminito del falla");
	}
	
	@Override									//Implementamos y rellenamos el metodo del interface Callejera
	public void amoAEscucha() {
		System.out.println("Amo a escucha la Chirigota " +getNombre());
	}

	@Override
	public String toString() {
		return "Cuarteto [numMiembros=" + numMiembros + ", puntosObtenidos=" + puntosObtenidos + ", integrante="
				+ Arrays.toString(integrante) + ", getNombre()=" + getNombre() + ", getAutor()=" + getAutor()
				+ ", getAutorMusica()=" + getAutorMusica() + ", getAutorLetras()=" + getAutorLetras() + ", getTipo()="
				+ getTipo() + "]";
	}
	
}
