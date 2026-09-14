package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Repartidor implements Runnable {

    private String nombre;
    private List<Pedido> pedidos;

    public Repartidor(String nombre, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.pedidos = pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (Pedido p : pedidos) {
            System.out.println(nombre + " esta iniciando la entrega del pedido #" + p.getIdPedido());
                p.mostrarResumen();
            int tiempoEspera = random.nextInt(3000) + 1000;
            try {
                Thread.sleep(tiempoEspera);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(nombre + " completó la entrega del pedido #" + p.getIdPedido() + " (" + tiempoEspera + ")");
        }
        System.out.println(nombre + " ha finalizado todas sus entregas.");
    }
}
