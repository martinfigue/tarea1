import java.util.Date;
public class  Boleta extends DocTributario{
        public Boleta(String n, String r, Date f, Direccion direccion, OrdenCompra ordenCompra){
        super(n, r , f, direccion, ordenCompra);
    }
    public String toString() {
        return "Boleta" + super.toString();
    }
}  
