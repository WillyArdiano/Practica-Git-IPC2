
package practica1git.Backend;

import java.io.Serializable;

public class Estudiante implements Serializable {
    
    private int carnet;
    private String nombre;
    private int codigoCarrera;

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }
    
    
}
