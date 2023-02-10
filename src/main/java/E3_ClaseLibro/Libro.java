/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E3_ClaseLibro;

/**
 *
 * @author DAM_T
 */
public class Libro {

    private String titulo;
    private String autor;
    private int nEjemplares;
    private int nPrestados;

    public Libro(String titulo, String autor, int nEjemplares, int nPrestados) {
        //Constuctor por defecto
        this.titulo = titulo;
        this.autor = autor;
        this.nEjemplares = nEjemplares;
        this.nPrestados = nPrestados;
    }

    public Libro() {
        //Constuctor por defecto con parametros
        this.titulo = "";
        this.autor = "";
        this.nEjemplares = 0;
        this.nPrestados = 0;
    }

    public Libro(Libro copiaLibro) {
        //Constuctor copia
        this.titulo = copiaLibro.titulo;
        this.autor = copiaLibro.autor;
        this.nEjemplares = copiaLibro.nEjemplares;
        this.nPrestados = copiaLibro.nPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public int getnPrestados() {
        return nPrestados;
    }

    public void setnPrestados(int nPrestados) {
        this.nPrestados = nPrestados;
    }

    public boolean prestamos() {
        int disponibles = this.nEjemplares-this.nPrestados;
        if ( disponibles> 0) {
            this.nPrestados++;
            return true;
        }

        return false;
    }

    public boolean devolucion() {
        if (this.nPrestados > 0) {
            this.nPrestados--;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tLibro:");
        sb.append("\n---------------------------");
        sb.append("\nTitulo: ").append(titulo);
        sb.append("\nAutor: ").append(autor);
        sb.append("\nNumero de Ejemplares: ").append(nEjemplares);
        sb.append("\nNumero de Ejemplares Prestados: ").append(nPrestados);
        sb.append("\n---------------------------");
        return sb.toString();
    }
    

}
