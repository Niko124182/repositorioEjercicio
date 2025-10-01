package src;

//Clase MiHilo modificado
class MiHilo2 extends Thread {
    private String nombre;

    // Constructor para identificar los hilos
    public MiHilo2(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        // Imprimir 5 veces el nombre
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo " + nombre + " - numero " + i);

            try {
                Thread.sleep(100); // Una pausa 
            } catch (InterruptedException e) {
                System.out.println("El hilo " + nombre + " fue interrumpido.");
            }
        }
    }
}

// Clase principal
public class Ejercicio3 {
    public static void main(String[] args) {
        // hacer hilos
        MiHilo2 hilo1 = new MiHilo2("A");
        MiHilo2 hilo2 = new MiHilo2("B");
        MiHilo2 hilo3 = new MiHilo2("C");

        // Iniciar hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
