package ud3.tarea3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Introducir por teclado un número n; 
		//a continuación solicitar al usuario que teclee n números. 
		//Realizar la media de los números positivos, 
		//la media de los negativos, y contar el número de ceros introducidos.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce un número: ");
		int n = sc.nextInt();
		int contP=0;
		int contN=0;
		int contC=0;
		int mediaP=0;
		int mediaN=0;
		
		int [] numeros;
		numeros=new int[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("introduce un numero: ");
			int num =sc.nextInt();
			
			if (num>0) {
				contP++;
				mediaP +=num/contP;
			}else if(num<0) {
				contN++;
				mediaN+=num/contN;
			}else {
				contC++;
			}
		}
		
		System.out.println("numeros positivos introducidos= "+contP);
		System.out.println("media positivos= "+mediaP);
		System.out.println("numeros negativos introducidos= "+contN);
		System.out.println("media negativos= "+mediaN);
		System.out.println("ceros introducidos= "+contC);


		
	}

}

