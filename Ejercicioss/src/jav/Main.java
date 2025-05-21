package jav;

public class Main {
    public static void main(String[] args) {
        Superheroe s = new Superheroe("ironman");
        s.setDescripcion("Traje robotico rojo y amarillo.");
        s.setCapa(false);

        System.out.println(s);
        
        System.out.println("-------------");
        
        //Dimension
        Dimencion d = new Dimencion(15.5, 7.2, 5.0);
        System.out.println(d);
        
        // Figura
        Figura figura = new Figura("FIG001", 59.99, d, s);
        System.out.println("FIGURA:");
        System.out.println(figura);

        System.out.println("----------------------------");

        // Precio
        figura.subirPrecio(10.0);
        System.out.println("FIGURA TRAS SUBIR PRECIO:");
        System.out.println("Nuevo precio: $" + figura.getPrecio());;
        
        
        // Coleccion
        Coleccion marvel = new Coleccion("Marvel");
        marvel.anadirFigura(figura); // Añadimos Ironman

        // Otro
        Superheroe thor = new Superheroe("Thor");
        thor.setDescripcion("Dios del trueno con su martillo.");
        thor.setCapa(true);

        Dimencion dimBatman = new Dimencion(18.0, 8.0, 6.0);
        Figura figura2 = new Figura("BAT001", 74.50, dimBatman, thor);
        marvel.anadirFigura(figura2); // Añadimos Batman

        // Mostrar todas las figuras
        System.out.println("COLECCIÓN COMPLETA:");
        System.out.println(marvel);

        
        System.out.println("FIGURAS CON CAPA:");
        System.out.println(marvel.conCapa());


        System.out.println("FIGURA MÁS VALIOSA:");
        System.out.println(marvel.masValioso());

        System.out.println("VALOR TOTAL: $" + marvel.getValorColeccion());
        System.out.println("VOLUMEN TOTAL: " + marvel.getVolumenColeccion() + " cm³");
    }
}