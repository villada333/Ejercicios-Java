/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;
import java.util.Date;

public class ControlFertilizante {
    Date FechaAplicacion;
    public ControlFertilizante(Date fechaaplicacion){
        this.FechaAplicacion = fechaaplicacion;
    }
    public ControlFertilizante(){
        super();
    }
    public Date getFechaAplicacion(){
        return this.FechaAplicacion;
    }
    public Date setFechaAplicacion(Date fecha){
        this.FechaAplicacion = fecha;
    } 
}
