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
//HERENCIA 
public  class Circulo extends Figuras {
    //herencia, vamos a jalar cosas de una clase existente 
    //extends se usa para heredar
    // para que error desaparezca se imprementa esos metodos
    
    
    //SE RETIRARON LOS ATRIBUTOS PORQUE SE PUEDEN CALCULAR 
    private double radio;
    
    private static final double PI = Math.PI;

    public double getRadio() {
        return radio;
    }

    protected double getDiametro() {
        return calcularDiametro();
    }

    public static double getPI() {
        return PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //CONSTRUCTOR 
    public Circulo(double radio){
        this.radio=radio;
    }

    private double calcularDiametro() {
        return radio*2;
    }
    
    //Imprementacion
    @Override
    protected double calcularPerimetro() {
      return 2*Circulo.PI*this.radio;
        
    }
    
     @Override
    protected double calcularArea(){
        return  Math.pow(radio, 2)*Circulo.PI;
       
        //POW ES UN METODO STATIC
    }
    //se agrega override por que se da un polimorfismo sobre escritura
    
    //Se agrega el metodo toString siempre es publico
    @Override
    
    public String toString(){
        return "Circulo{\nRadio: " + radio + "\ndiametro: " + getDiametro() + 
                "\nPerimetro: " + getPerimetro() + "\nArea: " + getArea() + "\n";
    }
}
