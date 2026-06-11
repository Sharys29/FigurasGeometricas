/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulos;

/**
 *
 * @author sharys
 */
//HERENCIA (EXTENDS)
public class Equilatero extends Triangulo {
    public Equilatero(double lado){
        //Llamar de un constructor de otro constructor (super)
        super(lado, lado, lado);  
    }
    @Override
    protected double calcularArea(){
        return (Math.sqrt(3)/4) * Math.pow(ladoA, 2);
    }
    
    @Override
    public String toString(){
        return "Equilatero{\nLado A : " + ladoA + "\nLado B: " + ladoB + 
                "\nlado C : " + ladoC + "\nPerimetro: " + getPerimetro() + 
                "\nArea: "+ getArea()+ "\n";
    }
}
