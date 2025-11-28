package ud3.tarea3;

public class ej8 {
	public static void main(String[] args) {
		
		// Crear una tabla bidimensional de tamaño 5x5 
		//y rellenarla de la siguiente forma: 
		//la posición [n,m] debe contener n+m. 
		//Después, se debe mostrar su contenido
		int filas=5;
		int columnas=5;
		
		int[][] tabla= new int[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				tabla[i][j]=i+j;
			}
		}
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
