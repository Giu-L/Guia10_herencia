/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package guia10_ejercicio4;

/**
 *
 * @author Usuario
 */
public class Rectangulo implements cscularFormas {
    public double base;
    public double altura;
    
    public void Rectangulo(){
    
}
    public void Rectangulo(double base, double altura){
        this.altura =altura;
        this.base = base;
            
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double calcularArea() {
        
     return getBase() * getAltura();
    }

    @Override
    public double calcularPerimetro() {
        return (getBase() + getAltura())* 2;
    }
}
