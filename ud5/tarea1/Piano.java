package tarea1.act5;

public class Piano extends Instrumento{

	@Override
	public void interpretar() {
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]!=null) {
				System.out.println("Está sonando el piano " +notas[i]+ " ");
			}
		}
	}

}
