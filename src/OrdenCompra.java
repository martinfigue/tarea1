import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Cliente cliente;
    private ArrayList<DetalleOrden> detalles;
    private Date fecha;
    private String estado;
    public OrdenCompra(Cliente c, Date f, ArrayList<Articulo> A, int[] B) {
        cliente = c;
        fecha = f;
        for(int i = 0; i<A.size(); i++){
            DetalleOrden detalleOrden = new DetalleOrden(B[i], this, A.get(i));
            detalles.add(detalleOrden);
        }
    }
}
