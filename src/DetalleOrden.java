public class DetalleOrden{
    private int cantidad;
    private Articulo articulo;
    private OrdenCompra orden;
    public DetalleOrden(int n, OrdenCompra o, Articulo a) {
        cantidad = n;
        orden = o;
        articulo = a;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCandidad(int n) {
        cantidad = n;
    }

    public OrdenCompra getOrdenCompra() {
        return orden;
    }

    public void setOrdenCompra(OrdenCompra o) {
        orden = o;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo a) {
        articulo = a;
    }
    public float calcPrecioSinIVA(){
        return articulo.getPrecio();
    }
    public float calcIVA(){
        return (float) (calcPrecioSinIVA() * 0.19);
    }
    public float calcPrecio(){
        return calcPrecioSinIVA() + calcIVA();
    }
    public float calcPeso(){
        return articulo.getPeso();
    }
    public String toString(){
        return "DetalleOrden" + cantidad + articulo.getNombre()
                              + calcPrecio() + calcPeso();
    }
}
