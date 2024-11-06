package org.example.herencia;

public class Car extends Vehiculo {

    public Car(String marca) {
        super(marca);
        this.ruedas = 4;
    }

    @Override
    public String toString() {
        return "Car - Marca: " + getMarca() + ", Velocidad: " + getVelocity() + "km/h";
    }

    @Override
    public void acelerar() {
        this.velocity += 20;
        System.out.println(getMarca() + " está acelerando.");

    }

    @Override
    public void frenar() {
        this.velocity -= 10;
    }

}
