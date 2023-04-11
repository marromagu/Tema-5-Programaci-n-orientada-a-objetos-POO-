/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package E10_InterfaceInmobiliaria;

/**
 *
 * @author mario
 */
public interface IComparable {

    public boolean menorQue(Inmueble inmueble, int orden);

    public boolean mayorQue(Inmueble inmueble, int orden);

    public boolean igualQue(Inmueble inmueble, int orden);

}
