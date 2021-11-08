
package clase1;

import java.util.Scanner;

public class Clase1 {
    
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese los siguientes datos por favor, sin tildes ni '\u00f1' (enies) :");
        System.out.println("Ingrese su nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        String edad = entrada.nextLine();
        System.out.println("Ingrese su hobbie:");
        String hobbie = entrada.nextLine();
        System.out.println("Ingrese su editor de c\u00f3digo preferido:");
        String edc = entrada.nextLine();
        System.out.println("Ingrese su sistema operativo actual:");
        String so = entrada.nextLine();
        System.out.println(".......................................................................");
        System.out.println("Gracias por introducir sus datos, corrob\u00f3relos:");
        System.out.println("Nombre:"+ nombre);
        System.out.println("Apellido:"+ apellido);
        System.out.println("Edad:"+ edad);
        System.out.println("Hobbie:"+ hobbie);
        System.out.println("Editor de c\u00f3digo preferido:"+ edc);
        System.out.println("Sistema operativo utilizado:"+ so);
        System.out.println("Si los datos son correctos ya puede cerrar el programa. Muchas gracias.");
        
        
    }
    
}
