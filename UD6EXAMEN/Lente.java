package ud6.examen.llano;

public abstract class Lente {

	protected char lado;
	
	public Lente(char lado) {
		super();
		this.lado = lado;
	}

	public abstract void dimeTipoLente();
}
