package com.nicola;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car1 = new Car("BMW",35000,EngineType.HYBRID);
        Car car2 = new Car("Ford",30000,EngineType.DIESEL);
        Dealership deal1 = new Dealership("Bisson",10);

        System.out.println(deal1.countCars());
        deal1.addCar(car1);
        deal1.addCar(car2);
        System.out.println(deal1.countCars());
    }
}
