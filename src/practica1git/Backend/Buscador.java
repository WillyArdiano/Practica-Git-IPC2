
package practica1git.Backend;

import java.util.ArrayList;
import javax.swing.JLabel;

public class Buscador {
    
    
    public Estudiante buscarEstudiante(ArrayList <Estudiante> estudiantes, Estudiante estudiante, JLabel nombreEstudiante){
        for(int i = 0; i < estudiantes.size(); i++){
            if (estudiantes.get(i).getCarnet() == estudiante.getCarnet() ){
                System.out.println("se ha encontrado el estudiante");
                nombreEstudiante.setText(estudiante.getNombre());
                estudiante = estudiantes.get(i);
                return estudiante;
            } else{
                System.out.println("estudiante no encontrado");
                nombreEstudiante.setText("*****************************");
            }  
        } 
        return estudiante = null;
    }
    
    public int buscarLibroEstudiante(Estudiante estudiante, Libro libro){
        for(int i = 0; i < estudiante.getLibrosPrestados().length; i++){
            if ( estudiante.getLibrosPrestados()[i].getCodigo().equals(libro.getCodigo()) ){
                
                return 1;
            } else{
                System.out.println("estudiante no encontrado");
                return 0;
            }  
        } 
        return 3;
    }
    
    public int  buscarLiblo(ArrayList <Libro> libros,Libro libro){
        for(int i = 0; i < libros.size(); i++){
            if (libros.get(i).getCodigo().equals(libro.getCodigo()) ){
                System.out.println("se ha encontrado el libro");
                return 1;
            } else{
                System.out.println("Libro no encontrado");
                return 0;
            }  
        }   
        return 3;
    }
    
}
