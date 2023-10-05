import java.util.Date;

// Tarea 1
class Cliente{
    private String nombre;
    private String rut;

    public Cliente() {
    }
}
class OrdenCompra{
    private Date fecha;
    private String estado;

    public OrdenCompra() {
    }
}
class DetalleOrden{
    private int cantidad;

    public DetalleOrden() {
    }
}
class Articulo{
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public Articulo(float kg, String nom, String desc, float price) {
        peso = kg;
        nombre = nom;
        descripcion = desc;
        precio = price;
    }
}
class Direccion{
    private String direccion;

    public Direccion() {
    }
}
class DocTributario{
    private String numero;
    private String rut;
    private Date fecha;
    public DocTributario(){
    }
}
class Pago {
    private float monto;
    private Date fecha;
    public Pago() {
    }
}
class Efectivo extends Pago{
    public Efectivo (){
    }
}
class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    public Transferencia() {
    }
}
class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta() {
    }
}
public class Main {
    public static void main(String[] args) {

    }
}