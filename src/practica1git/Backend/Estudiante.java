
package practica1git.Backend;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Estudiante implements Serializable {
    
    private int carnet;
    private String nombre;
    private int codigoCarrera;
    private int numeroLibros = 0;
    private int deuda =0;
    private LocalDate fechaPrestamo;
    
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

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public void setNumeroLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    
     public int calcularSaldo(Estudiante estudiante, LocalDate fechaActual){
        fechaActual = LocalDate.now();
        if(ChronoUnit.DAYS.between(fechaActual, estudiante.getFechaPrestamo())<=3){
            estudiante.setDeuda((int) (ChronoUnit.DAYS.between(fechaActual, estudiante.getFechaPrestamo()) *5));
            return estudiante.getDeuda();
        }else if(ChronoUnit.DAYS.between(fechaActual, estudiante.getFechaPrestamo())>3){
            estudiante.setDeuda(((int) (ChronoUnit.DAYS.between(fechaActual, estudiante.getFechaPrestamo()) -3)*15) + 15 );
            return estudiante.getDeuda();
        }
        return 0;
    }
    
    
}
