import java.util.Date;
import java.util.ArrayList;

// Tarea 1
class Cliente{
    private ArrayList<OrdenCompra> ordencompra;
    private String nombre;
    private String rut;
    private Direccion direccion;
    public Cliente(String n, String r, String d) {
        nombre = n;
        rut = r;
        direccion = d;
    }
}
class OrdenCompra{
    private Cliente cliente;
    private ArrayList<DocTributario> doctributario;
    private Date fecha;
    private String estado;
    public OrdenCompra() {
    }
}
class DetalleOrden{
    private int cantidad;
    private Articulo articulo;
    private OrdenCompra orden;
    public DetalleOrden(int n, OrdenCompra o) {
        cantidad = n;
        orden = o;
        o.print();

    }
}
class Articulo{
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    private ArrayList<DetalleOrden> detalles;

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
    private ArrayList<DocTributario> doctributarios;
    private ArrayList<Cliente> clientes;

    public Direccion() {
    }
}
abstract class DocTributario{
    private OrdenCompra ordencompra;
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;
    public DocTributario(String n, String r, Date f){
        numero = n;
        rut = r;
        fecha = f;
    }
}
class  Boleta extends DocTributario{
    public Boleta(String n, String r, Date f){
        super(n, r , f);
    }
}
class Factura extends DocTributario{
    public Factura(String n, String r, Date f) {
        super(n, r, f);
        
    }
}
abstract class Pago{
    private float monto;
    private Date fecha;
    public Pago(float m, Date f){
        monto = m;
        fecha = f;
    }
    public float getMonto(){
        return monto;
    }
}
class Efectivo extends Pago{
    public Efectivo (float m, Date f){
        super(m,f);
    }

    public float calcDevolucion(float precio){
        float m = getMonto();
        return m - precio;
    }
}
class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    public Transferencia(String bank, String ncuenta, float m, Date f) {
        super(m,f);
        banco = bank;
        numCuenta = ncuenta;
    }
}
class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(String type, String ntransaccion, float m, Date f) {
        super(m,f);
        tipo = type;
        numTransaccion = ntransaccion;
    }
}
public class Main {
    public static void main(String[] args) {
    }
}