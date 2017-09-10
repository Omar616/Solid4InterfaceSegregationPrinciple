/**
 * Alumno: Bueno Rosas Brayan Omar
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package figuras;
/**
 * La clase trapecio implementa la interfaz LFiguras
 * @author Brayan
 */
import java.util.Scanner;

public class Trapezee implements Figurassobreescrita{
    /**
     * Declaración de variables
     */       
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;

    /**
     * Método Datos: El usuario registra los datos.
     */
  @Override
   public void Datos(){
   Scanner leer=new Scanner(System.in);
   System.out.println("Ingrese base mayor ");
   baseMayor=leer.nextDouble();
   System.out.println("Ingrese base menor ");
   baseMenor=leer.nextDouble();
   System.out.println("Ingrese altura ");
   altura=leer.nextDouble();
   System.out.println("Ingrese lado mayor ");
   lado1=leer.nextDouble();
   System.out.println("Ingrese lado menor ");
   lado2=leer.nextDouble();
   }
    
    /**
     * Método Área: El programa calcula el área.
     */
   @Override
   public double area(){
   
   return ((baseMayor+baseMenor)*altura)/2;
   }
   
     /**
     * Método Perímetro: El programa calcula el perímetro.
     */  
    @Override
    public double perimetro(){
    return lado1+lado2+baseMayor+baseMenor;
    }
}
