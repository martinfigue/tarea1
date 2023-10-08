import java.util.Date;
public class Factura extends DocTributario{
        public Factura(String n, String r, Date f, Direccion direccion, OrdenCompra ordenCompra) {
        super(n, r, f, direccion, ordenCompra);
        
    }
    public String toString() {
        return "Boleta " + super.toString();
    }
}
