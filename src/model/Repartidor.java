package model;

public class Repartidor implements Runnable {

    private String nombre;
    private ZonaDeCarga zonaDeCarga;

    public Repartidor(String nombre, ZonaDeCarga zonaDeCarga) {
        this.nombre = nombre;
        this.zonaDeCarga = zonaDeCarga;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public void run() {
        while (true) {
            Pedido p = zonaDeCarga.retirarPedido();
            if (p == null) break;

            p.setEstado(EstadoPedido.EN_REPARTO);
            System.out.println(nombre + " retiró y está en reparto: " + p);

            try {
                Thread.sleep(1000 + (int) (Math.random() * 2000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            p.setEstado(EstadoPedido.ENTREGADO);
            System.out.println(nombre + " completó la entrega: " + p);
        }
        System.out.println(nombre + " no tiene más pedidos por retirar. Fin de turno.");
    }
}