/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
package guia10_ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Servis extends Circuloo {
    
    Scanner lee = new Scanner(System.in);
    
    public Circuloo crear(){
        Circuloo cir = null;
        System.out.println("CIRCULO ");
        System.out.println("Ingrese el radio: ");
        setRadio(lee.nextDouble());
        System.out.println("Ingrese el diametro: ");
        setDiametro(lee.nextDouble());
        
        return cir ;
    }
    public void mostrarAreC(){
        System.out.println("El area del circulo es : " + calcularArea());
    }
    
    public void MostrarPeC(){
        System.out.println("El area del perimetro del cirulo es : " + calcularPerimetro());
    }
}
