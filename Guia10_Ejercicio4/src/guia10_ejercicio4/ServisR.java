/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ejercicio4;

import java.util.Scanner;



/**
 *
 * @author Usuario
 */
public class ServisR extends Rectangulo {
   Scanner lee = new Scanner(System.in);
    public Rectangulo crearR(){
        Rectangulo r = null;
        
        System.out.println("Ingrese la base : ");
        setBase(lee.nextDouble());
        
        System.out.println("Ingrese la altura : ");
        setAltura(lee.nextDouble());
        
        return r;
    }
            public void mostarAreR(){
                System.out.println("EL area del Rectangulo es : " + calcularArea());
                
            }
            
            public void mostarPe(){
                System.out.println("El perimetro es : " + calcularPerimetro());
            }
}
