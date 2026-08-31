package model;

public class PedidoExpress extends Pedido {


    private boolean disponibilidadInmediata;


    //const sin

    public PedidoExpress(){
        super();
        this.disponibilidadInmediata = false;
    }

    //const con
    public PedidoExpress(boolean disponibilidadInmediata, int idpedido, String direccionEntrega, double distanciaKm){
        super(idpedido, direccionEntrega, distanciaKm );
        this.disponibilidadInmediata = disponibilidadInmediata;
    }

    //get-set
    public boolean isDisponibilidadInmediata() {
        return disponibilidadInmediata;
    }
    public void setDisponibilidadInmediata(boolean disponibilidadInmediata) {
        this.disponibilidadInmediata = disponibilidadInmediata;
    }



    @Override
    public double calcularTiempoEntrega() {
        return getDistanciaKm() > 5 ? 10 + 5 : 10;
    }

}
