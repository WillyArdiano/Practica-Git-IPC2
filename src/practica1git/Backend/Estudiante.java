
package practica1git.Backend;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

public class Estudiante implements Serializable {
    
    private int carnet;
    private String nombre;
    private int codigoCarrera;
    private int numeroLibros = 0;
    private int deuda =0;
    private LocalDate fechaPrestamo;
    private String fechaNacimiento;
    private Libro[] librosPrestados  = new Libro[3];
    
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Libro[] getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(Libro[] librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
    
    
    
    public void agregarLibroEstudiante(Libro libro){
        if(numeroLibros<3){
            librosPrestados[numeroLibros] = libro;
            JOptionPane.showMessageDialog(null,"estudiante cuenta con " + (numeroLibros+1)+"libros prestados");
            numeroLibros++;
        }else if(numeroLibros>=3){
            JOptionPane.showMessageDialog(null,"La operacion no se pudo realizar, ya cuenta con 3 libros prestados");
            
        }
    }
    
    public void quitarLibroEstudiante(Libro libro){
        if(numeroLibros >1){
            numeroLibros= numeroLibros-1;
        }else {
            JOptionPane.showMessageDialog(null,"El estudiante no cuenta con ningun libro prestado");
        }
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
     
     private void quitarLibroArreglo(Libro libro){
         for (int i = 0; i < librosPrestados.length; i++) {
            if(librosPrestados[i].getCodigo().equals(libro.getCodigo())){
                if(librosPrestados[i+1]!= null){
                    librosPrestados[i]=librosPrestados[i+1];
                }
                librosPrestados[i]= null;
            }
        }
     }

    
}
