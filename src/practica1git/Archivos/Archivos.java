
package practica1git.Archivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import practica1git.Backend.Estudiante;
import practica1git.Backend.Libro;
import practica1git.Backend.Prestamo;

public class Archivos {
    
    
    //metodos para los estudiantes en archivos
    
    public void guardarEstudiante(Estudiante estudiante){ 
       
        
        try {
            FileOutputStream grabador = new  FileOutputStream("DatosArchivos/estudiantes/"+(estudiante.getCarnet())+".txt");
            
            grabador.write((Integer.toString(estudiante.getCarnet())+"\n").getBytes());
            grabador.write((estudiante.getNombre()+"\n").getBytes());
            grabador.write((Integer.toString(estudiante.getCodigoCarrera())+"\n").getBytes());
            
            
        } catch (Exception e) {
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
