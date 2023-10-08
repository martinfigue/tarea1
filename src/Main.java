import java.util.ArrayList;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date f1 = new Date();
        Date f2 = new Date();
        Date f3 = new Date();
        Direccion d1 = new Direccion("calle56");
        Direccion d2 = new Direccion("calle1029");
        Direccion d3 = new Direccion("calle1987");
        Cliente c1 = new Cliente("Martin", "14.234.543-4", d1);
        Cliente c2 = new Cliente("Ignacio", "22.504.959-3", d2);
        Cliente c3 = new Cliente("Mauricio", "12..654.768-9", d3);
        Articulo mesa = new Articulo(20, "mesa", "mueble", 1000);
        Articulo silla = new Articulo(10, "silla", "mueble", 500);
        Articulo lampara = new Articulo(5, "lampara", "mueble", 250);
        Articulo alfombra = new Articulo(4, "alfombra", "alfombra de comedor", 600);
        Articulo velador = new Articulo(10, "velador", "mueble", 700);
        ArrayList<Articulo> a1 = new ArrayList<Articulo>(2);
        a1.add(mesa);
        a1.add(silla);
        a1.add(mesa);
        OrdenCompra orden1 = new OrdenCompra(c1, f1, "pendiente");
        c1.addCompra(orden1);
        orden1.addDetalleOrden(mesa, 2);
        orden1.addDetalleOrden(silla, 4);
        orden1.addDetalleOrden(lampara, 3);
        orden1.addDetalleOrden(alfombra, 2);
        orden1.addDetalleOrden(velador, 1);
        printArticulos(mesa);
        printArticulos(silla);
        printArticulos(lampara);
        printArticulos(alfombra);
        printArticulos(velador);
        OrdenCompra orden2 = new OrdenCompra(c2, f2, "pendiente");
        c2.addCompra(orden2);
        orden2.addDetalleOrden(mesa, 1);
        orden2.addDetalleOrden(silla, 5);
        orden2.addDetalleOrden(lampara, 2);
        orden2.addDetalleOrden(alfombra, 2);
        orden2.addDetalleOrden(velador, 5);

        OrdenCompra orden3 = new OrdenCompra(c3, f3, "pendiente");
        c3.addCompra(orden3);
        orden3.addDetalleOrden(mesa, 6);
        orden3.addDetalleOrden(silla, 4);
        orden3.addDetalleOrden(lampara, 2);
        orden3.addDetalleOrden(alfombra, 3);
        orden3.addDetalleOrden(velador, 7);

        Efectivo e1 = new Efectivo(400000, f1, orden1);
        orden1.setEstado("compra exitosa");
        Transferencia tran1 = new Transferencia("Santander", "1001", 8700, f1, orden2);
        orden2.setEstado("compra exitosa");
        Tarjeta tar1 = new Tarjeta("Credito","10004", 10200, f2, orden3);
        Tarjeta tar2 = new Tarjeta("Credito","10010", 5000, f3,orden3);
        orden3.setEstado("compra exitosa");
        printClientes(c1);
        printClientes(c2);
        printClientes(c3);
    }

    static public void printClientes(Cliente... clientes) {
        System.out.println("Cliente:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }
    static public void printArticulos(Articulo... articulos) {
        System.out.println("Articulos:");
        for (Articulo articulo : articulos) {
            System.out.println(articulo.toString());
        }
        System.out.println();
    }
    

}