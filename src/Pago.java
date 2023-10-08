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
    public OrdenCompra getOrden(){
        return ordencompra;
    }
}