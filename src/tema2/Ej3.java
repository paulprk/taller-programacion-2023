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
public class Ej3 {
    
    public static void main(String[] args) {
        int turnos = 8,Dias = 5;
        int i=0,j=0;
        int dni,edad;
        String nombre;
        Persona[][] matrizPersonas = new Persona[Dias][turnos];
        //Punto A
        System.out.print("Ingrese su nombre:"); nombre = Lector.leerString();
        while(!nombre.equals("ZZZ") && i<Dias) {
            j=0;
            while(!nombre.equals("ZZZ") && j<turnos) {
                System.out.print("Ingrese su dni:"); dni = Lector.leerInt();
                System.out.print("Ingrese su edad:"); edad = Lector.leerInt();
                matrizPersonas[i][j++] = new Persona(nombre,dni,edad);
                System.out.println("----------------------------");
                System.out.print("Ingrese su nombre:"); nombre = Lector.leerString();
            }
            i++;
        }
        //Punto B
        for(int d=0;d<i;d++) {
            for(int t=0;t<turnos;t++) {
                if(matrizPersonas[d][t] != null) {
                    System.out.println(d+" "+t);
                    System.out.println("La personas a entrevistar es: "+matrizPersonas[d][t].getNombre()+" en el dia: "+d+" y turno: "+t);
                }
            }
        }
        for(int t=0;t<j;t++) {
            if(matrizPersonas[i][t] != null)
                System.out.println("La personas a entrevistar es: "+matrizPersonas[i][t].getNombre()+" en el dia: "+i+" y turno: "+t);
        }
    }
}
