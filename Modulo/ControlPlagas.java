package Modulo;
public class ControlPlagas {
    private int PeriodoCarencia; 
    public ControlPlagas (int periodocarencia){
        this.PeriodoCarencia= periodocarencia;
    }
    public ControlPlagas(){
        super();
    }
    public int getPeriodoCarencia(){
        return this.PeriodoCarencia;
    }
    public void setPeriodoCarencia(int periodocarencia){
        this.PeriodoCarencia= periodocarencia;
    }

    public void mostrarproducto(ProductosControl producto) {
            System.out.println("Registro ICA: " + producto.getICA());
            System.out.println("Nombre del producto: " + producto.getNombreProducto());
            System.out.println("Frecuencia de Aplicacion (dias): " + producto.getFrecuenciaAplicacion());
            System.out.println("Periodo de Carencia : "+ this.PeriodoCarencia);
    }
}
