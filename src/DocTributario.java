
import java.util.Date;
abstract class DocTributario{
    private OrdenCompra ordencompra;
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;
    public DocTributario(String n, String r, Date f, Direccion direccion, OrdenCompra ordenCompra){
        numero = n;
        rut = r;
        fecha = f;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String n){
        numero = n;
    }
    public String getRut(){
        return rut;
    }
    public void setRut(String r){
        rut = r;
    }
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date f) {
        fecha = f;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public OrdenCompra getCompra() {
        return ordencompra;
    }

    public void setCompra(OrdenCompra ordencompra) {
        this.ordencompra = ordencompra;
    }
}