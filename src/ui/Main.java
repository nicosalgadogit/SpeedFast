package ui;

import model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        List<Pedido> pedidos1 = new ArrayList<>();
        pedidos1.add(new PedidoComida(true, 123, "Calle los toros", 4));
        pedidos1.add(new PedidoExpress(true, 124, "Calle los patos", 2));


        List<Pedido> pedidos2 = new ArrayList<>();
        pedidos2.add(new PedidoComida(true, 153, "Calle los robles", 6));
        pedidos2.add(new PedidoExpress(true, 154, "Calle los perros", 5));

        List<Pedido> pedidos3 = new ArrayList<>();
        pedidos3.add(new PedidoComida(true, 127, "Calle los gatos", 7));
        pedidos3.add(new PedidoExpress(true, 126, "Calle los pajaros", 8));


        Repartidor r1 = new Repartidor("Juan", pedidos1);
        Repartidor r2 = new Repartidor("Pedro", pedidos2);
        Repartidor r3 = new Repartidor("Jose", pedidos3);

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
        System.out.println("Todas las entregas han finalizado.");
    }

}