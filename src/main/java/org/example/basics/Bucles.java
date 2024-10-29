package org.example.basics;

public class Bucles {
    public static void main(String[] args) {
        for (int i = 5; i < 11; i++) {
            System.out.println("Number: " + i);
        }
        // imprimir solamente números pares del 5 al 10
        for (int i = 5; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println("Es un número par: " + i);
            }
        }
        // imprimir por consola los numeros impares de 5 a 10 usando un while
        int i = 5;
        while (i < 11 ){
            System.out.println(i);
            i++;
        }
    }
}
