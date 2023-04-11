/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_extras1;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


/**
 *
 * @author Giu-L
 */
public class Servis  {
    Scanner lee = new Scanner(System.in);
    public void opcionesNavegacion(){
        System.out.println("Ingrese que tipo de embarcacion va a pedir en este dia: ");
          System.out.println("1_ Barco a motor ");
          System.out.println("2_ Velero");
          System.out.println("3_ Yate");
          
          int ox = lee.nextInt();
          
          switch(ox){
              case 1: 
             BarcoMotor b= new BarcoMotor();
             b.tipoBarco();          
             break;
              case 2: 
              Velero.Veleros v = new Velero().new Veleros();
              v.cantMast();
              break;
              case 3:
              Yate.Yates y = new Yate().new Yates();
              y.tipoYate();
              break;
                 
          }
    }
    
    public void calculaFecha(){
        System.out.println("Ingrese que dia desea alquilar la embarcacion : ");
        System.out.print("Dia "); int dia = lee.nextInt();
        System.out.print("Mes ");int mes = lee.nextInt();
        System.out.print("Año ");int anio = lee.nextInt();
        LocalDate fechasIng = LocalDate.of(anio, mes, dia);
        
        System.out.println("Ingrese la fecha de devolucion : ");
        System.out.print("Dia "); int diaS = lee.nextInt();
        System.out.print("Mes ");int mesS = lee.nextInt();
        System.out.print("Año ");int anioS = lee.nextInt();
      LocalDate fechasSal = LocalDate.of(anioS, mesS, diaS);
     
        long fechsaCompleta = ChronoUnit.DAYS.between(fechasIng, fechasSal);
        System.out.println("Uested alquilara la embaracion por "+ fechsaCompleta + " dias.");
     
    }
    /*
    En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
    */
    public void Alquiler(){
        Entidades e = new Entidades();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Para poder alquilar la embaracion usted debe de completar la siguiente ficha: ");
        System.out.println("Ingrse su nombre ");
        e.setNombre(lee.nextLine());
        lee.nextLine();
        System.out.println("Ingrese su numero de documento ");
        e.setDni(lee.nextInt());
            System.out.println("------------------------------------------------------------------------------------");
       
    }
 }

