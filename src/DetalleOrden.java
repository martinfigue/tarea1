public class DetalleOrden{
    private int cantidad;
    private Articulo articulo;
    private OrdenCompra orden;
    public DetalleOrden(int n, OrdenCompra o) {
        cantidad = n;
        orden = o;
    }
    public float calcPrecioSinIVA(){
        return articulo.getPrecio();
    }
    public float calcIVA(){
        return (float) (calcPrecioSinIVA() * 1.19);
    }
    public float calcPrecio(){
        return calcPrecioSinIVA() + calcIVA();
    }
    public float calcPeso(){
        return articulo.getPeso();
    }
}
