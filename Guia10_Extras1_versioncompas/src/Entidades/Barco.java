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
public class Barco {   
    protected String matricula;
    protected Integer eslora;
    protected String aniofab;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, String aniofab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.aniofab = aniofab;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public String getAniofab() {
        return aniofab;
    }

    public void setAniofab(String aniofab) {
        this.aniofab = aniofab;
    }

    
    
}

