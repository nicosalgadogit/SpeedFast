package model;

public class PedidoEncomienda extends Pedido {

    private double peso;
    private boolean embalajeValido;

//const sin
    public PedidoEncomienda(){
        super();
        this.embalajeValido = false;
        this.peso = 0.0;
    }

    //const con
    public PedidoEncomienda(double peso, boolean embalajeValido, int idpedido, String direccionEntrega, double distanciaKm){
        super(idpedido,direccionEntrega,distanciaKm );
        this.peso = peso;
        this.embalajeValido = embalajeValido;
    }

    //get-Set
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public boolean isEmbalajeValido() {
        return embalajeValido;
    }
    public void setEmbalajeValido(boolean embalajeValido) {
        this.embalajeValido = embalajeValido;
    }

    @Override
    public double calcularTiempoEntrega() {
        return Math.round(20 + 1.5 * getDistanciaKm());
    }
    @Override
    public void asignarRepartidor() {
        super.asignarRepartidor();
        System.out.println("Validando peso y embalaje... " + (embalajeValido ? " OK" : "NO") + "\n Peso: " + this.peso);
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor + " asignado.\n Validando peso y embalaje..." + (embalajeValido ? " OK" : "NO") + "\n Peso: " + this.peso);
    }
}
