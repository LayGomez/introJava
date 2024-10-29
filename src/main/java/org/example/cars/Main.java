package org.example.cars;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car ("Opel", "Astra", 2005, 100000);
        Car car2 = new Car ("Mercedes", "Benz", 2010, 100000);
        Car car3 = new Car ("Seat", "Leon", 2015, 100000);

        Car[] cars = {car1, car2, car3};

        for (Car car : cars) {
            System.out.println(car.mostrarInformacion());
        }
        car1.conducir(200000);
        car2.conducir(300000);
        car3.conducir(50000);
        for (Car car : cars) {
            System.out.println(car.mostrarInformacion());
        }
    }
}
