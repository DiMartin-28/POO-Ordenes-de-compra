import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private static int ultimoId;
    private int indiceProductos;

    public OrdenCompra(String descripcion) {
        this.id = ++ultimoId;
        this.descripcion = descripcion;
        this.productos = new Producto[3];
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getIndiceProductos() {
        return indiceProductos;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto){
        if (indiceProductos < productos.length){
            this.productos[indiceProductos++] = producto;
        }
    }

    public int calcularTotal(){
        int total = 0;
        for (Producto p : productos){
            total += p.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "OrdenCompra{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", productos=" + Arrays.toString(productos) +
                ", indeceProductos=" + indiceProductos +
                '}';
    }
}
