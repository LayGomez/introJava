package org.example.basics;

public class Conditionals {
    public static void main(String[] args) {
        boolean isActive = true;
        // imprimir el usuario esta activo si está activo
        if (isActive) {
            System.out.println("The user is active");
        } else {
            System.out.println("The user is not active");
        }
        // variable edad de un usuario con la minima memoria posible
        byte edad = 19;
        // Imprimir el usuario es mayor de edad si 18 o +
        // Imprimir el usuario es menor de edad si 17 o -

        if (edad >= 18) {
            System.out.println("El usuario es mayor de edad");
            return;
        }
        if (edad < 18) {
            System.out.println("El usuario es menor de edad");
        }
        //imprimir por consola los numeros de 5 a 10 usnado un for
        for (int i = 5; i < 11; i++) {
            System.out.println("Number: " + i);
        }
        // imprimir solamente números pares del 5 al 10
        for (int i = 5; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println("Es un número par: " + i);
            }
        }
    }

}
