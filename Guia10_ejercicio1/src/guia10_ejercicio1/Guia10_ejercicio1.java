/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ejercicio1;

/**
 *
 * @author Giu-L
 */
public class Guia10_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declaraciones del objeto perro
       Animal perro1 = new Perro("Stich ", " Carnivoros ", " Doberman", 15);
         perro1.Aliemnto();
       Animal perro2 = new Perro("Teddy", "Croquetas" ,"Chihuahua", 10);
         perro2.Aliemnto();
       Animal gato1 = new Gato("Alfred", "Pescado","Siames",5);
        gato1.Aliemnto();
       Animal gato2 = new Gato("Pelusa","Atun", "Sin pelo ", 6);
          gato2.Aliemnto();
       Animal caballo1 = new Caballo("Spak", "Pasto","Fino", 25);
         caballo1.Aliemnto();
       Animal caballo2 = new Caballo ("Ayudante de santa", "Avena","Percheron",30);
        caballo2.Aliemnto();
       
        
    }
    
}
