/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

/**
 *
 * @author luis
 */
public class Controladora {
    ControladoraPersistencia controladoraP= new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alum){
        controladoraP.crearAlumno(alum);
    }
    
    public void eliminarAlumno(int id){
        controladoraP.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alumno){
        controladoraP.editarAlumno(alumno);
    }
    
    public Alumno traerAlumno(int id ){
        return controladoraP.mostrarAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos(){
        return controladoraP.traerAlumnos();
    }
    
    
    
}
