package org.example.basics;

public class Main {
    public static void main(String[] args) {
        // escribir un boolean, asignarlo y mostrar por consola.
        boolean isActive = true;
        System.out.println(isActive);
        // numeros enteros
        byte enterByte = 100;
        short enterShort = 32767;
        int enterBit = 1000000;
        long enterLong = 10000000;

        System.out.println(enterByte);
        System.out.println(enterShort);
        System.out.println(enterBit);
        System.out.println(enterLong);

        // punto flotante
        float puntoFloat = 19.99F;
        double puntoDouble = 32.64;
        System.out.println(puntoFloat);
        System.out.println(puntoDouble);

        // Caracter
        char palabra = 'H';
        System.out.println(palabra);

        String name = "Layla";
        System.out.println("Hola, soy " + name);


    }
}