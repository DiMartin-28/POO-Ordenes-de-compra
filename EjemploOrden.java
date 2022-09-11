import java.util.Date;

public class EjemploOrden {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("Compra de componentes para PC");
        orden1.setCliente(new Cliente("Marcelo", "Valdivieso"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Intel","Motherboard",9500));
        orden1.addProducto(new Producto("AMD","Placa de video", 23000));
        orden1.addProducto(new Producto("Dell","Notebook 15",87000));

        OrdenCompra orden2 = new OrdenCompra("Repuestos de automóviles");
        orden2.setCliente(new Cliente("Salvatore","Valentino"));
        orden2.setFecha(new Date());

        orden2.addProducto(new Producto("Fiat","Par de luces delanteras fiat palio",2500));
        orden2.addProducto(new Producto("Renault","Embregue renault 19",3000));
        orden2.addProducto(new Producto("Wolkswagen","DireccionVento",5000));

        OrdenCompra[] ordenes = {orden1, orden2};

        for (OrdenCompra o : ordenes){
            System.out.println("Id de la compra : " + o.getId());
            System.out.println("Cliente de la compra : " + o.getCliente());
            System.out.println("Descripcion de la compra : " + o.getDescripcion());
            System.out.println("Fecha de la compra : " + o.getFecha());
            System.out.println("Total de la compra : " + o.calcularTotal());

            int i = 1;
            for (Producto p : o.getProductos()){
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " " + " precio $ : " + p.getPrecio());
                i++;
            }
            System.out.println("----------------------------------- siguiente ---------------------------------------");
        }


    }
}
