/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_actividaddeguia;


import java.util.ArrayList;

/**
 *
 * @author Giu-L
 */
/*
Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.método hacerRuido() de cada ítem.
*/
public class Guia10_actividaddeguia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> listAnimal = new ArrayList();
        
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        listAnimal.add(a);
        listAnimal.add(b);
        listAnimal.add(c);
        
        listAnimal.forEach((aux) -> {
            aux.haceRuido();
        });
        
    }

   
    
}
