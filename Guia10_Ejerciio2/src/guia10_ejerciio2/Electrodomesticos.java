/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ejerciio2;

import java.util.Scanner;

/**
 *
 * @author Giu-L
 */
/*

*/
public class Electrodomesticos {
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
     public Electrodomesticos(){
        this.precio = 0;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 0;
    }
    public Electrodomesticos(String color, double precio, char consumoEnergetico, double peso){
        this.color = color;
        this.precio= precio;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
        
   
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

   
    

/*
Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
*/

private char comprobarConsumoEnergetico(char letra){
    if( letra >= 'A' && letra <= 'B'){
        return letra;
        
    }else{
        return 'F';
    }
}
/*
Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
*/

private String comprobarColor(String color){
  String[] colores ={"blanco", "negro", "rojo", "azul", "gris"};
  
  boolean colorvalido = false;
    for (String colo : colores) {
        
        if(colo.equalsIgnoreCase(color)){
        colorvalido = true;
        break;
        }
        
    }
    if(!colorvalido){
        this.color = "blanco";
       
    }
     return null;
  }

/*
Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
*/
public  Electrodomesticos cerarElectrodomestico(){
    Scanner l = new Scanner(System.in);
    double precio = 1000;
    String color;
    char consumoEnergetico;
    double peso;
    
    System.out.println("Ingrese el color del electrodomestico: ");
    color = l.nextLine();
    System.out.println("Ingrese el consumo enrgetico: ");
    consumoEnergetico = l.nextLine().charAt(0);
     System.out.println("Ingrese el peso : ");
     peso = l.nextDouble();
     
     Electrodomesticos  electro = new Electrodomesticos ( color,  precio,  consumoEnergetico,  peso);
     return electro;
     
}
/*
Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
*/
public double precioFinal(){
    double precio = this.precio;
    
    switch(consumoEnergetico){
        case 'A':
            precio +=1000;
            break;
        case'B':
            precio += 800;
            break;
         case'C':
             precio += 600;
             break;
          case'D':
              precio+= 500;
              break;
          case 'E':
              precio += 300;
           case'F':
               precio+=100;
               break;
    }
    if(peso >= 1 || peso <= 19){
        precio += 100;
    }else if(peso >= 19 || peso <= 49){
        precio +=500;
    }else if( peso >= 49 || peso <=79){
        precio += 800;
    }else if(peso > 50){
        precio += 1000;
    }
    return precio;
}

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
*/

 class Lavadora extends Electrodomesticos{
  protected double carga;
   
  public Lavadora(){
      
  }
  public Lavadora(double carga,String color, double precio, char consumoEnergetico, double peso){
      super(color,precio,consumoEnergetico,peso);
      this.carga = 0;
  }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
  
      /*
  Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
  */
 
    public void crearLavadora(){
        Scanner l= new Scanner(System.in);
       super.cerarElectrodomestico();
        System.out.println("Ingrese la canridad de agua a ingresar: ");
        this.carga = 0;
        
    }
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
    */
  @Override
    public double precioFinal(){
       double precio = super.precioFinal();
        if(carga > 30){
            precio =+ 500;
        }
     
     return precio;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

  

   
 
 }

    class Televisor extends Electrodomesticos{
         protected double resolucion;
         protected boolean TDT;
        public void Televisor(){
            
        }
        public void Televisor(double resolucion, boolean TDT,String color, double precio, char consumoEnergetico, double peso){
            super.cerarElectrodomestico();
           this.resolucion = resolucion;
           this.TDT = TDT;
            
        }

            public double getResolucion() {
                return resolucion;
            }

            public void setResolucion(double resolucion) {
                this.resolucion = resolucion;
            }

            public boolean isTDT() {
                return TDT;
            }

            public void setTDT(boolean TDT) {
                this.TDT = TDT;
            }
            
        
    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
    */
    public void crearTelevisor(){
        Scanner l = new Scanner(System.in);
        super.cerarElectrodomestico();
        System.out.println("Ingrese la resolucion ");
        resolucion = l.nextDouble();
        System.out.println("Quiere sintinizador TDT incluido? ");
        TDT = l.nextBoolean();
    }    
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
    */
   public double precioFinal() {
    double precio = super.precioFinal(); // Obtenemos el precio base heredado de Electrodomestico
    if (resolucion > 40) {
        precio *= 1.3; // Incrementamos el precio en un 30%
    }
    if (TDT) {
        precio += 500; // Añadimos $500 por el sintonizador TDT incorporado
    }
    return precio;
}

    
    }

