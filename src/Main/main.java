package Main;

import Ejercicio1.*;
import Ejercicio2.*;
import Ejercicio3.*;

public class main {
    public static void main(String[] args) {
        ejercicio3();
    }

    public static void ejercicio1(){
        /// Primer autor
        Autor Joshua = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(Joshua.toString());

        /// Segundo Autor
        Autor Sofia = new Autor("Sofia", "Lorentz", "sofia@utn.com", 'F');

        /// Instanciamos el libro
        Libro Java = new Libro("Effective Java", 450, 150);
        Java.agregarAutor(Joshua);
        Java.agregarAutor(Sofia);

        Java.setPrecio(500);
        Java.setStock(Java.getStock()+50);

        System.out.println(Java.imprimirMensaje());

    }

    public static void ejercicio2(){
        /// Creacion del cliente

        Cliente Leo = new Cliente("Leonardo", "leotosoni@hotmail.com", 10.5);

        System.out.println(Leo.toString());

        /// Creacion de la factura

        Factura factura = new Factura(Leo);

        ItemVenta carne = new ItemVenta(120, "milanesas", "carne", 120);
        ItemVenta ravioles = new ItemVenta(10, "ravioles", "pasta", 460);
        ItemVenta bananas = new ItemVenta(150, "bananas", "fruta", 100);

        factura.agregarItem(carne);
        factura.agregarItem(ravioles);
        factura.agregarItem(bananas);

        System.out.println(carne);
        System.out.println("El monto total es: " + factura.getMontoTotal());
        System.out.println("El monto final es: " + factura.getMontoFinal());

        System.out.println(factura.imprimirFactura());
    }

    public static void ejercicio3(){

        ClienteBanco Jorge = new ClienteBanco(33646989, "Jorge", 'M');
        System.out.println(Jorge.toString());

        Cuenta cuentaJorge = new Cuenta(10000, Jorge);

        System.out.println(cuentaJorge.toString());

        cuentaJorge.debito(7000);
        cuentaJorge.credito(2000);
        cuentaJorge.debito(4000);
        cuentaJorge.debito(5000);
        cuentaJorge.credito(9000);

        System.out.println(cuentaJorge.verMovimientos());
        System.out.println(cuentaJorge.toString());


    }
}
