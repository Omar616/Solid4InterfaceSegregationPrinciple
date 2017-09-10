/**
 * Alumno: Bueno Rosas Brayan Omar
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package figuras;

import java.util.Scanner;
/**
 * La clase rectangulo implementa la interfaz LFiguras
 * @author Brayan
 */

/**
 * La clase Rectangle implementa la interfaz Figurassobreescrita
 * @author Brayan
 */
public class Rectangle implements Figurassobreescrita{
     /**
     * Declaración de variables
     */
    private double base;
    private double altura;
    
    /**
     * Método Datos: El usuario registra los datos.
     */
    @Override
   public void Datos(){
   Scanner leer=new Scanner(System.in);
   System.out.println("Ingrese base ");
   base=leer.nextDouble();
   System.out.println("Ingrese altura ");
   altura=leer.nextDouble();
   }
   
     /**
     * Método Área: El programa calcula el área.
     */  
   @Override
   public double area(){
   
   return base*altura;
   }
   
     /**
     * Método Perímetro: El programa calcula el perímetro.
     */
    @Override
    public double perimetro(){
    return base*2 + altura*2;
    }
    
}
