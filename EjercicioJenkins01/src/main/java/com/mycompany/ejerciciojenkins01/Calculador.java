
package com.mycompany.ejerciciojenkins01;

/**
 *
 * @author ajruiz
 */
public class Calculador {
    
     public double sum(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return num1 / num2;
    }
    
}
