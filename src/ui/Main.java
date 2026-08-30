package ui;

import model.Pedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new PedidoComida(true, 132, "Av.siempreviva123");

        pedido1.asignarRepartidor();
        pedido1.asignarRepartidor("Juan Topo");

        Pedido pedido2 = new PedidoEncomienda(1.2, true, 546, "calle los dominicos");
        pedido2.asignarRepartidor();
        pedido2.asignarRepartidor("Juan pato");

        Pedido pedido3 = new PedidoExpress(true, 136,"calle siempremuerte123", 1.3);
        pedido3.asignarRepartidor();
        pedido3.asignarRepartidor("Juan pez");
    }
}