/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulos;

/**
 *
 * @author sharys
 */
public class Escaleno extends Triangulo {

    public Escaleno(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
    }
    
    
    @Override
    protected double calcularArea() {
        double s= (ladoA+ladoB+ladoC)/2;
        return Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
    }
@Override
    public String toString(){
        return "Escaleno{\nLado A : " + ladoA + "\nLado B: " + ladoB + 
                "\nlado C : " + ladoC + "\nPerimetro: " + getPerimetro() + 
                "\nArea: "+ getArea()+ "\n";
    }
    
}
