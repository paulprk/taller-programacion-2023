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
public class triangulo {
    private double lado1=0;
    private double lado2=0;
    private double lado3=0;
    private String relleno="Por defecto";
    private String color="Por defecto";
    
    public triangulo() {
        
    }
    
    public triangulo(double lado1,double lado2,double lado3,String relleno,String color) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.relleno = relleno;
        this.color = color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    private void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    private void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    private void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public String getRelleno() {
        return relleno;
    }

    public String getColor() {
        return color;
    }
    
    public double calcularPerimetro() {
        return (lado1+lado2+lado3);
    }
    
    
    public double calcularArea() {
        double S = (lado1+lado2+lado3)/2;
        System.out.println(S);
        double aux = Math.sqrt(S*(S-this.lado1)*(S-this.lado2)*(S-this.lado3));
        System.out.println(aux);
        return aux;
    }
    
}
