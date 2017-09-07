/**
 * Alumno: Miranda Sanchez Maria Fernanda
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package figuras;
import java.util.Scanner;

/**
 *
 * @author Fernanda
 */
public class Menu {
    /**
     * Declaración de variables
     */  
int tipo;
String respuesta="si";

    /**
     * Método menu: El usuario registra los datos para conocer áreas 
     * o perímetros de ciertas figuras.
     */
public void menu(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Bienvenido ");
    while(respuesta.equalsIgnoreCase("si")){
    System.out.println("Escoga una opicion");
    System.out.println("1) Triangulo ");
    System.out.println("2) Rectangulo ");
    System.out.println("3) Cuadrado ");
    System.out.println("4) Circulo ");
    System.out.println("5) Trapecio ");
    tipo=leer.nextInt();
    
    switch(tipo){
        case 1: 
            triangulo obj = new triangulo();
            System.out.println("Ha seleccionado un triangulo ");
            obj.Datos();
            System.out.println("El area es "+obj.area());
            System.out.println("El perimetro es "+obj.perimetro());
        break;
         case 2:
            rectangulo obj2 = new rectangulo();
            System.out.println("Ha seleccionado un rectangulo ");
            obj2.Datos();
            System.out.println("El area es "+obj2.area());
            System.out.println("El perimetro es "+obj2.perimetro());
        break;    
        case 3:
            cuadrado obj3 = new cuadrado();
            System.out.println("Ha seleccionado un cuadrado ");
            obj3.Datos();
            System.out.println("El area es "+obj3.area());
            System.out.println("El perimetro es "+obj3.perimetro());
        break;
        case 4:
            circulo obj4 = new circulo ();
            System.out.println("Ha seleccionado un circulo ");
            obj4.Datos();
            System.out.println("El area es "+obj4.area());
            System.out.println("El perimetro es "+obj4.perimetro());
        break;
        case 5:
            trapecio obj5 = new trapecio();
            System.out.println("Ha seleccionado un cuadrado ");
            obj5.Datos();
            System.out.println("El area es "+obj5.area());
            System.out.println("El perimetro es "+obj5.perimetro());
       break;
        }
    System.out.println("Desea realizar otra opcion? ");
    respuesta=leer.next();
    }
    System.out.println("Hasta luego ");
    }
}
