import java.util.Date;

class Efectivo extends Pago{
    public Efectivo (float m, Date f, OrdenCompra o){
        super(m,f,o);
    }

    public float calcDevolucion(){
        float monto = getMonto();
        OrdenCompra orden = getOrden();
        float precio = orden.calcPrecio();
        return monto - precio;
    }
    public String toString() {
        return "Efectivo " + super.toString();
    }
}
