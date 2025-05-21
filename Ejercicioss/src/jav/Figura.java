package jav;
public class Figura {
    // Propiedades
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimencion dimensiones;

    // Constructor
    public Figura(String codigo, double precio, Dimencion dimensiones, Superheroe superheroe) {
        this.codigo = codigo;
        this.precio = precio;
        this.dimensiones = dimensiones;
        this.superheroe = superheroe;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public Dimencion getDimensiones() {
        return dimensiones;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public void setDimensiones(Dimencion dimensiones) {
        this.dimensiones = dimensiones;
    }


    public void subirPrecio(double cantidad) {
        this.precio += cantidad;
    }


    @Override
    public String toString() {
        return "Código: " + codigo +
               "\nPrecio: $" + precio +
               "\nSuperhéroe:\n" + superheroe.toString() +
               "\nDimensiones:\n" + dimensiones.toString();
    }
}