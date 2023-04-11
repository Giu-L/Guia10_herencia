/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_extras1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Giu-L
 */
public class Entidades {
     public String nombre;
     public int dni;
     public double eslora;  
     public double CV;
     public final Scanner lee; 
     
     public Entidades(){
         this.lee= new Scanner(System.in);
     }
    public Entidades(String nombre,int dni, double eslora, double CV ){
        this.nombre = nombre;
        this.CV = CV;
        this.dni =dni;
        this.eslora = eslora;
        this.lee =  new Scanner(System.in);
    }

    public double getCV() {
        return 10;
    }

    public void setCV(double CV) {
        this.CV = CV;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getEslora() {
        return 10;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

   
}
