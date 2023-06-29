/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma + e.obtenerEdad();
        }
        
        promedioEdades = (suma/obtenerEstudiante().size());
    }
    
    public void establecerEdadMinima(){
        
        for(Persona e: estudiantes){
            
            if(edadminima == 0){
            
                edadminima = e.obtenerEdad();
                
            }
            if(edadminima > e.obtenerEdad()){
            
                edadminima = e.obtenerEdad();
            
            }
            
        }
    
    }
    
    public void establecerEdadMaxima(){
        
        
        for(Persona e: estudiantes){
            
            if(edadminima == 0){
            
                edadminima = e.obtenerEdad();
                
            }
            if(edadminima < e.obtenerEdad()){
            
                edadminima = e.obtenerEdad();
            
            }
            
        }
    
    }

    public void establecerListaCiudadesEstudiantes() {
        
        for(Persona e : estudiantes){
        
        
        listaCiudadesEstudiantes = String.format("%s\n%s\n", listaCiudadesEstudiantes,
                e.obtenerCiudad().obtenerNombre());
        
        }
        
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    
    public int obtenerEdadMinima(){
        
        return edadminima;
    }
    
    public int obtenerEdadMaxima(){
        
        return edadminima;
    }
    
    public String obtenerListaCiudadesEstudiantes() {
        
        return listaCiudadesEstudiantes;
        
    }
    
}
