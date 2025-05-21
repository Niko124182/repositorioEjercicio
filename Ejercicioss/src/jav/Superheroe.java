package jav;

public class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;

    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    public String Nombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean getCapa() {
        return capa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nDescripción: " + descripcion +
               "\n¿Tiene capa?: " + (capa ? "Sí" : "No");

  }
}