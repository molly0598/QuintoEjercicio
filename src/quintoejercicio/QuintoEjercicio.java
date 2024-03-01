/*
 * Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud de la circunferencia.
 */
package quintoejercicio;

import java.util.Scanner;

public class QuintoEjercicio {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Definiendo la variable para asignarle el valor que ingresa el usuario
        double radio, area, longitud;

        // Entrada de datos
        System.out.print("Ingrese el radio del círculo: ");
        radio = scanner.nextDouble();

        // calculando el área y la longitud del círculo
        area = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;

        // Imprimiendo los resultdos del area y lolngitud
        System.out.println("Cuando el radio de un circulo es: " + radio + " El área es: " + area + " y La longitud de la circunferencia es: " + longitud);
        
        
    }
    
}
