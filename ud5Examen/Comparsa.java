package ud5.examen;

import java.util.Arrays;

public class Comparsa extends AgrupacionOficial{

	public Comparsa(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int puntosObtenidos, int totalAgrupaciones) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
		totalAgrupaciones++;	
	}							//Constructor que hereda los atributos del padre
	
	private String empresaAtrezzo;
	
	@Override												//Sobreescribimos los métodos de las clases padre con Override 
	public void mostrarTipo() {
		System.out.println("La Comparsa "+getNombre()+" va de "+getTipo());
	}

	@Override
	public void cantarLaPresentacion() {
		System.out.println("Cantando la presentación de la Comparsa con nombre "+getNombre());
	}

	public int getPuntosObtenidos() {
		return puntosObtenidos;
	}

	@Override
	public void caminitoDelFalla() {	
		System.out.println("La Comparsa "+getNombre()+" va caminito del falla");
	}

	@Override
	public String toString() {
		return "Comparsa [empresaAtrezzo=" + empresaAtrezzo + ", puntosObtenidos=" + puntosObtenidos + ", integrante="
				+ Arrays.toString(integrante) + ", toString()=" + super.toString() + ", getNombre()=" + getNombre()
				+ ", getAutor()=" + getAutor() + ", getAutorMusica()=" + getAutorMusica() + ", getAutorLetras()="
				+ getAutorLetras() + ", getTipo()=" + getTipo() + "]";
	}
	
	//ToString que imprime toda la info por pantalla

	
}
