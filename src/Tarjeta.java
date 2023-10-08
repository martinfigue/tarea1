import java.util.Date;

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(String type, String ntransaccion, float m, Date f, OrdenCompra o) {
        super(m,f,o);
        tipo = type;
        numTransaccion = ntransaccion;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String type){
        tipo = type;
    }
    public String getNtransaccion(){
        return numTransaccion;
    }
    public void setNtransaccion(String ntransaccion){
            numTransaccion = ntransaccion;
    }

    public String toString(){
        return "Tarjeta" + tipo + "Transaccion" + numTransaccion + super.toString();
    }
}