package co.icesi.edu.model;

public class Billboard {

    // Atributos que representan las características de un cartel publicitario.
    private double width;   // Ancho del cartel
    private double height;  // Altura del cartel
    private boolean inUse;  // Indica si el cartel está en uso o no
    private String brand;   // Marca asociada al cartel

    // Constructor que inicializa los atributos al crear una instancia de la clase.
    public Billboard(double width, double height, boolean inUse, String brand) {
        this.width = width;
        this.height = height;
        this.inUse = inUse;
        this.brand = brand;
    }

    // Métodos de acceso para obtener los valores de los atributos.
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean getIsInUse() {
        return inUse;
    }

    public String getBrand() {
        return brand;
    }

    // Método para calcular el área del cartel.
    public double calculateArea() {
        return width * height;
    }
}
