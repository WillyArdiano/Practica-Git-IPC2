
package practica1git.Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
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

       
        
        try {
            FileOutputStream grabador = new  FileOutputStream("DatosArchivos/estudiantes/"+(estudiante.getCarnet())+".txt");
            
            grabador.write((Integer.toString(estudiante.getCarnet())+"\n").getBytes());
            grabador.write((estudiante.getNombre()+"\n").getBytes());
            grabador.write((Integer.toString(estudiante.getCodigoCarrera())+"\n").getBytes());
            grabador.close();
            
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
            grabador.close();
            
            
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
            grabador.close();
            
        } catch (Exception e) {
        }
    }
    

    
    
    //metodos para recuperar datos 
    
    //metodo para recuperar libros en mora 
    public ArrayList<Prestamo> recuperarLibrosEnMora(){
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        try {
            
            File folder = new File("DatosArchivos/prestamos/");
            File [] lista = folder.listFiles();
            
            for (int i = 0; i < lista.length; i++) {
              //CALIDACION SI ESTA EN MORA  
                if(recuperarPrestamos(lista).get(i).getFechaPrestamo()==""){
                    //AUN NO ESTA EN MORA
                }else{
                    prestamos.add(recuperarPrestamos(lista).get(i));
                }
            }
            
        
            
            
        } catch (Exception e) {
        }
        return prestamos;
    }
    
    public ArrayList<Prestamo>recuperarPrestamos(File [] lista){
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        try {
            
            for (int i = 0; i < lista.length; i++) {
            try {
                Prestamo prestamo = new Prestamo();
                FileReader lector = new FileReader("DatosArchivos/prestamos/"+(lista[i].getName()));
                BufferedReader buferLector = new BufferedReader(lector);
                prestamo.setCodigoLibro(buferLector.readLine());
                prestamo.setCarnet(Integer.parseInt(buferLector.readLine()));
                prestamo.setFechaPrestamo(buferLector.readLine());
                prestamos.add(prestamo);
                
                //FileInputStream recuperador = new FileInputStream("DatosArchivos/libros/"+(lista[i].getName()));
                
            } catch (Exception e) {
            }
            
            
        }
        } catch (Exception e) {
        }
        
        return prestamos;
    }
}
