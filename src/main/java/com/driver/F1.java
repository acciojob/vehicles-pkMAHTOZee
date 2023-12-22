package com.driver;

public class F1 extends Car {
    // Constructor
    public F1(String name, boolean currentGear) {
        super(name, currentGear);
    }

    // Accelerate method
    public void accelerate(double rate) {
        this.currentSpeed += rate;
        // Logic to change gear accordingly (not provided in the task)
    }
}
