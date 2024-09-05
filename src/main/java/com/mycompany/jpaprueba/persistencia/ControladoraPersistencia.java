/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class ControladoraPersistencia {

    AlumnoJpaController alumJPA = new AlumnoJpaController();

    public void crearAlumno(Alumno alum) {
        alumJPA.create(alum);
    }

    public void eliminarAlumno(int id) {
        try {
            alumJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.err.print(ex + " Alumno no existe");
        }
    }

    public void editarAlumno(Alumno alumno) {
        try {
            alumJPA.edit(alumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno mostrarAlumno(int id) {
        return alumJPA.findAlumno(id);
    }

    public ArrayList<Alumno> traerAlumnos() {
        List<Alumno> listita= alumJPA.findAlumnoEntities();
        ArrayList <Alumno> lista2= new ArrayList <Alumno>(listita);
        return lista2;
    }

}
