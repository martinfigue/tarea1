import java.util.ArrayList;
import java.util.Date;
public class Cliente{
    private ArrayList<OrdenCompra> ordencompra;
    private String nombre;
    private String rut;
    private Direccion direccion;
    public Cliente(String n, String r, Direccion d) {
        nombre = n;
        rut = r;
        direccion = d;
    }
}
