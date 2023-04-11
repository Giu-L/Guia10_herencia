/*Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_extras1;
/**
 *
 * @author Giu-L
 */
public class BarcoMotor extends Entidades {
   
    public void tipoBarco(){
        System.out.println("A continuacion se van a detallar los tipos de barcos. ");
        System.out.println("1- Lanchas Auxiliares \n" + "2- Motos acuáticas. \n" +"3- Lanchas de proa abierta.\n" + "4- Lanchas semirrígidas. ");
        int ol = lee.nextInt();
        switch(ol){
            case 1 :
                System.out.println("--------------------------------------");
                System.out.println("Uested selecciono Lancha Auxiliar. ");
                 int ve = (int) (5 * getCV());
               System.out.println("El CV de la embarcacion corresponde a " + ve + "km por hora." );
                System.out.println("Matricula: AB 308 IN\n " + "Año de fabricacion 2018");
                System.out.println("--------------------------------------");
                break;
            case 2: 
                System.out.println("--------------------------------------");
                System.out.println("Uted selecciono Moto acuatica ");
                 int ac = (int) (15 * getCV());
               System.out.println("El CV de la embarcacion corresponde a " + ac + "km por hora." );
                System.out.println("Martricula: GIU 113\n" + " Año de fabricacion 1998");
                System.out.println("--------------------------------------");
                break;
            case 3:
                System.out.println("--------------------------------------"); 
                System.out.println("Uested selecciono Lanchas de proa abierta.");
                 int la = (int) (19 * getCV());
               System.out.println("El CV de la embarcacion corresponde a " + la + "km por hora." );
                System.out.println("Matricula: PAP 209 \n" + " Año de fabricacion 1999");
                System.out.println("--------------------------------------");
                break;
            case 4: 
                System.out.println("--------------------------------------");
                System.out.println("Uted seleciiono Lancha semirrigida");
                 int lan = (int) (10 * getCV());
               System.out.println("El CV de la embarcacion corresponde a " + lan + "km por hora." );
                System.out.println("Matricula: ELU 345 \n" + " Año de fabricacion 2000");
                System.out.println("--------------------------------------");
                break;
            default: 
                System.out.println("Quizas desee un yate o velero ");
                }
        }
    }

