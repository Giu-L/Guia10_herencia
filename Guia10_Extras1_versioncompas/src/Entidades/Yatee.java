package Entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Giu-L
 */

public final class Yatee extends BarcoMotor{
    
    private int camarotes;

    public Yatee(int camarotes, int potencia) {
        super(potencia);
        this.camarotes = camarotes;
    }

    public Yatee(int camarotes, int potencia, String matricula, Integer eslora, String aniofab) {
        super(potencia, matricula, eslora, aniofab);
        this.camarotes = camarotes;
    }

    public Yatee() {
        
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

   
    
    
    
}

