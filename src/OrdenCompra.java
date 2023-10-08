import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Cliente cliente;
    private ArrayList<DetalleOrden> detalles;
    private ArrayList<Pago> pagos;
    private Date fecha;
    private String estado;
    public OrdenCompra(Cliente c, Date f, ArrayList<Articulo> A, ArrayList<Pago> P, int[] cantArticulos) {
        cliente = c;
        fecha = f;
        pagos = P;
        for(int i = 0; i<A.size(); i++){
            DetalleOrden detalleOrden = new DetalleOrden(cantArticulos[i], this, A.get(i));
            detalles.add(detalleOrden);
        }
    }
    public void addPago(Pago p){
        pagos.add(p);
    }
    public float calcPrecioSinIVA(){
        float precioSinIva = 0;
        for(int i = 0; i<detalles.size(); i++){
            precioSinIva += detalles.get(i).calcPrecioSinIVA();
        }
        return precioSinIva;
    }
    public float calcIVA(){
        float iva = 0;
        for(int i = 0; i<detalles.size(); i++){
            iva += detalles.get(i).calcIVA();
        }
        return iva;
    }
    public float calcPrecio(){
        float precio = 0;
        for(int i = 0; i< detalles.size(); i++){
            precio += detalles.get(i).calcPrecio();
        }
        return precio;
    }
    public float calcPeso(){
        float peso = 0;
        for(int i = 0; i< detalles.size(); i++){
            peso += detalles.get(i).calcPeso();
        }
        return peso;
    }
}
