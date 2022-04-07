package Ejercicio2;

import java.time.LocalDate;
import java.util.UUID;

public class Factura {
    private String idFactura;
    /// private double montoTotal;
    private LocalDate fecha;
    private Cliente cliente;
    private ItemVenta[] items;
    private int indice;

    public static final int tope = 20;

    public Factura(Cliente cliente) {
        UUID uuid = UUID.randomUUID();
        this.idFactura = uuid.toString();
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.items = new ItemVenta[tope];
        this.indice = 0;
    }

    public void agregarItem(ItemVenta item) {
        if (indice < tope) {
            items[indice] = item;
            indice++;
        }
    }

    public double getMontoTotal() {
        double montoTotal = 0.0;

        for (ItemVenta item : this.items) {
            if (item == null) {
                continue;
            }
            montoTotal += item.getpUnitario();
        }
        return montoTotal;
    }

    public double getMontoFinal() {
        return (100 - cliente.getDescuento()) * this.getMontoTotal() / 100;
    }


    public StringBuilder imprimirFactura() {

        StringBuilder sb = new StringBuilder("---------Factura---------");

        sb.append("\nidFactura: " + idFactura)
                .append("\nFecha: " + fecha);

        for (ItemVenta item : this.items) {
            if (item == null) {
                continue;
            }
            sb.append("\n" + item.toString());
        }

        sb.append("\nMonto Total: " + getMontoTotal());
        sb.append("\nMonto Final: " + getMontoFinal());

        return sb;
    }
}

