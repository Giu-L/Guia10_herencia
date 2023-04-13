/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author Giu-L
 */

import Entidades.Alquiler;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yatee;
import Entidades.Barco;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MC
 */
public class ServicioAlquiler {

    Scanner sc = new Scanner(System.in);
    Alquiler a = new Alquiler();
    
    //mastiles, eslora, matricula, anio fabricacion
    static Velero v1 = new Velero(2, "SHN7685", 6, "2020");
    static Velero v2 = new Velero(3, "SHN111", 30, "2000");

    static Barco b1 = new BarcoMotor(500, "HNH14", 50, "1990");
    Barco b2 = new BarcoMotor(700, "HNH15", 60, "1991");

    Barco y1 = new Yatee(10, 350, "Y10", 35, "2010");
    Barco y2 = new Yatee(20, 450, "Y11", 40, "2020");

    public void alquilerBarco() {

        System.out.println("lista de barcos disponibles");
        System.out.println("1: VELERO");
        System.out.println("2: BARCO MOTOR");
        System.out.println("3: YATE");
        System.out.println("Elija una opcion");
        String opcion = sc.next();
        switch (opcion) {
            case "1":
                System.out.println("1 " + v1.toString());
                System.out.println("2 " + v2.toString());
                System.out.println("Elija una opcion ");
                String op = sc.next();
                switch (op) {
                    case "1":

                        int x1 = v1.getMastiles() + calcularModulo(v1);
                        System.out.println("Valor alquiler por dia " + x1);
                        crearAlquiler(a,v1, x1);
                        break;
                    case "2":
                        int x2 = v2.getMastiles() + calcularModulo(v2);
                        System.out.println("Valor alquiler por dia " + x2);
                        break;
                }
                break;
            case "2":
                break;
            case "3":
                break;
        }

    }

    public int calcularModulo(Barco x) {
        int m = x.getEslora() * 10;
        return m;
    }

    public void crearAlquiler(Alquiler a, Barco b, int x) {
        Date hoy = new Date();
        System.out.print(" Ingrese cantidad de dias de alquiler: ");
        int dias = sc.nextInt();
        Date dev = new Date(hoy.getYear(), hoy.getMonth(), hoy.getDate() + dias);
        a.setFechaAlq(dev);
        System.out.println("Escriba su nombre:");
        a.setNombre(sc.next());
        System.out.println("Ingrese su dni");
        a.setDni(sc.nextInt());
        System.out.println("Indique el amarre");
        a.setPosicion(sc.nextInt());
        a.setBarco(b);
        System.out.println("El valor del alquiler es " + (dias * x));
    }
}

