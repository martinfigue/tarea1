import java.util.Date;

public abstract class Pago{
    private float monto;
    private Date fecha;
    private OrdenCompra ordencompra;
    public Pago(float m, Date f, OrdenCompra orden){
        monto = m;
        fecha = f;
        ordencompra = orden;
    }
    public float getMonto(){
        return monto;
    }
    public void setMonto(float m){
        monto = m;
    }
    public Date getFecha(){
        return  fecha;
    }
    public void setFecha(Date f){
        fecha = f;
    }
    public OrdenCompra getOrden(){
        return ordencompra;
    }
    public void setOrden(OrdenCompra orden){
        ordencompra = orden;
    }
    public String toString(){
        return "Monto" + monto + "fecha" + fecha.toString();
    }
}