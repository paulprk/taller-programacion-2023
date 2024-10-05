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
public class Estante {
    private Libro[] fila; 
    private int dimL = 0;
    
    public Estante() {
        fila = new Libro[20]; //java inicializa todo en null
    }
    
    public Estante(int n) {  //para el punto C
        this.dimL = n;
        fila = new Libro[n];
    }
    
    public void agregarLibro(Libro book) {
        if(dimL <20) 
            fila[dimL++] = book;
    }
    
    public int cantidadLibros() {
        return dimL;
    }
    
    public boolean estaLleno() {
        return (dimL == 20);
    }
    

    public Libro buscarTitulo(String titulo) {
        for(int i=0;i < dimL;i++) {
            if(this.fila[i].getTitulo().equals(titulo))
                return fila[i];
        }
        return null;
    }
        
        
}


