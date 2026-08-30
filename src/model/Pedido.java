package model;

public class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    //Const. sin parametros

    public Pedido() {
        this.idPedido = 0;
        this.direccionEntrega = "";
        this.tipoPedido = "";
    }
    //Const con param
    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
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
    public String getTipoPedido() {
        return tipoPedido;
    }
    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    //Metodo asignarRepartidor()

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor );
    }

    public void asignarRepartidor() {
        System.out.println("Buscando repartidor para el pedido #" + idPedido);
    }

}
