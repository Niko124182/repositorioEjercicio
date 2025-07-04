
import java.util.Random;
import java.util.concurrent.Semaphore;

class Vehiculo extends Thread {
    private String nombre;
    private int pista;
    private Semaphore semaforo;

    public Vehiculo(String nombre, int pista, Semaphore semaforo) {
        this.nombre = nombre;
        this.pista = pista;
        this.semaforo = semaforo;
    }

    public void run() {
        try {
            semaforo.acquire(); 
            System.out.println(nombre + " entrando en la pista " + pista);
            Random random = new Random();
            int tiempoPrueba = random.nextInt(9000) + 1000; // 9 y 1 segundos
            Thread.sleep(tiempoPrueba);
            System.out.println(nombre + " completó la prueba en la pista " + pista + " en " + (tiempoPrueba / 1000) + " segundos.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaforo.release();
        }
    }
}

public class coches {
    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(3);

        Vehiculo vehiculo1 = new Vehiculo("Vehículo 1", 1, semaforo);
        Vehiculo vehiculo2 = new Vehiculo("Vehículo 2", 2, semaforo);
        Vehiculo vehiculo3 = new Vehiculo("Vehículo 3", 3, semaforo);

        vehiculo1.start();
        vehiculo2.start();
        vehiculo3.start();
    }
}