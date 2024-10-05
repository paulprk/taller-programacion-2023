/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

/**
 *
 * @author paul
 */
import PaqueteLectura.Lector;
public class Ej04 {
    
    public static void main(String[] args) {
        int[][] matrizEdificio = new int[9][5];
        int numeroPiso,numeroOficina;
        int i,j;
        boolean continuar = true;
        //Inicializar Matriz
        for(i=1;i<9;i++) {
            for(j=1;j<5;j++)
                matrizEdificio[i][j] = 0;
        }
        //Leer datos y sumar
        while(continuar) {
            System.out.print("Ingrese el numero de piso(1..8 o 9 para finalizar): ");
            numeroPiso = Lector.leerInt();
            if(numeroPiso == 9)
                continuar = false;
            else {
                System.out.print("Ingres el numero de Oficina(1..4): ");
                numeroOficina = Lector.leerInt();
            
                if(numeroPiso >= 1 && numeroPiso <=8 && numeroOficina >=1 && numeroOficina <=4)
                    matrizEdificio[numeroPiso][numeroOficina]++;
                else
                    System.out.println("Numero de piso u oficina fuera de rango");
            }
        }
        //Informar cantidad de personas de cada uno
        for(i=1;i<9;i++) {
            System.out.println();
            for(j=1;j<5;j++)
                System.out.print("("+i+","+j+")"+matrizEdificio[i][j]);
        }
    }
}
