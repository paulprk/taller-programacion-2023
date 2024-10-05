/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

/**
 *
 * @author jordi
 */
import PaqueteLectura.Lector;
public class Ej1 {
    
    public static void main(String[] args) { 
        Persona p = new Persona();
        String nom;
        int dni,edad;
        //leer y setear
        System.out.print("Ingrese su nombre:"); p.setNombre(nom = Lector.leerString());
        System.out.print("Ingrese su dni:"); p.setDNI(dni = Lector.leerInt());
        System.out.print("Ingrese su edad:"); p.setEdad(edad = Lector.leerInt());
        //Informar
        System.out.println(p.toString());
    }
}
