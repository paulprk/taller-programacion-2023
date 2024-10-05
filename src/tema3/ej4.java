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
public class ej4 {
    
    public static void main(String[] args) {
        String nomCliente,ocupadaOno;
        int dni,edad,numHabitaciones;
        double costoHabitacion;
        boolean estaOcupada;
        cliente datosCliente;
        habitacion datosHabitacion;
        hotel hotelNuevo;
        
        System.out.print("Ingrese el numero de habitaciones:"); numHabitaciones = Lector.leerInt();
        System.out.print("Ingrese el nombre del cliente(finaliza con 'x')"); nomCliente = Lector.leerString();
        while(!nomCliente.equals("x")) {
            System.out.print("Ingrese el dni:"); dni = Lector.leerInt();
            System.out.print("Ingrese su edad:"); edad = Lector.leerInt();
            System.out.print("Ingrese el costo de la habitacion:"); costoHabitacion = Lector.leerDouble();
            System.out.print("Ingrese si esta ocupada o no(O(Ocupada) o NO(No Ocupada):"); ocupadaOno = Lector.leerString();
            estaOcupada = ocupadaOno.equals("O");
            
            datosCliente = new cliente(nomCliente,dni,edad);
            datosHabitacion = new habitacion(costoHabitacion,estaOcupada,datosCliente);
            
            hotelNuevo = new hotel(datosHabitacion,numHabitaciones);
            
            System.out.println("---------------------------------");
            System.out.print("Ingrese el nombre del cliente(finaliza con 'x')"); nomCliente = Lector.leerString();
        }
    }
}
