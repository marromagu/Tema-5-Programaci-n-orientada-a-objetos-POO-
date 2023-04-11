/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExamenPOO;

/**
 *
 * @author JMRivera
 */
public class ExamenMarzo23 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    EmpresaAlquiler miEmpresa = new EmpresaAlquiler("Barquitos de papel", "José María Rivera", "A123", 1000.0);
    cargarDatos(miEmpresa);
    Barco miBarco = null;
    int opcion = menu();
    while (opcion != 0) {
      switch (opcion) {
        case 1:
          miEmpresa.verDatos();
          if (Entrada.leerBoolean("¿Quiere cambiar el propietario?(s|n)")) {
            miEmpresa.setPropietario(Entrada.leerCadena("Nuevo propietario: "));
          }
          break;
        case 2:
          switch (Entrada.leerEntero("\n1.- Todas.\n2.- Veleros\n3.- Lanchas\nElija opción: ")) {
            case 1:
              miEmpresa.listarBarcos();
              break;
            case 2:
              miEmpresa.listarVeleros();
              break;
            case 3:
              miEmpresa.listarLanchas();
              break;
            default:
              System.out.println("Opción no válida.");
          }
          break;
        case 3:
          miBarco = miEmpresa.pedirDatosEmbarcacion();
          if (miBarco != null) {
            miEmpresa.insertarEmbarcación(miBarco);
          }
          break;
        case 4:
          String matricula = Entrada.leerCadena("Matrícula a buscar: ");
          int pos = miEmpresa.buscarEmbarcación(matricula);
          if (pos >= 0) {
            miEmpresa.buscarEmbarcación(pos).verDatos();
            switch (Entrada.leerEntero("\n1.- Borrarla.\n2.- Alquilarla\n3.- Devolverla\n4.- Ninguna de ellas\nElija opción: ")) {
              case 1:
                miEmpresa.borrarEmbarcacion(pos);
                break;
              case 2:
                int dias = Entrada.leerEntero("¿Cuántos días?");
                miEmpresa.alquilarEmbarcacion(pos, dias);
                System.out.println("Alquilada por "+miEmpresa.buscarEmbarcación(pos).precioAlquiler()*dias+" euros");
                break;
              case 3:
                miEmpresa.devolverAlquiler(pos);
                break;
              default:
                ;
            }
          }
          break;
        case 5:
          int criterio = Entrada.leerEntero("\nOrdenar por:\n1.- Matriculas.\n2.- Esloras.\n3.- Precios de alquiler.");
          switch (criterio) {
            case 1:
            case 2:
            case 3:
              miEmpresa.ordenar(criterio);
              miEmpresa.listarBarcos();
              break;
            default:
              System.out.println("Opción incorrecta.");
          }
          break;
      }
      Entrada.leerCadena("\nPulse INTRO para continuar.");
      opcion = menu();
    }
    System.out.println("Fin de la ejecución de la aplicación.");
  }

  /**
   * 1
   * Método que muestra el menú y devuelve la opción elegida por el usuario
   *
   * @return
   */
  public static int menu() {
    int opcion;
    System.out.println("Alquiler de embarcaciones");
    System.out.println("-------------------------");
    System.out.println("1. Consultar datos de la empresa/¿Modificar propietario?.");
    System.out.println("2. Listado de embarcaciones: todas, veleros o lanchas.");
    System.out.println("3. Insertar una nueva embarcación.");
    System.out.println("4. Buscar una embarcación por su matrícula: ver datos y (¿borrarla?|¿alquilarla?|¿devolverla?");
    System.out.println("5. Ordenar las embarcaciones por: matrícula|eslora|precio de alquiler");
    System.out.println("0. Salir");
    opcion = Entrada.leerEntero("\n¿Opción?: ");
    return opcion;
  }
   public static void cargarDatos(EmpresaAlquiler empresa){
     Barco unBarco;
     unBarco = new Velero(1, 3, "N10", 5, 3, true);
     empresa.insertarEmbarcación(unBarco);
     unBarco = new Lancha(100, "Z10", 6, 3, true);
     empresa.insertarEmbarcación(unBarco);
     unBarco = new Velero(2, 6, "A10", 10, 3, false);
     empresa.insertarEmbarcación(unBarco);
     unBarco = new Lancha(150, "J10", 8, 2, true);
     empresa.insertarEmbarcación(unBarco);
     unBarco = new Velero(1, 4, "F10", 6, 2, false);
     empresa.insertarEmbarcación(unBarco);
   }
}
