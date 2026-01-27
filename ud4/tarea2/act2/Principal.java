package tarea2.act2;

public class Principal {
	public static void main(String[] args) {
		
		PilaTabla pila = new PilaTabla();
		
		pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);

        pila.cima();      // 8
        pila.desapilar();
        pila.cima();      // 5

        pila.mostrarPila(); // [3, 5]
    }
}