/**
 * Alumno: Bueno Rosas Brayan
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package figuras;
import java.util.Scanner;

/**
 *
 * @author Brayan
 */
public class Menu {
    
int tipo;// Declarar variables
String respuesta="si";

    /**
     * Menu, metodo de entrada al programa donde el usuario registrara laparte de los metodos de 
     * las figuras
     */
public void menu(){
    Scanner leer=new Scanner(System.in);
    System.out.println("Bienvenido ");
    while(respuesta.equalsIgnoreCase("si")){
    System.out.println("Escoga una opicion");
    System.out.println(" Triangulo ");
    System.out.println(" Rectangulo ");
    System.out.println(" Cuadrado ");
    System.out.println(" Circulo ");
    System.out.println(" Trapecio ");
    tipo=leer.nextInt();
    
    switch(tipo){
        case 1: 
            Triangle obj = new Triangle();
          
            obj.Datos();
            System.out.println("El area es "+obj.area());
            System.out.println("El perimetro es "+obj.perimetro());
        break;
         case 2:
            Rectangle obj2 = new Rectangle();
           
            obj2.Datos();
            System.out.println("El area es "+obj2.area());
            System.out.println("El perimetro es "+obj2.perimetro());
        break;    
        case 3:
            Square obj3 = new Square();
           
            obj3.Datos();
            System.out.println("El area es "+obj3.area());
            System.out.println("El perimetro es "+obj3.perimetro());
        break;
        case 4:
            Circle obj4 = new Circle ();
           
            obj4.Datos();
            System.out.println("El area es "+obj4.area());
            System.out.println("El perimetro es "+obj4.perimetro());
        break;
        case 5:
            Trapezee obj5 = new Trapezee();
           
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
