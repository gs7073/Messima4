package com.example.messima4.Q1;

public class Electronics extends Product {
    private int battery;

    public Electronics(String name, double price, String description, int battery) {
        super(name, price, description);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " The battery percentage is: " + battery;
    }
}
