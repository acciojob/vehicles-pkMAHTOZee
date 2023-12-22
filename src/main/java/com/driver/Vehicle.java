package com.driver;

public class Vehicle {
    protected String name;
    protected double currentSpeed;
    protected double currentDirection;

    // Constructor
    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    // Move method
    public void move(double speed, double direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
    }

    // Steer method
    public void steer(double direction) {
        this.currentDirection += direction;
    }

    // Stop method
    public void stop() {
        this.currentSpeed = 0;
    }
}
