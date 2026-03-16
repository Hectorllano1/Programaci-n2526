package ud6.examen.llano;

public class LenteGraduada extends Lente{
	
	private double correccion;

	public LenteGraduada(char lado, TipoProblema problema, double correccion ) {
		super(lado);
		this.correccion = correccion;
	}

	@Override
	public void dimeTipoLente() {
		System.out.println("La lente está graduada");
		
	}
	
	
	
}
