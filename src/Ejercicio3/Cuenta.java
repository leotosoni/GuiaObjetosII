package Ejercicio3;

import java.util.Random;

public class Cuenta {

    private int identificador;
    private double balance;
    private ClienteBanco cliente;
    private String[] movimientos;
    private int indice;


    public Cuenta(double balance, ClienteBanco cliente) {
        Random rand = new Random();
        this.identificador = rand.nextInt(100);
        this.balance = balance;
        this.cliente = cliente;
        this.movimientos = new String[30];
        this.indice = 0;
    }

    public double credito(double deposito) {
        this.balance += deposito;
        movimientos[indice++] = "El " + cliente.getNombre() + " deposito $" + deposito + ".";
        return this.balance;
    }

    public double debito(double extraccion) {
        if (this.balance - extraccion <= -2000) {
            System.out.println("No puedo retirar mas dinero ... :C");
        } else {
            this.balance -= extraccion;
            movimientos[indice++] = "El " + cliente.getNombre() + " retiro $" + extraccion + ".";
        }
        return this.balance;
    }

    public StringBuilder verMovimientos() {
        StringBuilder sb = new StringBuilder("-----MOVIMIENTOS-----");
        for (String movimiento : movimientos) {
            if (movimiento == null) {
                continue;
            }
            sb.append("\n"+movimiento);
        }

        return sb;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "identificador=" + identificador +
                ", balance=" + balance +
                ", cliente=" + cliente.getNombre() +
                '}';
    }
}
