package ud5.examen;

import java.util.Arrays;

public class Chirigota extends AgrupacionOficial implements Callejera{

	public Chirigota(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int puntosObtenidos, int totalAgrupaciones) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
		totalAgrupaciones++;
	}
	//Constructor del padre que hereda sus atributos
	
	private int numCuples;		//Declaramos los atributos propios de la clase

	@Override
	public void mostrarTipo() {
		System.out.println("La Chirigota "+getNombre()+" va de "+getTipo()); //Sobreescribimos los métodos de las clases padre con Override 
	}

	@Override
	public void cantarLaPresentacion() {
		System.out.println("Cantando la presentación de la Chirigota con nombre "+getNombre());	
	}

	public int getPuntosObtenidos() {
		return puntosObtenidos;
	}
	
	@Override
	public void caminitoDelFalla() {	
		System.out.println("La Chirigota "+getNombre()+" va caminito del falla");
	}

	@Override
	public void amoAEscucha() {
		System.out.println("Amo a escucha la Chirigota " +getNombre());	//Implementamos y rellenamos el método del interface con Override 
	}

	@Override
	public String toString() {
		return "Chirigota [numCuples=" + numCuples + ", puntosObtenidos=" + puntosObtenidos + ", integrante="
				+ Arrays.toString(integrante) + ", getNombre()=" + getNombre() + ", getAutor()=" + getAutor()
				+ ", getAutorMusica()=" + getAutorMusica() + ", getAutorLetras()=" + getAutorLetras() + ", getTipo()="
				+ getTipo() + "]";
	}

	
}
