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
import PaqueteLectura.GeneradorAleatorio;
public class Ej2 {
    
    public static void main(String[] args) {
        Persona[] vectorPersonas = new Persona[15];
        int i=0,dni,edad;
        String nombre;
        GeneradorAleatorio.iniciar();
        //Leer y guardar
        System.out.println("Ingrese su edad:"); edad = GeneradorAleatorio.generarInt(99);
        while(edad != 0 && i < 15) {
            System.out.println("Ingrese su nombre:"); nombre = GeneradorAleatorio.generarString(5);
            System.out.println("Ingrese su dni:"); dni = GeneradorAleatorio.generarInt(999);
            vectorPersonas[i++] = new Persona(nombre,dni,edad);
            System.out.println("Ingrese su edad:"); edad = GeneradorAleatorio.generarInt(99);
        }
        //Informar Datos
        for(int j=0;j<i;j++) {
            System.out.println("-----------------------------------");
            System.out.println("Dni: "+vectorPersonas[j].getDNI());
            System.out.println("Nombre: "+vectorPersonas[j].getNombre());
            System.out.println("Edad: "+vectorPersonas[j].getEdad());
        }
        //puntos a resolver
        int minDni = 9999,cumple=0;
        String repPersona = "";
        for(int j=0;j<i;j++){
            if(vectorPersonas[j].getEdad() > 65)
                cumple++;
            if(vectorPersonas[j].getDNI() < minDni) {
                minDni = vectorPersonas[j].getDNI();
                repPersona = vectorPersonas[j].toString();
            }
        }
        System.out.println("El total de personas mayores a 65 años es: "+cumple);
        System.out.println("Representacion de la Persona con menor dni:");
        System.out.println(repPersona);
    }
}
