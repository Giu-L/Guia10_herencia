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
public class BarcoMotor extends Barco {
    
    protected int potencia;

    public BarcoMotor(int potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor() {
    }

    
    public BarcoMotor(int potencia, String matricula, Integer eslora, String aniofab) {
        super(matricula, eslora, aniofab);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }
}
