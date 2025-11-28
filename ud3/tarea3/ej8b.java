package ud3.tarea3;

public class ej8b {
	public static void main(String[] args) {
		
		int filas=5;
		int columnas=5;
		
		int min=100;
		int max=0;
		
		int[][] tabla= new int[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				tabla[i][j]= (int) (Math.random()* 100);
				System.out.println(tabla[i][j]);
			}
		}
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (tabla[i][j]<min) {
					min=tabla[i][j];
				}
				if (tabla[i][j]>max) {
					max=tabla[i][j];
				}
			}	
		}
		System.out.println("Maximo:" +max);
		System.out.println("Minimo:" +min);
	}
	
}
