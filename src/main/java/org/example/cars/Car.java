package org.example.cars;

public class Car {
    private String marca;
    private String model;
    private int age;
    private double km;

    public Car(String marca, String model, int age, double km){
        this.marca = marca;
        this.model= model;
        this.age = age;
        this.km = km;
    }

    public double conducir(double km) {
        this.km += km;
        return km;
    }
    public String mostrarInformacion() {
        return marca + " " + model + " " + age + " " + km;}

}
