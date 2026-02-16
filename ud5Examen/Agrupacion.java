package ud5.examen;

public abstract class Agrupacion {
	private String nombre;						//Declaramos la clase Agrupación y sus 
	private String autor;						//distintos atributos que heredarán sus clases hijas
	private String autorMusica;
	private String autorLetras;
	private String tipo;						//La clase es abstracta
	
	public abstract void mostrarTipo();				//Declaramos los metodos abstractos que rellenaran sus clases hijas
	public abstract void cantarLaPresentacion();
	
	public Agrupacion(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
		this.nombre = nombre;
		this.autor = autor;
		this.autorMusica = autorMusica;
		this.autorLetras = autorLetras;
		this.tipo = tipo;
	}
	
	public String getNombre() {					//Inicializamos getters y setters
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAutorMusica() {
		return autorMusica;
	}
	public void setAutorMusica(String autorMusica) {
		this.autorMusica = autorMusica;
	}
	public String getAutorLetras() {
		return autorLetras;
	}
	public void setAutorLetras(String autorLetras) {
		this.autorLetras = autorLetras;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
									//Hacemos un toString que haremos de cada clase para imprimir su info
	@Override
	public String toString() {
		return "Agrupacion [nombre=" + nombre + ", autor=" + autor + ", autorMusica=" + autorMusica + ", autorLetras="
				+ autorLetras + ", tipo=" + tipo + "]";
	}
	
	
	
}
