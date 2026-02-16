package ud5.examen;

public class Main {

	public static void main(String[] args) {
		
		//Creamos un coro y una chirigota para probar los distintos metodos
		
		AgrupacionOficial coro1 = new Coro("CoritoSano", "Héctor Llano", "Ana Uribe", "Martin Pérez", "Testigos", 12, 0);
		AgrupacionOficial chiri1 = new Chirigota("Los Palmeros", "Vicente Tente", "Vicente Tente", "Angel Ramos", "Cantautores", 52, 0);
		
		//Canta la presentacion del coro1 y el camnito del falla
		coro1.cantarLaPresentacion();
		coro1.caminitoDelFalla();
		
		//Muestra el tipo de chiri1
		chiri1.mostrarTipo();
		
		
	}

}
