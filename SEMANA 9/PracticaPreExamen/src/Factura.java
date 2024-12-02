import java.util.List;

public class Factura {
    private String nombre;
    private String id;
    private List<String> RefFactura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getRefFactura() {
        return RefFactura;
    }

    public Factura setRefFactura(String refFactura) {
        return this;
    }
}
