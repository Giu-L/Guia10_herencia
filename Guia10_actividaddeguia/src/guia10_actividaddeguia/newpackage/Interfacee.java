/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_actividaddeguia.newpackage;

/**
 *
 * @author Giu-L
 */
public interface Interfacee {
    public void estado();
    public int suma();
   
}
class Clase implements Interfacee{

    @Override
    public void estado() {
        System.out.println("Implementacion de metodo");
    }

    @Override
    public int suma() {
        int suma = 2+2;
        return suma;
    }
    
}