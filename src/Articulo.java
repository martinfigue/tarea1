import java.util.ArrayList;

public class Articulo {
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
