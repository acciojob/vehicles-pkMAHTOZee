package com.driver;

public class Car extends Vehicle {
    private boolean currentGear;

    // Constructor
    public Car(String name, boolean currentGear) {
        super(name);
        this.currentGear = currentGear;
    }

    // Change Gear method
    public void changeGear(boolean newGear) {
        this.currentGear = newGear;
    }

    // Change Speed method
    public void changeSpeed(double newSpeed, double newDirection) {
        move(newSpeed, newDirection);
    }
}
