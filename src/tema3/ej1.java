/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author jordi
 */
import PaqueteLectura.Lector;
public class ej1 {
    
    public static void main(String[] args) {
        double lado1,lado2,lado3;
        String color,relleno;
        System.out.print("Ingrese el lado 1:"); lado1 = Lector.leerDouble();
        System.out.print("Ingrese el lado 2:"); lado2 = Lector.leerDouble();
        System.out.print("Ingrese el lado 3:"); lado3 = Lector.leerDouble();
        System.out.print("Ingrese el color:"); color = Lector.leerString();
        System.out.print("Ingrese el relleno:"); relleno = Lector.leerString();
        triangulo tri = new triangulo(lado1,lado2,lado3,color,relleno);
        
        System.out.println("El perimetro es:"+tri.calcularPerimetro());
        System.out.println("El area es:"+tri.calcularArea());
        
        
        
    }
}
