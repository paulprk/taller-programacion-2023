/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

/**
 *
 * @author jordi
 */
import PaqueteLectura.Lector;
public class Ej05 {
    
    public static void main(String[] args) { 
        int[] vectorContador = new int[4];
        int i,puntaje;
        //1.inicializar vector
        for(i=0;i<4;i++)
            vectorContador[i] = 0;
        //2.Leer Puntajes y sumar
        for(i=1;i<6;i++) {
            System.out.println("--------------------------------");
            System.out.print("Cliente "+i+" ingrese el puntaje de Atencion al cliente(1..10): ");   puntaje = Lector.leerInt();
            if(puntaje >= 1 && puntaje <= 10) 
                vectorContador[0] += puntaje;
            
            System.out.print("Cliente "+i+" ingrese el puntaje de Calidad de la comida(1..10): ");   puntaje = Lector.leerInt();
            if(puntaje >= 1 && puntaje <= 10) 
                vectorContador[1] += puntaje;
            
            System.out.print("Cliente "+i+" ingrese el puntaje de Precio(1..10): ");   puntaje = Lector.leerInt();
            if(puntaje >= 1 && puntaje <= 10) 
                vectorContador[2] += puntaje;

            System.out.print("Cliente "+i+" ingrese el puntaje de Ambiente(1..10): ");   puntaje = Lector.leerInt();
            if(puntaje >= 1 && puntaje <= 10) 
                vectorContador[3] += puntaje;

        }
        //3.Sacar Promedio
        System.out.println("El puntaje promedio de atencion al cliente es: "+vectorContador[0]/5.0);
        System.out.println("El puntaje promedio de Calidad de comida es: "+vectorContador[1]/5.0);
        System.out.println("El puntaje promedio de Precio es: "+vectorContador[2]/5.0);
        System.out.println("El puntaje promedio de Ambiente es: "+vectorContador[3]/5.0);
    }
}
