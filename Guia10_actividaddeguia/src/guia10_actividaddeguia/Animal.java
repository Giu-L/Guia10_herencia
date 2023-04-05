/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_actividaddeguia;

/**
 *
 * @author Giu-L
 */
/*
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. 

*/
public class Animal {
    public void haceRuido(){
        System.out.println("Hola");
    }
}
    class Perro extends Animal{

        @Override
        public void haceRuido() {
            System.out.println("Soy un Perro");
        }
    }
     class Gato extends Animal{

            @Override
            public void haceRuido() {
                System.out.println("Soy un gato ");
            }
         
     }   
    

   

