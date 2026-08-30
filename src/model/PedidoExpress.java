package model;

public class PedidoExpress extends Pedido {


    private boolean disponibilidadInmediata;
    private double distanciaKm;


    //const sin

    public PedidoExpress(){
        super();
        this.disponibilidadInmediata = false;
        this.distanciaKm = 0.0;
    }

    //const con
    public PedidoExpress(boolean disponibilidadInmediata, int idpedido, String direccionEntrega, double distanciaKm){
        super(idpedido, direccionEntrega, "Compra Express");
        this.disponibilidadInmediata = disponibilidadInmediata;
        this.distanciaKm = distanciaKm;
    }

    //get-set
    public boolean isDisponibilidadInmediata() {
        return disponibilidadInmediata;
    }
    public void setDisponibilidadInmediata(boolean disponibilidadInmediata) {
        this.disponibilidadInmediata = disponibilidadInmediata;
    }
    public double getDistanciaKm() {
        return distanciaKm;
    }
    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    @Override
    public void asignarRepartidor() {
        super.asignarRepartidor();
        System.out.println("Repartidor mas cercano con disponibilidad inmediata... " + (disponibilidadInmediata ? "OK" : "NO") + "Encontrado,se encuentra a " + this.distanciaKm +"KM");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor + " asignado.\n Repartidor con disponibilidad inmediata..."  + (disponibilidadInmediata ? "OK" : "NO") + " Encontrado,se encuentra a " + this.distanciaKm +"KM");
    }
}
