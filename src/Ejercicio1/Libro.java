package Ejercicio1;

public class Libro<autores> {
    private String titulo;
    private double precio;
    private int stock;
    private Autor[] autores;
    private int indice;

    private static final int MAX = 12;


    public Libro(String titulo, double precio, int stock) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = new Autor[MAX];
        this.indice = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void agregarAutor(Autor autor) {
        if (indice < MAX) {
            autores[indice] = autor;
            indice++;
        }
    }

    public String imprimirMensaje() {
        StringBuilder autores = new StringBuilder();
        for (int i = 0; i < indice; i++) {
            autores.append(this.autores[i].getNombre());
            if (i < indice - 1) {
                autores.append(", ");
            }
        }
        return "El libro, " + titulo + " de " +
                autores +
                ". Se vende a " + precio + " pesos.";
    }

}
