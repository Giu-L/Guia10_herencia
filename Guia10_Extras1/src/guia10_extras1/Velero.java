/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_extras1;



/**
 *
 * @author Giu-L
 */
public class Velero {
     public int mastil;
    
     public Velero(){
            }
     public Velero(int mastil){
         this.mastil = mastil;
             
     }
     class Veleros extends Entidades{
         
         public void cantMast(){
             System.out.println("A continuacion detallaremos la cantidad de mastil con la que cuentan nustros veleros.");
             System.out.println("1 - Velero de 1 Mastil " + "\n" + "2 - Velero con 2 mastiles" + "\n" + "3 - Velero con mastil de 3 palos ");
             System.out.println("Elija que velero desea alquilar");
             int op = lee.nextInt();
             switch(op){
                 case 1:
                     System.out.println("--------------------------------------");
                     System.out.println("Usted selecciono, velero de 1 mastil.");
                      double met = 1 *getEslora();
                      System.out.println("La eslora corresponde a " + met + " metros");
                       System.out.println("Martricula: PUT 234 \n" + " Año de fabricacion 1998");
                      System.out.println("--------------------------------------");
                     break;
                
                 case 2 :
                    System.out.println("--------------------------------------");
                    System.out.println("Usted selecciono, velero de 2 mastiles.");
                    double me = 2 *getEslora();
                     System.out.println("La de eslora corresponde a " + me + " metros");
      System.out.println("Martricula: CULO 098 \n" + " Año de fabricacion 2103");
                    System.out.println("--------------------------------------");
                    
                    break;

                 case 3 : 
                     System.out.println("--------------------------------------");
                     System.out.println("Usted selecciono velero de 3 palos.");
                     double m = 3 *getEslora();
                    System.out.println("La eslora corresponde a " + m + " metros");
                     System.out.println("Martricula: ART 234\n" + " Año de fabricacion 19000");
                     System.out.println("--------------------------------------");
                     break;
                 default: 
                     System.out.println("Quizas usted prefiera u  yate o un barco a motor ");
                     break;
             }
         }

        }
     }

