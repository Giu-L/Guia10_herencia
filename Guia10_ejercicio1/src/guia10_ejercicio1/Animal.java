/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ejercicio1;
/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
*/
/**
 *
 * @author Giu-L
 */
public class Animal {
    protected String nombre;
    protected String alimento;
    protected String raza;
    protected int edad;

public Animal(String nombre, String alimento, String raza, int edad){
this.nombre = nombre;
this.edad = edad;
this.alimento = alimento;
this.raza = raza;
}
 public void Aliemnto(){
     System.out.println("Soy un animal y me alimento de " + alimento);
 }   
}
 class Perro extends Animal{
     public Perro(String nombre, String alimento, String raza, int edad){   
      super(nombre,alimento,raza,edad);
     }

    @Override
    public void Aliemnto() {
        System.out.println("Soy un perro y me limento de " + super.alimento);
    }
    
}

 class Gato extends Animal{
    public Gato(String nombre, String alimento, String raza, int edad){
        super(nombre,alimento,raza,edad);
}

    @Override
    public void Aliemnto() {
        System.out.println("Soy un gato y me alimento de " + super.alimento);
    }
    
}
class Caballo extends Animal{
    public Caballo(String nombre, String alimento, String raza, int edad){
        super(nombre,alimento,raza,edad);
    }

    @Override
    public void Aliemnto() {
        System.out.println("Soy un caballo y me alimento de " + super.alimento);
    }

}