
package redondear;

import java.util.Scanner;

public class Redondear {
    public static void main (String [] args){
        double decimal1;
        float decimal2;
        
        long redondeo1;
        int redondeo2;
        
        Scanner lectura = new Scanner (System.in);
        
        System.out.println(" Hola ingresa un numero decimal a redondear: ");
        decimal1 = lectura.nextDouble();
        
        System.out.println(" Hola guarda un decimal float para redondearlo: ");
        decimal2 = lectura.nextFloat();
        
        redondeo1 = Math.round(decimal1);
        
        redondeo2 = Math.round(decimal2);
        
        System.out.println(" Si redondeamos el "+decimal1+ " el resultado seria: "+redondeo1);
        
        System.out.println(" cuando redondeamos el "+decimal2+ " el resultado seria: "+redondeo2);
    }
}
