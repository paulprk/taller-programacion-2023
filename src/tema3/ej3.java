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
public class ej3 {
    
    public static void main(String[] args) {
        int dimL = 0;
        String titulo,editorial,ISBN,nombre,biografia,origen,tituloBuscar;
        double precio;
        int anioEdicion;
        Estante estante = new Estante();
        
        System.out.print("Ingrese un titulo:"); titulo = Lector.leerString();
        while(!titulo.equals("x") && dimL < 20)  {
            System.out.print("Ingrese nombre autor:"); nombre = Lector.leerString();
            System.out.print("Ingrese biografia del autor:"); biografia = Lector.leerString();
            System.out.print("Ingrese origen del autor:"); origen = Lector.leerString();
            System.out.print("Ingrese editorial:"); editorial = Lector.leerString();
            System.out.print("Ingrese año de edicion:"); anioEdicion = Lector.leerInt();
            System.out.print("Ingrese ISBN:"); ISBN = Lector.leerString();
            System.out.print("Ingrese precio:"); precio = Lector.leerDouble();
            
            Autor priAutor = new Autor(nombre,biografia,origen);
            Libro book = new Libro(titulo,priAutor,editorial,anioEdicion,ISBN,precio);
            
            estante.agregarLibro(book);
            
            System.out.println("--------------------------------");
            System.out.print("Ingrese un titulo:"); titulo = Lector.leerString();
        }
        
        System.out.println("La cantidad de libros es:"+estante.cantidadLibros());
        System.out.println("El estante se encuentra lleno?:"+estante.estaLleno());
        System.out.print("Ingrese titulo del libro a buscar:"); tituloBuscar = Lector.leerString();
        System.out.println(estante.buscarTitulo(tituloBuscar));
        
    }
}
