/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenColegioPOO;

/**
 *
 * @author usuario
 */
public class Alumno {

    private String dni;
    private String nombre;
    private int edad;
    private int nota1;
    private int nota2;
    private int nota3;

    public Alumno(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        nota1 = -1;
        nota2 = -1;
        nota3 = -1;
    }

    public Alumno() {
        this("", "", 0);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota1 = nota;
        }
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota2 = nota;
        }
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota3 = nota;
        }
    }

    public double notaFinal() {
        if (nota1 == -1 || nota2 == -1  || nota3 == -1){
            return -1;
        }else{
            return (nota1 + nota2 + nota3) / 3.0;
        }
    }
    

    public void boletin(){
        StringBuilder sb = new StringBuilder();
        sb.append(dni);
        sb.append(" ").append(nombre);
        sb.append(" ").append(edad);
        sb.append(" notas: ").append(nota1);
        sb.append(", ").append(nota2);
        sb.append(", ").append(nota3);
        sb.append(" media: ").append(this.notaFinal());
        System.out.println(sb.toString());
    }
    
    public void rellenaNotas(){
        nota1 = (int) (Math.random()*11);
        nota2 = (int) (Math.random()*11);
        nota3 = (int) (Math.random()*11);
    }
}
