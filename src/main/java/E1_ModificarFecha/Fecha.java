/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1_ModificarFecha;

/**
 *
 * @author JMRivera
 */
public class Fecha {

    private int dia;
    private int mes;
    private int annio;
    private boolean valida;

    public Fecha(int dia, int mes, int annio) {
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
        //setValida();
    }

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.annio = 2000;
        this.valida = true;
    }

    /*@Override
    public String toString() {
        return dia + "/" + mes + "/" + annio;
    }*/
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
        //setValida();
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
        //setValida();
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
        //setValida();
    }

    /* public boolean isValida() {
    return valida;
  }*/
    public boolean esBisiesto(int annio) {

        return (annio % 4 == 0) && (!(annio % 100 == 0) || (annio % 400 == 0));

    }

    public boolean comprobarFecha() {
        boolean diaValido, mesValido, annioValido;
        mesValido = (this.mes >= 1 && this.mes <= 12);
        annioValido = (this.annio > 0);
        switch (this.mes) {
            case 2:
                if (esBisiesto(this.annio)) {
                    diaValido = dia >= 1 && dia <= 29;
                } else {
                    diaValido = dia >= 1 && dia <= 29;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaValido = dia >= 1 && dia <= 30;
                break;
            default:
                diaValido = dia >= 1 && dia <= 31;
        }
        return (diaValido && mesValido && annioValido);
    }

    public void diaSiguiente() {
        dia++;
        if(!comprobarFecha()){
            dia=1;
            mes++;
            if (!comprobarFecha()) {
                mes = 1;
                annio++;
            }
        }

    }
    
    /*
  public void setValida() {
    boolean auxiliar;
    auxiliar = (mes >= 1 && mes <=12) && (dia >= 1 && dia <=31) && (annio >0);
    this.valida = auxiliar;
  }*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha{");
        sb.append("dia=").append(dia);
        sb.append(", mes=").append(mes);
        sb.append(", annio=").append(annio);
        sb.append(", valida=").append(valida);
        sb.append('}');
        return sb.toString();
    }
}
