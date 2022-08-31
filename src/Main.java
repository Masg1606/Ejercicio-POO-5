
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Miguel
 */
public class Main {
    
    public static double mayorArea(Triangulo_Isosceles triangulos[]){
        double area;
        
        area = triangulos[0].obtenerArea();
        for(int i=1;i<triangulos.length;i++){
            if(triangulos[i].obtenerArea()>area)
                area = triangulos[i].obtenerArea();
        }
        
        return area;
    }
    
    public static void main(String[] args){        
        Scanner entrada = new Scanner(System.in);
        double base,lado;
        int nTriangulos;
        
        System.out.print("Digite el numero de triángulos a trabajar: ");
        nTriangulos = entrada.nextInt();
        
        Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[nTriangulos];
        
        for(int i=0; i<triangulos.length; i++){
            System.out.println("Digite los valores para el triangulo: "+(i+1)+":");
            System.out.print("Digite la base: ");
            base = entrada.nextDouble();
            System.out.print("Digite el lado: ");
            lado = entrada.nextDouble();
            
            triangulos[i] = new Triangulo_Isosceles(base, lado);
            
            System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El area del triangulo es: "+triangulos[i].obtenerArea());
        }
        
       System.out.print("\nEl area del triangulo de mayor superficie es: "+mayorArea(triangulos));
        
    }
    
}
