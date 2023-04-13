/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Giu-L
 */

    public final class Velero extends Barco{
    
    private int mastiles;

    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(int mastiles, String matricula, Integer eslora, String aniofab) {
        super(matricula, eslora, aniofab);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }
}
