package Ejercicio3;

import java.util.Random;

public class ClienteBanco {
    private int id;
    private String nombre;
    private char genero; /// M o F

    public ClienteBanco(int id, String nombre, char genero) {
        this.id = id;
        this.nombre = nombre;

        if(genero == 'M' || genero == 'F'){
            this.genero = genero;
        } else {this.genero = 'M';}
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ClienteBanco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }
}
