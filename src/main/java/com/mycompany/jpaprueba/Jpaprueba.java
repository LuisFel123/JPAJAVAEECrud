/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladora;
import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author luis
 */
public class Jpaprueba {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Controladora control= new Controladora();
        //Alumno alum= new Alumno(21,"Domingo","Ramirez",new Date());
        
        //insertar alumno
         //control.crearAlumno(alum);
        //eliminar alumno
        //control.eliminarAlumno(18);
        //editar alumno
        //alum.setNombre("Maria");
        //control.editarAlumno(alum);
        //buscar un alumno
        //Alumno alum=control.traerAlumno(21);
        //System.out.print(alum.toString());
        //mostrar todos los alumnos
        ArrayList <Alumno> listaN= control.traerListaAlumnos();
        System.out.print(listaN.toString());
        
    }
}
