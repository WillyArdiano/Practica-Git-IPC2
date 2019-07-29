
package practica1git.Backend;

import java.io.Serializable;
import java.util.Date;

public class Prestamo implements Serializable{
    
    private String codigoLibro;
    private int carnet;
    private String fechaPrestamo;

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    
    
    
}
