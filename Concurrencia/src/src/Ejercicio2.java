package src;


class MiTarea implements Runnable {
    @Override
    public void run() {
        System.out.println("Holaaa Runnable");
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        MiTarea tarea = new MiTarea();
        Thread hilo = new Thread(tarea);
        hilo.start();
    }
}
