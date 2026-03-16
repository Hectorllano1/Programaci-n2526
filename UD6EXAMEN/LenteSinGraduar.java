package ud6.examen.llano;

public class LenteSinGraduar extends Lente{

	public LenteSinGraduar(char lado, ColorLente color) {
		super(lado);
	}

	@Override
	public void dimeTipoLente() {
		System.out.println("La lente está sin graduar");
	}

	
}
