/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
package guia10_ejercicio4;

/**
 *
 * @author Usuario
 */
 class Circuloo implements cscularFormas {
    public double radio;
    public double diametro;

    public void Circulo(){
        
    }
    public void Ciculo(double radio, double diametro){
       this.radio = radio;
       this.diametro = diametro;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

    @Override
    public double calcularArea() {
           return PI * Math.pow(getRadio(),2);
    }

    @Override
    public double calcularPerimetro() {
        return PI * getDiametro();
    }
    
}
