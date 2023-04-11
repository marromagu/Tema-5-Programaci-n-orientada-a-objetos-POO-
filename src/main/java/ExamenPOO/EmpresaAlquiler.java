/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPOO;

/**
 *
 * @author JMRivera
 */
public class EmpresaAlquiler {

  private String nombre;
  private String propietario;
  private String cif;
  private Barco[] embarcaciones;
  private Cuenta cuenta;
  private int numeroEmbarcaciones;

  // Constructor con parámetros
  public EmpresaAlquiler(String nombre, String propietario, String cif, double saldo) {
    this.nombre = nombre;
    this.propietario = propietario;
    this.cif = cif;
    this.embarcaciones = new Barco[20];
    this.cuenta = new Cuenta(propietario, cif, saldo);
    this.numeroEmbarcaciones = 0;
  }

  // Getters de la clase
  public String getPropietario() {
    return propietario;
  }

  public String getCif() {
    return cif;
  }

  public Cuenta getCuenta() {
    return cuenta;
  }

  public int getNumeroEmbarcaciones() {
    return numeroEmbarcaciones;
  }

  // Setters de la clase
  public void setPropietario(String propietario) {
    if (propietario.compareTo("") != 0) {
      this.propietario = propietario;
    }
  }

  /**
   *
   * @param nuevoBarco
   * @return verdadero o falso según el reultado de la operación
   */
  public boolean insertarEmbarcación(Barco nuevoBarco) {
    if (nuevoBarco != null) {
      embarcaciones[numeroEmbarcaciones++] = nuevoBarco;
      return true;
    }
    return false;
  }

  /**
   *
   * @param posicion
   * @return verdadero o falso según el reultado de la operación
   */
  public boolean borrarEmbarcacion(int posicion) {
    if (posicion >= 0 && posicion < numeroEmbarcaciones) {
      embarcaciones[posicion] = embarcaciones[--numeroEmbarcaciones];
      embarcaciones[numeroEmbarcaciones] = null;
      return true;
    }
    return false;
  }

  /**
   *
   * @param matricula
   * @return la posición en la que se encuentra la embarcación con esa matrícula
   * o -1 si no existe
   */
  public int buscarEmbarcación(String matricula) {
    for (int i = 0; i < numeroEmbarcaciones; i++) {
      if (embarcaciones[i].getMatricula().compareTo(matricula) == 0) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Devuelve la embarcación que tiene la matrícula pasada por parámetro
   *
   * @param posicion
   * @return la embarcación de esa posición o null
   */
  public Barco buscarEmbarcación(int posicion) {
    if (posicion >= 0 && posicion < numeroEmbarcaciones) {
      return embarcaciones[posicion];
    }
    return null;
  }

  /**
   * Si existe la embarcación en la posicion indicada como parámetro y no está
   * alquilada, se cobra el precio de alquiler ingresándolo en la cuenta y se
   * alquila los días indicados
   *
   * @param posicion
   * @param dias
   * @return verdadero o falso según el reultado de la operación
   */
  public boolean alquilarEmbarcacion(int posicion, int dias) {
    Barco miBarco = buscarEmbarcación(posicion);
    if (miBarco != null && !miBarco.isAlquilado()) {
      double precio = miBarco.precioAlquiler() * dias;
      cuenta.ingreso(precio);
      return miBarco.alquilarBarco(dias);
    }
    return false;
  }

  /**
   * Si existe la embarcación en la posicion indicada como parámetro y está
   * alquilada, se devuelve la embarcación
   *
   * @param posicion
   * @return verdadero o falso según el reultado de la operación
   */
  public boolean devolverAlquiler(int posicion) {
    Barco miBarco = buscarEmbarcación(posicion);
    if (miBarco != null && miBarco.isAlquilado()) {
      return miBarco.devolverBarco();
    }
    return false;
  }

  /**
   * Muestra un listado con todos los barcos
   */
  public void listarBarcos() {
    for (Barco barco : embarcaciones) {
      if (barco != null) {
        barco.verDatos();
      }
    }
  }

  /**
   * Muestra un listado con todos los veleros
   */
  public void listarVeleros() {
    for (Barco barco : embarcaciones) {
      if (barco != null && barco instanceof Velero) {
        barco.verDatos();
      }
    }
  }

  /**
   * Muestra un listado con todos las lanchas
   */
  public void listarLanchas() {
    for (Barco barco : embarcaciones) {
      if (barco != null && barco instanceof Lancha) {
        barco.verDatos();
      }
    }
  }

  /**
   * Método que ordena según el criterio pasado por parámetro: - Si vale 1:
   * ordena por las matriculas alfabéticamente. - Si vale 2: ordena por las
   * esloras. - Si vale 3: ordena por los precios de alquiler.
   *
   * @param criterio
   */
  public void ordenar(int criterio) {
    int i, j;
    Barco aux;
    for (i = 0; i < numeroEmbarcaciones; i++) {
      for (j = numeroEmbarcaciones - 1; j > i; j--) {
        if (embarcaciones[j].menorQue(embarcaciones[j - 1], criterio)) {
          aux = embarcaciones[j];
          embarcaciones[j] = embarcaciones[j - 1];
          embarcaciones[j - 1] = aux;
        }
      }
    }
  }

  /**
   * Método que muestra los datos de la empresa
   */
  public void verDatos() {
    System.out.println(nombre + " propiedad de " + propietario);
    System.out.println("Número de embarcaciones: " + numeroEmbarcaciones);
    System.out.println("Saldo: " + cuenta.getSaldo());
  }

  /**
   * Pide los datos de una nueva embarcación devolviendo el correspondiente
   * objeto
   *
   * @return el objeto creado o null si no se ha podido crear
   */
  public Barco pedirDatosEmbarcacion() {
    Barco miBarco = null;
    int opcion = Entrada.leerEntero("\n1.- Veleros.\n2.- Lanchas\nElija opción: ");
    if (opcion == 1 || opcion == 2) {
      String matricula = Entrada.leerCadena("Matricula: ");
      float eslora = Entrada.leerFloat("Eslora: ");
      float manga = Entrada.leerFloat("Manga: ");
      boolean conPatron = Entrada.leerBoolean("¿Con patrón?(s|n)");
      switch (opcion) {
        case 1:
          int numeroMastiles = Entrada.leerEntero("Número de mástiles: ");
          float superficieVela = Entrada.leerFloat("Superficie de las velas: ");
          miBarco = new Velero(numeroMastiles, superficieVela, matricula, eslora, manga, conPatron);
          break;
        case 2:
          float potencia = Entrada.leerFloat("Potencia: ");
          miBarco = new Lancha(potencia, matricula, eslora, manga, conPatron);
          break;
      }
    }
    return miBarco;
  }
}
