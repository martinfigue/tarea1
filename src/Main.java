import java.util.ArrayList;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date f1 = new Date();
        Direccion d1 = new Direccion("calle56");
        Cliente c1 = new Cliente("Martin", "1234", d1);
        Articulo art1 = new Articulo(20, "mesa", "mueble", 1000);
        Articulo art2 = new Articulo(10, "silla", "mueble", 500);
        ArrayList<Articulo> a1 = new ArrayList<Articulo>(2);
        a1.add(art1);
        a1.add(art2);
        OrdenCompra orden1 = new OrdenCompra(c1, f1, "pendiente");
        Efectivo e1 = new Efectivo(2000, f1, orden1);
    }
}