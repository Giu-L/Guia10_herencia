/*
 * o change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_extras1;

/**
 *
 * @author Giu-L
 */
public class Yate {
    public int camarotes;
    
    public Yate(){
        
    }
    public Yate(int camarotes){
        this.camarotes = camarotes;
    }
    
    class Yates extends Entidades{
   
      public void tipoYate(){
       System.out.println("Seleccione que tipo de yate desea alquilar ");
       System.out.println("1- Yate pequeño (10 a 20m)2 habitaciones 1 suit");
       System.out.println("2- Yate mediano de (20 a 30 m) 4 habitaciones 2 suits");
       System.out.println("3- Yate grande de (20 a 40 m ) 6 habitaciones con yacuzzi 2 suits");
       System.out.println("4 - Yate extra (60 m ) 10 habitaciones con yacuzzi 3 suits, piscina integrada");
       int oc = lee.nextInt();
       int opSeleccionada = 0;
       switch(oc){
           case 1: 
               System.out.println("--------------------------------------");
               System.out.println("Usted selecciono 'Yate pequeño'");
               double m = 13 *getEslora();
               System.out.println("Los metros de eslora corresponde a " + m + " metros");
               //cv
                int vel = (int) (10 * getCV());
               System.out.println("El CV de la embarcacion corresponde a " + vel + "km por hora." );
                System.out.println("Martricula: GIU 663\n" + " Año de fabricacion 1999");
               System.out.println("--------------------------------------");
              
               opSeleccionada =1;
               break;
           case 2: 
               System.out.println("--------------------------------------");
               System.out.println("Usted selecciono 'Yate mediano' ");
               //Esrola
               double me =  3 * getEslora();
               System.out.println("Los metros de eslora corresponde a " + me + " metros");
               
               //cv
               int ve = (int) (12 * getCV());
               System.out.println("El CV de la embarcacion corresponde a " + ve + "km por hora." );
                System.out.println("Martricula: UIG 666\n " + " Año de fabricacion 2000");
               System.out.println("--------------------------------------");
               opSeleccionada =2;
               break;
           case 3:
               System.out.println("--------------------------------------");
               System.out.println("Usted selecciono 'Yate grande' ");
               double met = 4.5 *getEslora();
               // cv
                int v = (int) (20 * getCV());
               System.out.println("El CV de la embarcacion corresponde a " + v + "km por hora." );
               System.out.println("Los metros de eslora corresponde a " + met + " metros");
                System.out.println("Martricula: AC  113 PD \n" + " Año de fabricacion 2015");
               System.out.println("--------------------------------------");
               opSeleccionada =3;
            break;
           case 4:
               System.out.println("--------------------------------------");
               System.out.println("Usted selecciono ' Yate extra' ");
               double metr = 6 *getEslora();
                    System.out.println("Los metros de eslora corresponde a " + metr + " metros");
                    //cv
                     int e = (int) (22 * getCV());
               System.out.println("El CV de la embarcacion corresponde a " + e + "km por hora." );
                System.out.println("Martricula: LE 236 GI \n" + " Año de fabricacion 2018");
               System.out.println("--------------------------------------");
               opSeleccionada = 4;
               break;
           default: 
               System.out.println("Quizas usted prefiera un Velero o Barco a motor");
       }
          System.out.println("Usted eligio " + opSeleccionada);
   }

    
    }
}