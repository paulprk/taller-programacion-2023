/*
Clase Libro a la cual se agregaron constructores. 
 */
package tema3;

/**
 *
 * @author vsanz
 */
public class Libro {
    private String titulo = "Default";
    private Autor primerAutor; 
    private String editorial = "Default";
    private int añoEdicion = 0000;
    private String ISBN = "Default"; 
    private double precio = 0000.00; 
     
    public Libro() {
        
    }
    
    public Libro(String titulo,Autor primerAutor,String editorial,int anioEdicion,String ISBN,double precio)  {
        this.titulo = titulo;
        this.primerAutor = primerAutor;
        this.editorial = editorial;
        this.añoEdicion = anioEdicion;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getPrimerAutor() {
        return primerAutor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrimerAutor(Autor primerAutor) {
        this.primerAutor = primerAutor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return ("TIRULO: "+this.titulo+", DATOS AUTOR"+this.primerAutor.toString()+", EDITORIAL:"+this.editorial+", AÑO DE EDICION:"+this.añoEdicion+", ISBN:"+this.ISBN+", PRECIO:"+this.precio);
    }
        
}
