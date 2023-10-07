import java.util.Date;

class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    public Transferencia(String bank, String ncuenta, float m, Date f, OrdenCompra o) {
        super(m,f,o);
        banco = bank;
        numCuenta = ncuenta;
    }
}
