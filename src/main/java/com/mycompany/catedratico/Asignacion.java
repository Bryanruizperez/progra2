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
public class Asignacion {
    private Alumno alumno;
    private Curso[] cursos;

    public Asignacion(Alumno alumno){
        this.alumno = alumno;
        this.cursos = new Curso[10];
    }
    public void addCurso(Curso curso){
        for (int i = 0; i < cursos.length; i++) {
            if (cursos[i] == null){
                cursos[i] = curso;
                break;
            }
        }
    }
}
