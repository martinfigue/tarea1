import java.util.ArrayList;
import java.util.Date;
abstract class DocTributario{
    private OrdenCompra ordencompra;
    private String numero;
    private String rut;
    private Date fecha;
    public DocTributario(String n, String r, Date f){
        numero = n;
        rut = r;
        fecha = f;
    }
}