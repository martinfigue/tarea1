import java.util.Date;

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(String type, String ntransaccion, float m, Date f, OrdenCompra o) {
        super(m,f,o);
        tipo = type;
        numTransaccion = ntransaccion;
    }
}