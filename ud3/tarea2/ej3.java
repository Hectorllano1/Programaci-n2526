package ud.tarea2;

import java.util.Scanner;

public class ej3 {
	

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba una frase: ");
		String f = sc.next();
		
		frase(f);
	}

	public static void frase(String f) {
		
		if (f.charAt(f.length()/2)==' ') {
			System.out.println("El caracter central es un espacio en blanco");
		}else {
			System.out.println("El caracter central no es un espacio en blanco");
		}
	}
}
