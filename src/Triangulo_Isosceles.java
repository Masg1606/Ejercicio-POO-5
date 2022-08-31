/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Miguel
 */
public class Triangulo_Isosceles {
    
    private double lado;
    private double base;

    public Triangulo_Isosceles(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }
    
    public double obtenerPerimetro(){
        double perimetro = 2*lado + base;
        return perimetro;
    }
    
    public double obtenerArea(){
        double area = (base* Math.sqrt((lado*lado)-((base*base)/4)))/2;
        return area;
    }
    
    public String mostrarDatos(){
        return "Base: "+base+"\nLado: "+lado+"\nPerimetro: "+obtenerPerimetro()+"\nArea: "+obtenerArea()+"\n";
    }
}
