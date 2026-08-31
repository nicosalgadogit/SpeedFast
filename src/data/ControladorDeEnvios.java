package data;

import model.Pedido;
import model.Despachable;
import model.Cancelable;
import model.Rastreable;
import java.util.ArrayList;

public class ControladorDeEnvios implements Despachable, Cancelable, Rastreable {

    private ArrayList<Pedido> historial = new ArrayList<>();

    @Override
    public void despachar(Pedido p) {
        historial.add(p);
        System.out.println("Pedido #" + p.getIdPedido() + " despachado con éxito.");
    }

    @Override
    public void cancelar(Pedido p) {
        System.out.println("Cancelando pedido #" + p.getIdPedido() + "...");
        System.out.println("Pedido #" + p.getIdPedido() +  " cancelado exitosamente.");
    }

    @Override
    public void verHistorial() {
        System.out.println("--- Historial de despachos ---");
        for (Pedido p : historial) {
            p.mostrarResumen();
        }
    }
}