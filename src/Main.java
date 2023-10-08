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
        ArrayList<Articulo> a1 = new ArrayList<Articulo>(2);
        a1.add(mesa);
        a1.add(silla);
        a1.add(mesa);
        OrdenCompra orden1 = new OrdenCompra(c1, f1, "pendiente");
        c1.addCompra(orden1);
        

        Efectivo e1 = new Efectivo(2000, f1, orden1);
    }
}