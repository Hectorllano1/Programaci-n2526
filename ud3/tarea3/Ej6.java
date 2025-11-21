package ud3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
	
		//  Implementar una función sinRepetidos() con el prototipo:

		//int[] sinRepetidos(int t[])
		
		//que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han eliminado los datos repetidos.

		
		Scanner sc = new Scanner (System.in);
		int [] tabla1 = new int [5];
		int [] tabla2 = new int [5];
			
		//recorremos el bucle 6 veces pidiendo cada vez un num y guardandolo en i
		  System.out.println("introduce 6 números para rellenar la primera tabla: ");
	        for (int i = 0; i < tabla1.length; i++) {
	            System.out.print("Tabla1:");
	            tabla1[i] = sc.nextInt();
	        }
			

	        
		//igual con el segundo
	        System.out.println("introduce 6 números para rellenar la segunda tabla: ");
	        for (int i = 0; i < tabla2.length; i++) {
	            System.out.print("Tabla2: ");
	            tabla2[i] = sc.nextInt();
	        }
			
	    //odernamos las dos tablas y las imprimimos
			Arrays.sort(tabla1);
	        Arrays.sort(tabla2);
		
		System.out.println("tabla 1 en orden: "+Arrays.toString(tabla1));
		System.out.println("tabla 2 en orden: "+Arrays.toString(tabla2));
		
		int[] fusion = new int[12];
		int i = 0, j = 0, k = 0;

		// Compara elementos mientras ambos arrays tengan elementos
		while (i < tabla1.length && j < tabla2.length) {
		    if (tabla1[i] <= tabla2[j]) {
		        fusion[k++] = tabla1[i++];
		    } else {
		        fusion[k++] = tabla2[j++];
		    }
		}
	

		System.out.println("fusión: " + Arrays.toString(fusion));

		 int[] fusionSinRepetidos = sinRepetidos(fusion);

	        System.out.println("Fusión sin repetidos: " + Arrays.toString(fusionSinRepetidos));

		 
		
		
	}

		static int[] sinRepetidos(int[] t) {
	
	        int[] fusion = new int[t.length];
	        int k = 0;
	
	        for (int i = 0; i < t.length; i++) {
	
	            boolean rep = false;
	
	            for (int j = 0; j < k; j++) {
	                if (fusion[j] == t[i]) {
	                    rep = true;
	                    break;
	                }
	            }
	
	            if (!rep) {
	                fusion[k++] = t[i];
	            }
	        }
	
	        return Arrays.copyOf(fusion, k);
    }
	
}
