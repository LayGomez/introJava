package org.example.herencia;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Vehiculo> peloton;



    public Race() {
        this.peloton = new ArrayList<>();
        this.peloton.add(new Camion("Toyota"));
        this.peloton.add(new Car("Volvo"));
        this.peloton.add(new Moto("Yamaha"));
    }

    public void start(){
        for (Vehiculo vehiculo : peloton){
            vehiculo.acelerar();
            System.out.println(vehiculo);
        }
    }
}
