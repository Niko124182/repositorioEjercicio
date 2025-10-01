//Ejercicio 1

package src;

//Main.java
public class Main {
	 public static void main(String[] args) {
	     // Crear instancia de MiHilo
	     MiHilo hilo = new MiHilo();

	     // Iniciar el hilo
	     hilo.start();  
	 }
}

//si llamas hilo.run() en lugar de hilo start() no creas un nuevo hilo ya que el hilo.run() solo hace una llamada normal
