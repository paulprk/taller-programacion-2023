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
public class habitacion {
    private double costo = 0;
    private boolean ocupada;
    private cliente datosCliente;
    
    public habitacion(double costo,boolean ocupada,cliente datosCliente) {
        this.costo = costo;
        this.ocupada = ocupada;
        this.datosCliente = datosCliente;
    }

    public double getCosto() {
        return costo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
    @Override
    public String toString() {
        return ("Costo: "+costo+", Ocupada?: "+ocupada+" "+datosCliente.toString());
    }
}
