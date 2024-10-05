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
public class Ej4 {
    
    public static void main(String[] args) {
        int turnos = 8,Dias = 5;
        int cupoMatriz=0;
        int dni,edad,dia;
        String nombre;
        Persona[][] matrizPersonas = new Persona[Dias][turnos];
        int[] vectorDiml = new int[Dias];
        //inicializazr vector
        for(int i=0;i<Dias;i++) {
            vectorDiml[i] = 0;
        }
        //Punto A
        System.out.print("Ingrese su nombre:"); nombre = Lector.leerString();
        while(!nombre.equals("ZZZ") && cupoMatriz < turnos * Dias) {
            System.out.print("Ingrese el dia en que se quiere presentar(0..5):"); dia = Lector.leerInt();
            if(dia >= 0 && dia < 5) {
                if(vectorDiml[dia] < turnos) {
                    System.out.print("Ingrese su dni:"); dni = Lector.leerInt();
                    System.out.print("Ingrese su edad:"); edad = Lector.leerInt();
                    matrizPersonas[dia][vectorDiml[dia]] = new Persona(nombre,dni,edad);
                    vectorDiml[dia]++;
                    cupoMatriz++;
                    System.out.println("-------------------------------");
                    System.out.print("Ingrese su nombre:"); nombre = Lector.leerString();
                }
                else
                    System.out.println("No hay mas turnos en el dia "+dia);
                }
            else
                System.out.println("Dia fuera de rango ");
        }
        //punto B
        for(int d=0;d<Dias;d++) {
            if(vectorDiml[d] > 0) {
                System.out.println("-------------------------");
                System.out.println("Para el dia "+d+" el total de inscriptos son: "+vectorDiml[d]);
                for(int t=0;t<turnos;t++) {
                    if(matrizPersonas[d][t] != null)
                        System.out.println("Para el turno "+t+" la persona a entrevistar es: "+matrizPersonas[d][t].getNombre());
                }
            }
        }
    }
}
