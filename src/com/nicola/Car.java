package com.nicola;

public class Car {
    private String brand;
    private int price;
    private EngineType engine;

    public Car(String brand, int price, EngineType engine) {
        this.brand = brand;
        this.price = price;
        this.engine = engine;
    }
    public Car(){
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public EngineType getEngine() {
        return engine;
    }

    public void setEngine(EngineType engine) {
        this.engine = engine;
    }
}
