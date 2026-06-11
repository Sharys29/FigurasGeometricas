/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulos;

import figurasgeometricas.Figuras;

/**
 *
 * @author sharys
 */
 //HEREDAR FIGURAS 
 public abstract class Triangulo extends Figuras {
     
     //Cuando es una familia los atributos van en protected
  
    protected double ladoA;
    protected double ladoB;
    protected double ladoC;
    
    //METODOS GET

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }
    
    //CONSTRUCTOR, SE DA LA MEDIDA DE LOS 3 LADOS

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    //METODO CALCULAR PERIMETRO
    @Override
    protected double calcularPerimetro(){
        return ladoA + ladoB + ladoC;
    }
    
   
    
}
