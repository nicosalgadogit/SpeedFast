package model;

public class PedidoComida extends Pedido {

    private Boolean mochilaTermica;


    //const. sin

    public PedidoComida() {
        super();
        this.mochilaTermica = false;
    }

    //const. con
    public PedidoComida(Boolean mochilaTermica, int idpedido, String direccionEntrega, double distanciaKm) {
        super(idpedido, direccionEntrega,distanciaKm );
        this.mochilaTermica = mochilaTermica;
    }

    //Get-Set

    public Boolean getMochilaTermica() {
        return mochilaTermica;
    }
    public void setMochilaTermica(Boolean mochilaTermica) {
        this.mochilaTermica = mochilaTermica;
    }

    @Override
    public double calcularTiempoEntrega() {
        return 15 + 2 * getDistanciaKm();
    }

}
