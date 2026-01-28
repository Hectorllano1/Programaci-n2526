package tarea1.act5;

import tarea1.act5.Instrumento.NotaMusical;

public class Principal {

	public static void main(String[] args) {
		
		Piano piano = new Piano();
		Campana campana = new Campana();
		
		piano.add(NotaMusical.DO);
		piano.add(NotaMusical.LA);
		piano.add(NotaMusical.FA);
		
		piano.interpretar();
	}

}
