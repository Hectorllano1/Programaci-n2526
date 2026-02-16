package ud5.examen;

public class Romancero extends Agrupacion implements Callejera {

	public Romancero(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
	}		
	//Al contrario que el resto de las agrupaciones
	//Esta no es una AgrupacionOficial, por lo cual hereda de Agrupacion y no de AgrupacionOficial y no hereda sus metodod

	@Override		//Sobreescribimos los métodos de las clases padre con Override 
	public void mostrarTipo() {
		System.out.println("El Romancero "+getNombre()+" va de "+getTipo());
	}

	@Override
	public void cantarLaPresentacion() {
		System.out.println("Cantando la presentación del Romancero con nombre "+getNombre());
		
	}
	
	@Override		//Implementamos el metodo de la clase Interface Callejera y lo rellenamos
	public void amoAEscucha() {
		System.out.println("Amo a escucha la Chirigota " +getNombre());
	}

	@Override
	public String toString() {
		return "Romancero [getNombre()=" + getNombre() + ", getAutor()=" + getAutor() + ", getAutorMusica()="
				+ getAutorMusica() + ", getAutorLetras()=" + getAutorLetras() + ", getTipo()=" + getTipo() + "]";
	}
	
	//Imprimimos toda la informacion de la clase por pantalla
}
