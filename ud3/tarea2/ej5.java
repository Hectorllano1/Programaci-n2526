package ud3.tarea2;

import java.util.Scanner;

public class ej5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre y apellidos: ");
		String nombreApellidos = sc.nextLine();
		
		String vocales = "[AEIOUaeiouÁÉÍÓÚáéíóú]";
		
		String noVocales = nombreApellidos.replaceAll(vocales, "");
		System.out.println("nombre sin vocales: " +noVocales);
		
		
	}

}
