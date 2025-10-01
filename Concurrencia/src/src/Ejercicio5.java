package src;

class Buffer {
    private int dato;
    private boolean disponible = false;

    public synchronized void put(int valor) {
        while (disponible) {
            try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
        this.dato = valor;
        disponible = true;
        System.out.println("Productor puso: " + dato);
        notifyAll();
    }

    public synchronized int get() {
        while (!disponible) {
            try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
        disponible = false;
        System.out.println("Consumidor obtuvo: " + dato);
        notifyAll();
        return dato;
    }
}

class Productor extends Thread {
    private Buffer buffer;
    public Productor(Buffer b) { this.buffer = b; }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) { // ejemplo: 10 datos
            buffer.put(i);
            try { Thread.sleep(100); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }
}

class Consumidor extends Thread {
    private Buffer buffer;
    public Consumidor(Buffer b) { this.buffer = b; }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            int v = buffer.get();
            try { Thread.sleep(150); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Productor(buffer).start();
        new Consumidor(buffer).start();
    }
}
