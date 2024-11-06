package org.example.herencia;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");

        // una clase race ->
        // uqe al crearla cree un peloton de vehiculo
        //publi void start() -> todos los vehiculos del peloton aceleren a la vez
        Race peloton = new Race();
        peloton.start();
    }

}
