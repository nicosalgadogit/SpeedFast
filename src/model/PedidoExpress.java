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
    @Override
    public void asignarRepartidor() {
        super.asignarRepartidor();
        System.out.println("Repartidor mas cercano con disponibilidad inmediata... " + (disponibilidadInmediata ? " OK" : "NO") + " Encontrado,se encuentra a " + this.getDistanciaKm() +"KM");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor + " asignado.\n Repartidor con disponibilidad inmediata..." + (disponibilidadInmediata ? " OK" : "NO") + " Encontrado,se encuentra a " + this.getDistanciaKm() + "KM");
    }
}
