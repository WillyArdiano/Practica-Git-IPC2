
package practica1git.Archivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import practica1git.Backend.Estudiante;
import practica1git.Backend.Libro;
import practica1git.Backend.Prestamo;

public class Archivos {

    public Archivos() {
        
    }
    
    
    //metodos para los estudiantes en archivos
    
    public void guardarEstudiante(Estudiante estudiante){ 
        System.out.println("0");
        try {
            FileOutputStream grabador = new  FileOutputStream("DatosArchivos/estudiantes/"+(estudiante.getCarnet())+".txt");
            System.out.println("1");
            grabador.write((Integer.toString(estudiante.getCarnet())+"\n").getBytes());
            System.out.println("2");
            grabador.write((estudiante.getNombre()+"\n").getBytes());
            System.out.println("3");
            grabador.write((Integer.toString(estudiante.getCodigoCarrera())+"\n").getBytes());
            System.out.println("4");
            grabador.write((estudiante.getFechaNacimiento()+"\n").getBytes());
            System.out.println("5");
        } catch (Exception e ) {
            System.out.println("sd");
        }
        
        
    }
    
    
    // metodos para los libros en archivos
    
    public void guardarLibro (Libro libro){
        try {
            FileOutputStream grabador = new  FileOutputStream("DatosArchivos/libros/"+(libro.getCodigo())+".txt");
            
            grabador.write((libro.getTitulo()+"\n").getBytes());
            grabador.write((libro.getAutor()+"\n").getBytes());
            grabador.write((libro.getCodigo()+"\n").getBytes());
            grabador.write((Integer.toString(libro.getCantidad())+"\n").getBytes());
            
            
            
        } catch (Exception e) {
        }
    }
    
    
    // metodos para los prestamos en archivos
    
    public void GuardarPrestamo(Prestamo prestamo){
        
        try {
            FileOutputStream grabador = new  FileOutputStream("DatosArchivos/prestamos/"+prestamo.getCarnet()+".txt");
            
            grabador.write((prestamo.getCodigoLibro()+"\n").getBytes());
            grabador.write((Integer.toString(prestamo.getCarnet())+"\n").getBytes());
            grabador.write((prestamo.getCodigoLibro()+"\n").getBytes());
                        
            
        } catch (Exception e) {
        }
    }
    

    
    
}
