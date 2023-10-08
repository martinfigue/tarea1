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
    public void setPeso(float kg){
        peso = kg;
    }
    public float getPrecio(){
        return precio;
    }
    public void setPrecio(float price){
        precio = price;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String desc){
        descripcion = desc;
    }
    public String toString(){
        return "Articulo" + nombre + " " + descripcion
                          + " " + peso + " " + precio;
    }
}
