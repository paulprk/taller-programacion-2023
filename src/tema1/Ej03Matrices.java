/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;
public class Ej03Matrices {

    public static void main(String[] args) {
	    //Paso 2. iniciar el generador aleatorio     
	 GeneradorAleatorio.iniciar();
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
        int[][] matrizEnteros = new int [5][5];
        int i,j;
        for(i=0;i<5;i++)
            for(j=0;j<5;j++)
                matrizEnteros[i][j] = GeneradorAleatorio.generarInt(31);
        //Paso 4. mostrar el contenido de la matriz en consola
        for(i=0;i<5;i++) {
            System.out.println();
            for(j=0;j<5;j++)
                System.out.print(matrizEnteros[i][j] + " | "); 
        }
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        System.out.println();
        int sumaFila1 = 0;  
        for(j=0;j<5;j++)
            sumaFila1 += matrizEnteros[0][j];
        System.out.println("La suma de toda la fila 1 es: "+sumaFila1);
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
        int[] nuevoVector = new int[5];
        int sumaColumnas;
        for(j=0;j<5;j++) {
            sumaColumnas = 0;
            for(i=0;i<5;i++)
                sumaColumnas += matrizEnteros[i][j]; 
            nuevoVector[j] = sumaColumnas;
        }
        for(j=0;j<5;j++)
            System.out.println("Suma de columna "+j+": "+nuevoVector[j]);
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
        int numLeer,posFila=0,posColumna=0;
        boolean numEncontrado = false;
        System.out.print("Ingrese numero a leer:"); numLeer = PaqueteLectura.Lector.leerInt();
        for(i=0;i<5;i++) {
            for(j=0;j<5;j++)
                if(matrizEnteros[i][j] == numLeer) {
                    numEncontrado = true;
                    posFila = i;
                    posColumna = j;
                }
        }
        if(numEncontrado)
            System.out.println("Se encontro el numero en la posicion ("+posFila+","+posColumna+")");
        else
            System.out.println("No se encontro el numero");
    }   
}