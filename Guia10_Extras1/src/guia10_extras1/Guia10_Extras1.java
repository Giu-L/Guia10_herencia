/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_extras1;

import java.util.Scanner;

/*

Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor. 
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la pote ncia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
*/
/**
 *
 * @author Giu-L
 */
public class Guia10_Extras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l  = new Scanner(System.in);
        Yate.Yates y = new Yate().new Yates();
        Servis s = new Servis();
        System.out.println("----------Bienvenido-----------\n, seleccione la opcion que desea" );
        System.out.println("1- Menu con caracteristicas de la flota ");
        System.out.println("2- Alquiler de la flota ");
        int o = l.nextInt();
        
        switch(o){
            case 1:
                s.opcionesNavegacion();
            case 2: 
                s.opcionesNavegacion();
                s.Alquiler();
                s.calculaFecha();
        }
        
    }
    
}
