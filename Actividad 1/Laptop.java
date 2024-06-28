
public class Laptop {

    // Atributos de un PC
    private String marca;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;

    // Constructor
    public Laptop(String marca, String modelo, int memoriaRam, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }

    // Métodos
    private void encender() {
        System.out.println("La laptop " + marca + " " + modelo + " se está encendiendo.");
    }

    private void apagar() {
        System.out.println("La laptop " + marca + " " + modelo + " se está apagando.");
    }

    // Método main para probar la clase Laptop
    public static void main(String[] args) {
        Laptop miLaptop = new Laptop("Dell", "XPS 13", 16, 512);
        // Llamar a los métodos privados desde el main
        miLaptop.encender();
        miLaptop.apagar();
    }
}

