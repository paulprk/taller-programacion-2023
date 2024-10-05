/*
Demo que crea objetos Libro invocando a los constructores definidos. 
 */
package tema3;

/**
 *
 * @author vsanz
 */
import PaqueteLectura.Lector;   
public class Demo01ConstructoresLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String titulo,editorial,ISBN,nombre,biografia,origen;
        double precio;
        int anioEdicion;
        System.out.print("Ingrese titualo:"); titulo = Lector.leerString();
        System.out.print("Ingrese nombre autor:"); nombre = Lector.leerString();
        System.out.print("Ingrese biografia del autor:"); biografia = Lector.leerString();
        System.out.print("Ingrese origen del autor:"); origen = Lector.leerString();
        System.out.print("Ingrese editorial:"); editorial = Lector.leerString();
        System.out.print("Ingrese año de edicion:"); anioEdicion = Lector.leerInt();
        System.out.print("Ingrese ISBN:"); ISBN = Lector.leerString();
        System.out.print("Ingrese precio:"); precio = Lector.leerDouble();
        Autor priAutor = new Autor(nombre,biografia,origen);
        Libro book = new Libro(titulo,priAutor,editorial,anioEdicion,ISBN,precio);
        
       System.out.println(book.toString());
    }
    
}
