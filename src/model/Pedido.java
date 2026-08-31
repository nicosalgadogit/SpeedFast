package model;

public abstract class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private double distanciaKm;

    //Const. sin parametros

    public Pedido() {
        this.idPedido = 0;
        this.direccionEntrega = "";
        this.distanciaKm = 0;
    }

    //Const con param
    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    //Get-Set

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido);
        System.out.println(" Direccion: " + direccionEntrega);
        System.out.println(" Distancia: " + distanciaKm + "Km");
    }


    public abstract double calcularTiempoEntrega();


    public void asignarRepartidor() {
        System.out.println("Buscando repartidor para el pedido #" + idPedido);
    }


    //Metodo asignarRepartidor()

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }
}
