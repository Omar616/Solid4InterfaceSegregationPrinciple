/**
 * Alumno: Miranda Sanchez Maria Fernanda
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package figuras;

import java.util.Scanner;
/**
 * La clase circulo implementa la interfaz LFiguras
 * @author Fernanda
 */

public class circulo implements LFiguras{
    /**
     * Declaración de variables
     */
    private double radio;

    /**
     * Método Datos: El usuario registra los datos.
     */
    
  @Override
   public void Datos(){
   Scanner leer=new Scanner(System.in);
   System.out.println("Ingrese radio ");
   radio=leer.nextDouble();
   }
   
    /**
     * Método Área: El programa calcula el área.
     */
   
   @Override
   public double area(){
   
   return (radio*radio)*Math.PI;
   }
   
    /**
     * Método Perímetro: El programa calcula el perímetro.
     */
   
    @Override
    public double perimetro(){
    return (radio*2)*Math.PI;
    }
}
