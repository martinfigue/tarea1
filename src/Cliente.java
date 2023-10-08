import java.util.ArrayList;
public class Cliente{
    private ArrayList<OrdenCompra> compras;
    private String nombre;
    private String rut;
    private Direccion direccion;
    public Cliente(String n, String r, Direccion d) {
        nombre = n;
        rut = r;
        direccion = d;
        this.compras = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String r) {
        rut = r;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void addCompra(OrdenCompra compra) {
        compras.add(compra);
    }

    public OrdenCompra getCompra(int a) {
        if (a < 0 || a > compras.size() - 1) return null;
        return this.compras.get(a);
    }
    public String toString() {
        return "Cliente " + this.nombre
                + "\n" + "Rut: " + this.rut
                + "\n" + "Direccion: " + this.direccion.toString();
    }
}
