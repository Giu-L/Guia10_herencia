/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ejerciio2;



/**
 *
 * @author Giu-L
 */
public class Guia10_Ejerciio2 {

    /**
     * @param args the command line arguments
     */
    /*
    Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
    */
    public static void main(String[] args) {
        Electrodomesticos e = new Electrodomesticos();
        Electrodomesticos l = new Lavadora();
        Electrodomesticos t = new Televisor();
          Lavadora lavadora = new Lavadora(10, "gris", 2500, 'A', 50);
    double precioFinal = lavadora.precioFinal();
    System.out.println("Precio final de la lavadora: " + precioFinal);
    System.out.println("Precio final del electrodoméstico: " + l.precioFinal());
    System.out.println("Información del electrodoméstico: " + e.toString());
  

    }
    
}
