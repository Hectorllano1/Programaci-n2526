package retos;

import java.util.Random;
import java.util.Scanner;

public class QEQ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//Objetos posibles
		String[] objetos = {"perro", "gato", "pez", "pajaro"};
		
		//Características asociadas (verbos)
		String[][] caracteristicas = {
				{"ladra", "corre", "bosteza"},		//perro
				{"maulla", "rasca"},	//gato
				{"nada", "respira"},	//pez
				{"vuela", "canta"}		//pájaro
		};
		
		int indiceAleatorio;
		String objetoAleatorio;
		boolean finalizar=false;
		boolean pregunta=false;
		String palabra;
		
		
		indiceAleatorio=(int)(Math.random()* objetos.length);		//Se crea un objeto al azar
		
		objetoAleatorio=objetos[indiceAleatorio];
		
		System.out.println("=== Adivina adivinanza ===");
		System.out.println("He pensado un animal. Haz preguntas usando verbos para adivinarlo");
		System.out.println("Cuando creas saberlo, escribe su nombre");
		
		System.out.println();
		
		do {
			
			System.out.println("Dime tu pregunta o intento de acierto: ");
			palabra=sc.nextLine();
			
			sc.nextLine();
			
			if (palabra.equalsIgnoreCase(objetos[indiceAleatorio])) {
				finalizar=true;
				System.out.println("¡Correcto! Era un "+objetos[indiceAleatorio]);
			}
			
			if (palabra.equalsIgnoreCase(caracteristicas[indiceAleatorio][0]) || palabra.equalsIgnoreCase(caracteristicas[indiceAleatorio][1])) {
				System.out.println("Sí.");
			}else if (finalizar==false) {
				System.out.println("No.");
			}
			
		} while (finalizar==false);
	}
}
