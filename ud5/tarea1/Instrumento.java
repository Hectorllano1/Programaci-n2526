package tarea1.act5;

public abstract class Instrumento {
	
	NotaMusical[] notas = new NotaMusical[100];
	int cont;
	public enum NotaMusical{DO, RE, MI, FA, SOL, LA, SI, DOM}; 
	
	public Instrumento() {
		this.notas = notas;
		this.cont = 0;
	}

	public void add(NotaMusical notaNueva) {
		if (cont < notas.length) {
			notas[cont] = notaNueva;
			cont++;
		}else {
			System.out.println("Ya no caben mas notas");
		}
	}
	
	public abstract void interpretar();
}
