package Ejercicio2;

public class ItemVenta {
    private int id;
    private String nombre;
    private String descripcion;
    private double pUnitario;

    public ItemVenta(int id, String nombre, String descripcion, double pUnitario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pUnitario = pUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getpUnitario() {
        return pUnitario;
    }

    @Override
    public String toString() {
        return "Item: " + nombre + ", " + descripcion + ", $" + pUnitario;
    }
}
