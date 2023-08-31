import java.util.Date;

public class Comanda {
    private int id;
    private String Pedido;
    private Date hora;

    public Comanda(int id, String pedido) {
        this.id = id;
        Pedido = pedido;
        this.hora = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPedido() {
        return Pedido;
    }

    public void setPedido(String pedido) {
        Pedido = pedido;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "id=" + id +
                ", Pedido='" + Pedido + '\'' +
                ", hora=" + hora +
                '}';
    }
}
