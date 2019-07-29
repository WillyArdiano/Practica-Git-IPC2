
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
        ArrayList<Estudiante> estudiantes = recuperarEstudiantes();
        estudiantes.add(estudiante);
        try {
            ObjectOutputStream grabadorEstudiante = new ObjectOutputStream(new FileOutputStream("Estudiantes.dat"));
            grabadorEstudiante.writeObject(estudiantes);
            grabadorEstudiante.close();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Estudiante> recuperarEstudiantes(){
        ArrayList<Estudiante> estudiantesRecuperados = new ArrayList<>();
        try {
            ObjectInputStream recuperadorEstudiantes = new ObjectInputStream(new FileInputStream("Estudiantes.dat"));
            estudiantesRecuperados=(ArrayList<Estudiante>)recuperadorEstudiantes.readObject();
            recuperadorEstudiantes.close();
        } catch (Exception e) {
        }
        return estudiantesRecuperados;
    }
    
    // metodos para los libros en archivos
    
    public void guardarLibro (Libro libro){
        ArrayList<Libro> libros = recuperarLibros();
        libros.add(libro);
        try {
            ObjectOutputStream grabadorLibro = new ObjectOutputStream(new FileOutputStream("Libros.dat"));
            grabadorLibro.writeObject(libros);
            grabadorLibro.close();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Libro> recuperarLibros(){
        ArrayList<Libro> librosRecuperados = new ArrayList<>();
        try {
            ObjectInputStream recuperadorLibros = new ObjectInputStream(new FileInputStream("Libros.dat"));
            librosRecuperados=(ArrayList<Libro>)recuperadorLibros.readObject();
            recuperadorLibros.close();
        } catch (Exception e) {
        }
        return librosRecuperados;
    }
    
    // metodos para los prestamos en archivos
    
    public void GuardarPrestamo(Prestamo prestamo){
        ArrayList<Prestamo> prestamos = recuperarPrestamos();
        prestamos.add(prestamo);
        try {
            ObjectOutputStream grabadorPrestamo = new ObjectOutputStream(new FileOutputStream("Prestamos.dat"));
            grabadorPrestamo.writeObject(prestamos);
            grabadorPrestamo.close();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Prestamo> recuperarPrestamos () {
        ArrayList<Prestamo> prestamosRecuperados = new ArrayList<>();
        try {
            ObjectInputStream recuperadorPrestamos = new ObjectInputStream(new FileInputStream("Prestamos.dat"));
            prestamosRecuperados=(ArrayList<Prestamo>)recuperadorPrestamos.readObject();
            recuperadorPrestamos.close();
        } catch (Exception e) {
        }
        return prestamosRecuperados;
    }
    
    
}
