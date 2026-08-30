package model;

public class PedidoComida extends Pedido {

    private Boolean mochilaTermica;


    //const. sin

    public PedidoComida() {
        super();
        this.mochilaTermica = false;
    }



    //const. con
    public PedidoComida(Boolean mochilaTermica, int idpedido, String direccionEntrega) {
        super(idpedido, direccionEntrega, "Comida");
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
    public void asignarRepartidor() {
        super.asignarRepartidor();
        System.out.println("Verificando mochila termica... " + (mochilaTermica ? "OK" : "NO"));
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor + " asignado.\n Verificando mochila termica... " + (mochilaTermica ? "OK" : "NO"));
    }
}
