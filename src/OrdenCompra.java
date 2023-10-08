import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Cliente cliente;
    private ArrayList<DetalleOrden> detalles;
    private ArrayList<Pago> pagos;
    private Date fecha;
    private String estado;
    private DocTributario doctributario;
    public OrdenCompra(Cliente c, Date f, ArrayList<Articulo> A, int[] cantArticulos) {
        cliente = c;
        fecha = f;
        pagos = new ArrayList<>();
        for(int i = 0; i<A.size(); i++){
            DetalleOrden detalleOrden = new DetalleOrden(cantArticulos[i], this, A.get(i));
            detalles.add(detalleOrden);
        }
    }
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date f){
        fecha = f;
    }
    public String getEstado(){
        return estado;
    } 
    public void setEstado(String estado){
        this.estado = estado;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente c){
        cliente = c;
    }
    public 
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
