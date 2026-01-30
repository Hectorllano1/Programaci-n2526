package tarea1.act7;

import tarea1.act7.Caja.Unidades;

public class Principal {
	public static void main(String[] args) {
		
		 Caja caja = new Caja(50, 40, 30, Unidades.CM);

	        System.out.println("Volumen:");
	        System.out.println(caja.getVolumen());

	        System.out.println("Caja completa:");
	        System.out.println(caja);
	}
}
