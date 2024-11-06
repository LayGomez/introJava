package org.example.herencia;

public class Moto extends Vehiculo{

    public Moto(String marca) {
        super(marca);
        this.ruedas = 2;
    }

    @Override
    public String toString() {
        return "Moto - Marca: " + getMarca()+ ", Velocidad: " + getVelocity() + "km/h";
    }

    @Override
    public void acelerar() {
        this.velocity += 30;
        System.out.println(getMarca() + " está acelerando.");
    }
}
