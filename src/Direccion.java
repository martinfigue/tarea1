
public class Direccion{
    private String direccion;


    public Direccion(String d) {
        direccion = d;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String toString() {
        return "Direccion: " + this.direccion;
    }
}
