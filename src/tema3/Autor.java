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
public class Autor {
    private String nombre= "Default";
    private String biografia = "Default";
    private String origen = "Default";
    
    public Autor() {
        
    }
    
    public Autor(String nombre,String biografia,String origen) {
        this.nombre = nombre;
        this.biografia = biografia;
        this.origen = origen;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getBiografia() {
        return this.biografia;
    }
    
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    
    public String getOrigen() {
        return origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    @Override
    public String toString() {
        return ("Nombre del autor: "+this.nombre+", biografia:"+this.biografia+", origen:"+this.origen);
    }
    
}
