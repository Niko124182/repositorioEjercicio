package jav;

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    // Constructor
    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    // Getter y Setter
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    // Método para añadir figuras
    public void anadirFigura(Figura fig) {
        listaFiguras.add(fig);
    }


    public void subirPrecio(double cantidad, String id) {
        for (Figura fig : listaFiguras) {
            if (fig.getCodigo().equals(id)) {
                fig.subirPrecio(cantidad);
                break;
            }
        }
    }

    // Mostrar todas las figuras
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Colección: ").append(nombreColeccion).append("\n");
        sb.append("Figuras:\n");
        for (Figura fig : listaFiguras) {
            sb.append("----------------------------\n");
            sb.append(fig.toString()).append("\n");
        }
        return sb.toString();
    }

    // Mostrar figuras capa
    public String conCapa() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figuras con capa:\n");
        for (Figura fig : listaFiguras) {
            if (fig.getSuperheroe().getCapa()) {
                sb.append(fig.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    // Figura mas cara
    public Figura masValioso() {
        if (listaFiguras.isEmpty()) return null;

        Figura masCara = listaFiguras.get(0);
        for (Figura fig : listaFiguras) {
            if (fig.getPrecio() > masCara.getPrecio()) {
                masCara = fig;
            }
        }
        return masCara;
    }

    // Valor total
    public double getValorColeccion() {
        double total = 0.0;
        for (Figura fig : listaFiguras) {
            total += fig.getPrecio();
        }
        return total;
    }

    // Volumen total
    public double getVolumenColeccion() {
        double volumenTotal = 0.0;
        for (Figura fig : listaFiguras) {
            volumenTotal += fig.getDimensiones().getVolumen();
        }
        return volumenTotal + 200;
    }
}