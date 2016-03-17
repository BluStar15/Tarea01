/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea01;

import Modelo.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author JoseAdolfo
 */
public class MetodosEstudiantes {
    
    ArrayList <Estudiante> arrayEstudiantes;
    
    public MetodosEstudiantes()
    {
        arrayEstudiantes= new ArrayList <Estudiante>();
        
    }
    
    public void agregarEstudiante(String informacion[])
    {
        Estudiante temporal= new Estudiante(informacion [0], informacion[1], informacion[2]);
        arrayEstudiantes.add(temporal);
    }
    
    public void mostrarInformacionEstudiantes()
    {
        Estudiante temporal;
        temporal = arrayEstudiantes.get(0);
        System.out.println(temporal.getInformacion());
    }
}
