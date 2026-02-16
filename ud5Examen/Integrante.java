package ud5.examen;

public class Integrante {
	
	private int numParticipante;	//Declaramos todos sus atributos 
	private String nombre;
	private int edad;
	private String localidad;
	public Integrante(int numParticipante, String nombre, int edad, String localidad) {
		super();
		this.numParticipante = numParticipante;
		this.nombre = nombre;
		this.edad = edad;
		this.localidad = localidad;
	}										//Generamos su constructor
	
	@Override
	public String toString() {
		return "Integrante [numParticipante=" + numParticipante + ", nombre=" + nombre + ", edad=" + edad
				+ ", localidad=" + localidad + "]";
	}
	
	//Imprimimos toda la información por pantalla
	
}
