
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ej02Jugadores {

  
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        double[] vectorAlturas;
        //Paso 3: Crear el vector para 15 double 
        vectorAlturas = new double[16];
        //Paso 4: Declarar indice y variables auxiliares a usar
        int i,sumaSupera,dF = 15;
        double prom,suma;
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (i=0;i<dF;i++) {
            System.out.print("Ingrese la altura del jugador "+i+": "); 
            vectorAlturas[i] = Lector.leerDouble();
        }
        //Paso 7: Calcular el promedio de alturas, informarlo
        suma = 0;
        for (i=0;i<dF;i++){ 
            suma += vectorAlturas[i];
        }
        prom = suma / dF;
        System.out.println("La altura promedio es: "+prom);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        sumaSupera = 0;
        for (i=0;i<dF;i++) { 
            if(vectorAlturas[i] > prom)
                sumaSupera++;
        }
        //Paso 9: Informar la cantidad.
        System.out.println("La cantiad de jugadores que superan el promedio "+prom+" son: "+sumaSupera);
    }
    
}
