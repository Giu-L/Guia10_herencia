/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*


• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
*/
package guia10_extras_2;

import java.util.Scanner;

/**
 *
 * @author Giu-L
 */
public class Edificio {
    public double ancho;
    public double largo;
    public double alto;
 
    public Edificio(){
        
    }
    public Edificio(double largo, double ancho, double alto ){
        this.alto = alto;
        this.ancho= ancho;
        this.largo = largo;
      
    }
   
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    /*
    • Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
    */
    public double calcularSuperficie() {
         Scanner le = new Scanner(System.in);
        System.out.println("Para calcular la superficie del edificio:");
        System.out.println("Ingrese el alto del edificio:");
        this.setAlto(le.nextDouble());
        System.out.println("Ingrese el ancho del edificio:");
        this.setAncho(le.nextDouble());
        System.out.println("Ingrese el largo del edificio:");
        this.setLargo(le.nextDouble());
         double cuca = 2 * (alto * ancho + alto * largo + ancho * largo);
         System.out.println("Superficie " + cuca);
        return cuca;
    }

    /*
     * Método calcularVolumen(): calcula el volumen del edificio.
     */
    public double calcularVolumen() {
         Scanner le = new Scanner(System.in);
        System.out.println("Para calcular el volumen del edificio:");
        System.out.println("Ingrese la base:");
        double base = le.nextDouble();
        System.out.println("Ingrese la altura:");
        double altura = le.nextDouble();
        double calcu =base * altura * alto;
        System.out.println("Volumen" + calcu);
        return calcu;
    }
    public double calculoSinT(){
         Scanner le = new Scanner(System.in);
         System.out.println("Ingrese la longitud ");
                 double longi = le.nextDouble();
                 System.out.println("Ingrese el ancho ");
                 double anch = le.nextDouble();
                 System.out.println("Ingrese la lingitud de la pared 1 ");
                 double logi1 = le.nextDouble();
                 System.out.println("Ingrse la longi de la pared 1 ");
                 double longi2 =le.nextDouble();
                 System.out.println("Ingrse el ancho de la pared 1 ");
                 double par1=le.nextDouble();
                 System.out.println("Ingrese el ancho de la pared 2");
                 double par2 = le.nextDouble();
                 System.out.println("Ingrse el alto");
                 this.setAlto(le.nextDouble());
                 double cal =2 *(longi + anch) + alto *( logi1 + longi2 +par1 + par2);
                 System.out.println("volumen " + cal);
               return  cal;
                 
    }
}
    /*
    Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

    */
      
     class Polideportivo extends Edificio{ 
          Scanner l = new Scanner(System.in);
    public void crearPoli(){
        System.out.println("Ingrese el nombre del polideportivo "); 
        String nombre = l.nextLine(); 
        System.out.println("Si es un polideportivo techado toque 1 \n si es sin techar toque 2 "); 
        int o = l.nextInt(); 
        switch(o){
            case 1: 
                System.out.println(nombre); 
                calcularSuperficie(); 
                calcularVolumen(); 
                break; 
            case 2: 
                System.out.println(nombre); 
                //Superficie del nivel = 2 x (Longitud x Ancho) + Altura x (Longitud Pared 1 + Longitud Pared 2 + Ancho Pared 1 + Ancho Pared 2) 
                calculoSinT(); 
                break;
        }
    }
}
/*
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
*/
    class EdificioDeOficinas extends Edificio{
        public int numOfi;
        public int cntPer;
        public int numDePisos;
    
      public EdificioDeOficinas(int numOfi, int cntPer, int numDePisos){
        this.numOfi = numOfi;
        this.cntPer = cntPer;
        this.numDePisos = numDePisos;
    }
    } 


