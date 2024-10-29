package org.example.basics;

public class Arrays {
    public static void main(String[] args) {
        // Definir un array de 5 numeros (lleno)
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Un array de 5 nombres de ciudades (llenos)
        String[] cities = {"Valencia", "Paris", "Córdoba", "Budapest", "Buenos Aires" };
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
