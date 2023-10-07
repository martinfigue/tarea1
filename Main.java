import java.util.Date;
import java.util.ArrayList;

// Tarea 1
class Cliente{
    private ArrayList<OrdenCompra>
ordencompra;
    private String nombre;
    private String rut;
    public Cliente() {
    }
}
class OrdenCompra{
    private Cliente cliente;
    private ArrayList<DocTributario>
doctributario;
    private Date fecha;
    private String estado;
    public OrdenCompra() {
    }
}
class DetalleOrden{
    private int cantidad;
    private Articulo articulo;
    public DetalleOrden(int n) {
        cantidad = n;

    }
}
class Articulo{
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    private ArrayList<DetalleOrden> detalle;

    public Articulo(float kg, String nom, String desc, float price) {
        peso = kg;
        nombre = nom;
        descripcion = desc;
        precio = price;
        
    }
    public float getPeso(){
        return peso;
    }
    public float getPrecio(){
        return precio;
    }
}
class Direccion{
    private String direccion;

    public Direccion() {
    }
}
abstract class DocTributario{
    private OrdenCompra ordencompra;
    private String numero;
    private String rut;
    private Date fecha;
    public DocTributario(){
    }
}
class  Boleta extends DocTributario{

}
class Factura extends DocTributario{

}
abstract class Pago{
    private float monto;
    private Date fecha;
    public Pago(){
    }
}
class Efectivo extends Pago{
    public Efectivo (int n, Date f){
        fecha = f;
        monto = n;
    }

    public float calcDevolucion(float precio){
        return monto - precio;
    }
}
class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    public Transferencia(String bank, String ncuenta, int n, Date f) {
        monto = n;
        fecha = f;
        banco = bank;
        numCuenta = ncuenta;
    }
}
class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(String type, String ntransaccion, int n, Date f) {
        monto = n;
        fecha = f;
        tipo = type;
        numTransaccion = ntransaccion;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}