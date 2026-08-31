package ui;

import model.Pedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new PedidoComida(true, 1234,"Calle los patos 123", 5);

        pedido1.mostrarResumen();
        pedido1.calcularTiempoEntrega();
        System.out.println("Tiempo estimado de entrega: " + pedido1.calcularTiempoEntrega() + " min" + " \n ----------------------------------");


        Pedido pedido2 = new PedidoEncomienda(10,true,1234,"Calle javier 123", 7.6);
        pedido2.mostrarResumen();
        pedido2.calcularTiempoEntrega();
        System.out.println("Tiempo estimado de entrega: " + pedido2.calcularTiempoEntrega() + " min" + " \n ----------------------------------");


        Pedido pedido3 = new PedidoExpress(true, 136,"calle tomas 123", 15);
        pedido3.mostrarResumen();
        pedido3.calcularTiempoEntrega();
        System.out.println("Tiempo estimado de entrega: " + pedido3.calcularTiempoEntrega() + " min" + " \n ----------------------------------");

    }
}