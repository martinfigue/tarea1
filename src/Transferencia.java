import java.util.Date;

class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    public Transferencia(String bank, String ncuenta, float m, Date f, OrdenCompra o) {
        super(m,f,o);
        banco = bank;
        numCuenta = ncuenta;
    }
    public String getBanco(){
        return banco;
    }
    public void setBanco(String bank){
        banco = bank;
    }
    public String getNumcuenta(){
        return numCuenta;
    }
    public void setNumcuenta(String ncuenta){
        numCuenta = ncuenta;
    }
    public String toString() {
        return "Transferencia" + "Banco:"+ banco 
        + "Cuenta"+ numCuenta+ super.toString();
    }
}
