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
public class Ej5 {

    public static void main(String[] args) {
        Partido[] vectorPartidos = new Partido[20];
        String nomVisitante,nomLocal;
        int dimL=0,golVisitante,golLocal,river=0,boca=0;
        //puntoA
        System.out.print("Ingrese el nombre del equipo visitante:"); nomVisitante = Lector.leerString();
        while(!nomVisitante.equals("ZZZ") && dimL < 20) {
            System.out.print("Ingrese el nombre del equipo local:"); nomLocal = Lector.leerString();
            System.out.print("Ingrese los goles del equipo visitante:"); golVisitante = Lector.leerInt();
            System.out.print("Ingrese los goles del equipo local:"); golLocal = Lector.leerInt();
            vectorPartidos[dimL++] = new Partido(nomLocal,nomVisitante,golLocal,golVisitante);
            System.out.println("---------------------------------");
            System.out.print("Ingrese el nombre del equipo visitante:"); nomVisitante = Lector.leerString();
        }
        //PuntoB
        System.out.println();
        for(int i=0;i<dimL;i++) {
            System.out.println(vectorPartidos[i].toString());
            if(vectorPartidos[i].getGanador().equals("River"))
                river++;
            if(vectorPartidos[i].getGanador().equals("Boca"))
                boca++;
        }
        System.out.println("La cantidad de partidos que gano river es:"+river);
        System.out.println("La cantidad de partidos que gano boca es:"+boca);
    }
}
