package Modulo;
public class ProductosControl {
    private int ICA;
    private String NombreProducto;
    private int FrecuenciaAplicacion;
    
    public ProductosControl(int ica, String nombreproducto, int frecuenciaaplicacion){
        super();
        this.ICA=ica;
        this.NombreProducto=nombreproducto;
        this.FrecuenciaAplicacion=frecuenciaaplicacion;
    }
    public ProductosControl(){
        super();
    }
    public int getICA() {
		return ICA;
    }
    public String getNombreProducto() {
            return NombreProducto;
    }
    public int getFrecuenciaAplicacion() {
            return FrecuenciaAplicacion;
    }
    public void setICA(int ica) {
            this.ICA = ica;
    }
    public void setNombreProducto(String nombreproducto) {
            this.NombreProducto = nombreproducto;
    }
    public void setFrecuenciaAplicacion(int frecuenciaaplicacion) {
            this.FrecuenciaAplicacion = frecuenciaaplicacion;
    }
}