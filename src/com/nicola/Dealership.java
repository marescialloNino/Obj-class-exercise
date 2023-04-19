package com.nicola;

public class Dealership {
    private String name;
    private int capacity;
    private Car[] cars;

    public Dealership(String name,int capacity){
        this.name = name;
        this.capacity = capacity;
        this.cars = new Car[capacity];
    }

    public int countCars(){
        int count = 0;
        for (Car car:cars){
            if (car != null){
                count++;
            }
        }
        return count;
    }

    public void addCar(Car car){
        int indexLastCar = this.countCars() - 1;
        cars[indexLastCar + 1] = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
}
