package org.example.herencia;

public class Camion extends Vehiculo {
    public Camion(String marca) {
        super(marca);
        this.ruedas = 4;
    }

    @Override
    public String toString() {
        return "Camion - Marca: " + getMarca() + ", Velocidad: " + getVelocity() + "km/h";
    }

    @Override
    public void acelerar() {
        this.velocity = 60;
        System.out.println(getMarca() + " está acelerando.");
    }

    @Override
    public void frenar() {
        this.velocity = 10;
    }
}
