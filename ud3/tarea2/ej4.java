package ud.tarea2;

import java.util.Scanner;

public class ej4 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba una frase: ");
		String f = sc.nextLine();
		
		int contadorEspacios = 0;
		
		for (int i= 0; i < f.length(); i++) {
			if (f.charAt(i)== ' ') {
				 contadorEspacios++;
			}
		}
		
		System.out.println("La frase tiene " +contadorEspacios+ " espacios en blanco"	);
}
}
