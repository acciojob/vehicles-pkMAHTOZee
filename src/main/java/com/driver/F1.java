package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "Race Car", 1); // Using arbitrary values for parameters not mentioned
    }

    public void accelerate(int rate) {
        int newSpeed = (int) (getCurrentSpeed() + rate);

        // Speed and gear conditions
        if (newSpeed == 0) {
            stop();
        } else if (newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        // Change the speed if it's greater than 0
        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
