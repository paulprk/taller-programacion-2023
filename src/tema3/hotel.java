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
public class hotel {
    private habitacion[] habitacionHotel;
    private int numHabitaciones = 10;
    
    public hotel(habitacion habitacionesHotel,int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
        
    }
    
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    
    
}
