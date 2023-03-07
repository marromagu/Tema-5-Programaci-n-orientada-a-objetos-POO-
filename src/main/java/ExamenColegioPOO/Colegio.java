/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExamenColegioPOO;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grupo miGrupo;
        miGrupo = new Grupo("1º DAM");
        Scanner teclado = new Scanner(System.in);
        int opcion = menu();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    System.out.println("Nombre del grupo: " + miGrupo.getNombre());
                    System.out.println("¿Quiere cambiarlo? (s/n): ");
                    if (teclado.nextLine().charAt(0) == 's') {
                        System.out.println("Nuevo nombre:");
                        String nombre = teclado.nextLine();
                        miGrupo.setNombre(nombre);
                        System.out.println("Nombre cambiado.");
                    }
                    break;
                case 2:
                    miGrupo.listadoAlumnos();
                    break;
                case 3:
                    if (miGrupo.insertarAlumno()) {
                        System.out.println("Alumnos matriculado.");
                    } else {
                        System.out.println("No se pudo matricular.");
                    }
                    break;
                case 4:
                    miGrupo.evaluar();
                    break;
                case 5:
                    System.out.println("La media del grupo es " + miGrupo.mediaGrupo());
                    break;
                case 6:
                    System.out.println("Nombre del alumno a buscar: ");
                    String nombre = teclado.nextLine();
                    Alumno miAlumno = miGrupo.buscarAlumno(nombre);
                    if (miAlumno != null) {
                        miAlumno.boletin();
                        System.out.println("¿Quiere cambiar alguna nota? (s/n): ");
                        try {
                            if (teclado.nextLine().charAt(0) == 's') {
                                System.out.println("¿De qué trimestre?");
                                int trimestre = Integer.parseInt(teclado.nextLine());
                                System.out.println("Nueva nota:");
                                int nota = Integer.parseInt(teclado.nextLine());
                                switch (trimestre) {
                                    case 1:
                                        miAlumno.setNota1(nota);
                                        break;
                                    case 2:
                                        miAlumno.setNota1(nota);
                                        break;
                                    case 3:
                                        miAlumno.setNota1(nota);
                                        break;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Error al introducir datos por teclado.");
                        }
                    }
                    break;
            }
            esperar();
            opcion = menu();
        }
    }

    /**1
     * Método que muestra el menú y devuelve la opción elegida por el usuario
     *
     * @return
     */
    public static int menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("COLEGIO");
        System.out.println("-------");
        System.out.println("1. Consultar/Modificar nombre del grupo");
        System.out.println("2. Listado de alumnos del grupo");
        System.out.println("3. Matricular un alumno");
        System.out.println("4. Evaluar todos los alumnos (nota aleatoria)");
        System.out.println("5. Ver nota media del grupo");
        System.out.println("6. Buscar un alumno por su nombre/ cambiar nota");
        System.out.println("0. Salir");
        System.out.print("\n¿Opción?: ");
        try {
            opcion = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            opcion = 100;
        }
        return opcion;
    }

    /**
     * Método que espera pulsar intro para continuar
     */
    public static void esperar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pulse intro para continuar...");
        teclado.nextLine();
    }

}
