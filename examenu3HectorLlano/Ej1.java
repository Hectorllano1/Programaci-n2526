package examenud3;

import java.util.Scanner;


class DNIInvalidoException extends Exception {
	public DNIInvalidoException(String mensaje) {
		super(mensaje);
	}
}

public class Ej1 {

	static String leerDNI() throws DNIInvalidoException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el DNI (8 números y una letra): ");
		String dni = sc.nextLine();

		if (dni.length() != 9) {
			throw new DNIInvalidoException("Formato de DNI inválido. Debe ser 8 números y una letra.");
		}

		for (int i = 0; i < 8; i++) {
			if (!Character.isDigit(dni.charAt(i))) {
				throw new DNIInvalidoException("Formato de DNI inválido. Los primeros 8 caracteres deben ser números.");
			}
		}

		char letra = dni.charAt(8);
		if (!Character.isLetter(letra)) {
			throw new DNIInvalidoException("Formato de DNI inválido. El último carácter debe ser una letra.");
		}

		return dni;
	}

	static String cambiarDigito(String dni, int posicion, char nuevoValor) throws DNIInvalidoException {
		if (posicion < 1 || posicion > 8) {
			throw new DNIInvalidoException("La posición debe estar entre 1 y 8.");
		}
		if (!Character.isDigit(nuevoValor)) {
			throw new DNIInvalidoException("El nuevo valor debe ser un dígito numérico.");
		}

		char[] chars = dni.toCharArray();

		chars[posicion - 1] = nuevoValor;

		chars[8] = Character.toUpperCase(chars[8]);

		return new String(chars);
	}

	public static void main(String[] args) {
		
		try {
			
			String dni = leerDNI();
			System.out.println("DNI válido: " + dni.toUpperCase());
			
			String dniModificado = cambiarDigito(dni, 3, '9');
			
			System.out.println("DNI modificado: " + dniModificado);
			
		} catch (DNIInvalidoException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
