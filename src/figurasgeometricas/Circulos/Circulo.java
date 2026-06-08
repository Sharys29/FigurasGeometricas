/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas.Circulos;

import figurasgeometricas.Figuras;

/**
 *
 * @author sharys
 */
public  class Circulo extends Figuras {
    //herencia, vamos a jalar cosas de una clase existente 
    //extends se usa para heredar
    // para que error desaparezca se imprementa esos metodos
    
    private double radio;
    private double diametro;
    private static final double PI = Math.PI;

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public static double getPI() {
        return PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularDiametro() {
       this.diametro=radio*2;
        return diametro;
    }
    
    //CONSTRUCTOR 
    public Circulo(double radio){
        this.radio=radio;
    }

    //Imprementacion
    @Override
    public double calcularPerimetro() {
        this.perimetro=2*Circulo.PI*this.radio;
        return perimetro;
    }
    
     @Override
    public double calcularArea(){
        this.area=Math.pow(radio, 2)*Circulo.PI;
        return area;
        //POW ES UN METODO STATIC
    }
    //se agrega override por que se da un polimorfismo sobre escritura
    
}
