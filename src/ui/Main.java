package ui;

import model.Pedido;
import model.Repartidor;
import model.ZonaDeCarga;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

        zonaDeCarga.agregarPedido(new Pedido(123, "Calle Las Vizcachas 124"));
        zonaDeCarga.agregarPedido(new Pedido(254, "Calle Los Patos 312"));
        zonaDeCarga.agregarPedido(new Pedido(377, "Calle Parque del agua 789"));
        zonaDeCarga.agregarPedido(new Pedido(488, "Calle Las Rosas 12"));
        zonaDeCarga.agregarPedido(new Pedido(545, "Calle Los Gatos 453"));
        zonaDeCarga.agregarPedido(new Pedido(689, "Calle Los Perros 654"));

        zonaDeCarga.marcarSinMasPedidos();

        Repartidor r1 = new Repartidor("Repartidor-1", zonaDeCarga);
        Repartidor r2 = new Repartidor("Repartidor-2", zonaDeCarga);
        Repartidor r3 = new Repartidor("Repartidor-3", zonaDeCarga);

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(r1);
        executor.submit(r2);
        executor.submit(r3);

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Todos los pedidos han sido entregados correctamente.");
    }
}