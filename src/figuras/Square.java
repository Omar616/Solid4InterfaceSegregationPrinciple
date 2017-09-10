/**
 * Alumno: Bueno Rosas Brayan Omar
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package figuras;

import java.util.Scanner;
/**
 * La clase Square implementa la interfaz Figurassobreescrita
 * @author Brayan 
 */
public class Square implements Figurassobreescrita{
    /**
     * Declaración de variables
     */
private double ladoA;

     /**
     * Método Datos: El usuario registra los datos.
     */
      @Override
   public void Datos(){
   Scanner leer=new Scanner(System.in);
   System.out.println("Ingrese base ");
   ladoA=leer.nextDouble();
   }
   
    /**
     * Método Área: El programa calcula el área.
     */
   @Override
   public double area(){
   
   return ladoA*ladoA;
   }
   
    /**
     * Método Perímetro: El programa calcula el perímetro.
     */
    @Override
    public double perimetro(){
    return ladoA*4;
    }
    
    

}
