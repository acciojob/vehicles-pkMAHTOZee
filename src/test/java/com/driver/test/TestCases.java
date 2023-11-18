package com.driver.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

    @Test
    public void testVehicleSteer() {
        Vehicle vehicle = new Vehicle("Test Vehicle");
        vehicle.steer(45);
        assertEquals(45, vehicle.getCurrentDirection());
    }

    @Test
    public void testVehicleMove() {
        Vehicle vehicle = new Vehicle("Test Vehicle");
        vehicle.move(50, 90);
        assertEquals(50, vehicle.getCurrentSpeed());
        assertEquals(90, vehicle.getCurrentDirection());
    }

    @Test
    public void testVehicleStop() {
        Vehicle vehicle = new Vehicle("Test Vehicle");
        vehicle.move(50, 90);
        vehicle.stop();
        assertEquals(0, vehicle.getCurrentSpeed());
    }

    @Test
    public void testCarChangeGear() {
        Car car = new Car("Test Car", 4, 4, 6, true, "Sedan", 5);
        car.changeGear(3);
        assertEquals(3, car.getCurrentGear());
    }

    @Test
    public void testCarChangeSpeed() {
        Car car = new Car("Test Car", 4, 4, 6, true, "Sedan", 5);
        car.changeSpeed(60, 180);
        assertEquals(60, car.getCurrentSpeed());
        assertEquals(180, car.getCurrentDirection());
    }

    @Test
    public void testF1Accelerate() {
        F1 f1 = new F1("Test F1", false);
        f1.accelerate(20);
        assertEquals(20, f1.getCurrentSpeed());
        assertEquals(1, f1.getCurrentGear()); // Assuming starting gear is 1
    }

    @Test
    public void testBoatGetVehicleName() {
        Boat boat = new Boat("Test Boat", 10);
        assertEquals("Test Boat", boat.getVehicleName());
    }

    @Test
    public void testBoatGetVehicleCapacity() {
        Boat boat = new Boat("Test Boat", 10);
        assertEquals(10, boat.getVehicleCapacity());
    }
}

