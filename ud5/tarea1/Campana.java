package tarea1.act5;

public class Campana extends Instrumento{
	
	@Override
	public void interpretar() {
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]!=null) {
				System.out.println("Está sonando la campana " +notas[i]+ " ");
			}
		}
	}

}
