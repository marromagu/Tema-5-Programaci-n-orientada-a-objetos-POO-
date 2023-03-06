/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegio;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Grupo {

    private String nombre;
    private Alumno[] alumnos = new Alumno[10];
    private int numeroAlumnos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.numeroAlumnos = 0;
    }

    public Grupo() {
        this.nombre = "";
        this.numeroAlumnos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void listadoAlumnos() {
        if (numeroAlumnos > 0) {
            for (int i = 0; i < numeroAlumnos; i++) {
                alumnos[i].boletin();
            }
        }
    }

    public boolean insertarAlumno() {
        if (numeroAlumnos < alumnos.length) {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Introduzca los datos del alumno.");
                System.out.println("DNI: ");
                String dni = teclado.nextLine();
                System.out.println("Nombre: ");
                String nombreAlumno = teclado.nextLine();
                System.out.println("Edad: ");
                int edad = Integer.parseInt(teclado.nextLine());
                Alumno unAlumno = new Alumno(dni, nombreAlumno, edad);
                alumnos[numeroAlumnos] = unAlumno;
                numeroAlumnos++;
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }

    public Alumno buscarAlumno(String nombre) {
        if (numeroAlumnos > 0) {
            for (int i = 0; i < numeroAlumnos; i++) {
                if (alumnos[i].getNombre().equals(nombre)){
                    return alumnos[i];
                }
            }
        }
        return null;
    }

    public void evaluar() {
        if (numeroAlumnos > 0) {
            for (int i = 0; i < numeroAlumnos; i++) {
              alumnos[i].rellenaNotas();
            }
        }
    }

    public double mediaGrupo() {
        double suma = 0, mediaAlumno;
        if (numeroAlumnos > 0) {
            for (int i = 0; i < numeroAlumnos; i++) {
              mediaAlumno = alumnos[i].notaFinal();
              if (mediaAlumno < 0){
                  return -1;
              }else{
                  suma += mediaAlumno;
              }
            }
        }
        return suma / numeroAlumnos;
    }



}
