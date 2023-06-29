/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        Ciudad c1 = new Ciudad("Loja");
        Ciudad c2 = new Ciudad("Quito");
        Ciudad c3 = new Ciudad("Ambato");
        
        Persona p1 = new Persona("Luis",21,c1);
        Persona p2 = new Persona("Santiago",20,c2);
        Persona p3 = new Persona("Santiago",1,c3);
        
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        OperacionesEstudiantes op1 = new OperacionesEstudiantes();
        
        op1.establecerEstudiante(lista);
        op1.establecerPromedioEdades();
        
        System.out.printf("%s\n",
                op1.obtenerPromedioEdades());
        
        op1.establecerEdadMinima();
        
        System.out.printf("%s\n",
                op1.obtenerEdadMinima());
        
         op1.establecerEdadMaxima();
        
        System.out.printf("%s\n",
                op1.obtenerEdadMaxima());
        
        System.out.printf("Promedio Edades: %.2f\n"
                + "Edad Mínima: %d\n"
                + "Edad Máxima: %d\n"
                + "Listado de Ciudades: %s\n",
                op1.obtenerPromedioEdades(),
                op1.obtenerEdadMinima(),
                op1.obtenerEdadMaxima(),
                op1.obtenerListaCiudadesEstudiantes());
        
        
    }
}
