/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catedratico;

/**
 *
 * @author Leonidas Ruiz Perez
 */
public class Test {
    public static void main(String[] args){
        Catedratico catedratico1 = new Catedratico(034,"Roberto Lopez","Calle 3","34567898","Ciencias Naturales");
        
        Catedratico catedratico2 = new Catedratico(056,"María López", "Calle 6", "23456789", "Física");
        
        Catedratico catedratico3 = new Catedratico(679,"Carlos Gómez", "Calle 4", "34567389", "Química");
        
        Curso curso1 = new Curso(1, "Ciencias Naturales", 2, 3, catedratico1);
        Curso curso2 = new Curso(2, "Física General", 5, 4, catedratico2);
        Curso curso3 = new Curso(3, "Química Orgánica", 5, 4, catedratico3);
        
        Alumno alumno1 = new Alumno(1001, "Ana Martínez", "Calle A", "111222333", 20);
        Alumno alumno2 = new Alumno(1002, "Luis Fernández", "Calle B", "444555666", 21);
        Alumno alumno3 = new Alumno(1003, "Sofía Ramírez", "Calle C", "777888999", 22);

        // Crear asignaciones para cada alumno
        Asignacion asignacion1 = new Asignacion(alumno1);
        Asignacion asignacion2 = new Asignacion(alumno2);
        Asignacion asignacion3 = new Asignacion(alumno3);
        
         // Asignar los 3 cursos a cada alumno
        asignacion1.addCurso(curso1);
        asignacion1.addCurso(curso2);
        asignacion1.addCurso(curso3);

        asignacion2.addCurso(curso1);
        asignacion2.addCurso(curso2);
        asignacion2.addCurso(curso3);

        asignacion3.addCurso(curso1);
        asignacion3.addCurso(curso2);
        asignacion3.addCurso(curso3);
        
        // Imprimir datos de los alumnos y sus asignaciones
        alumno1.imprimirDatos();
        alumno2.imprimirDatos();
        alumno3.imprimirDatos();
    }
}
