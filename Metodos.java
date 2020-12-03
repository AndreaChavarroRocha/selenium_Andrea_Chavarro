package Clase3;

import javax.swing.*;

public class Metodos {

    // Ejercicio 1: Escribir un método que reciba un número y retorne su doble

    public static int dobleNumero (int num) {
        num=num*2;
        return num;
    }

    /* Ejercicio 2: Método que reciba un número entero e imprima en pantalla en caso de ser
    mayor a 20, “Es mayor a 20”. De lo contrario, imprimir “No es mayor a 20”.*/

    public static void mayora20 (int num20){
        if (num20>20){
            System.out.println("Es mayor a 20");
        }else {
            System.out.println("No es mayor a 20");
        }
    }

    /* Ejercicio 2: Método que reciba un número entero e imprima en pantalla en caso de ser
    mayor a 20, “Es mayor a 20”. De lo contrario, imprimir “No es mayor a 20”.*/

    public static void mayora20JOption (int num20){
        if (num20>20){
            JOptionPane.showMessageDialog(null,"Es mayor a 20","Ejercicio 2",JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"No es mayor a 20","Ejercicio 2",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /* Ejercicio 3: Método que reciba dos enteros y retorne la multiplicación de la misma*/

    public static int multiplicacion (int a, int b){
        int multi=a*b;
        return multi;
    }

    /* Ejercicio 3: Método que reciba dos enteros y retorne la multiplicación de la misma*/

    public static int multiplicacion_JOption (int a, int b){
        int multi=a*b;
        return multi;
    }

}
