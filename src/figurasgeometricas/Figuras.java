/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author sharys
 */
public abstract class Figuras {
    

    public double getArea() {
        return calcularArea();
    }

    
    public double getPerimetro() {
        return calcularPerimetro();
    }

   
    //METODOS 
   protected abstract double calcularPerimetro();
   //si se pone llaves, genera un error, los metodos abstractos no puede 
   //obtener cuerpo
   protected abstract double calcularArea();
   
    
}
