import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Cliente cliente;
    private ArrayList<DetalleOrden> detalles;
    private ArrayList<Pago> pagos;
    private Date fecha;
    private String estado;
    public OrdenCompra(Cliente c, Date f, String state) {
        cliente = c;
        fecha = f;
        estado = state;
        pagos = new ArrayList<>();
        detalles = new ArrayList<>();
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

    public void addPago(Pago p){
        pagos.add(p);
    }
    public void addDetalle(DetalleOrden d, int cant){
        detalles.add(new DetalleOrden(cant, this));
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
