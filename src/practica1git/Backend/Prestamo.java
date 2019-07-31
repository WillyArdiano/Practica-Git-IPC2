
package practica1git.Backend;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;


public class Prestamo implements Serializable{
    
    private String codigoLibro;
    private int carnet;
    protected int mora =10;
    protected String fechaPrestamo;

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
    
    public void validarPrestamo(Estudiante estudiante){
        if(estudiante.getNumeroLibros() ==3){
            JOptionPane.showMessageDialog(null,"La operacion no se pudo realizar, ya cuenta con 3 libros prestados");
        }
    }

    public int getMora() {
        return mora;
    }

    public void setMora(int mora) {
        this.mora = mora;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
   
}
