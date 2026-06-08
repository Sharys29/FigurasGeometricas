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
    protected double area;
    protected double perimetro;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
   public abstract double calcularPerimetro();
   //si se pone llaves, genera un error, los metodos abstractos no puede 
   //obtener cuerpo
   public abstract double calcularArea();
   
    
}
