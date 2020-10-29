package ru.job4j.poly;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle airbus = new Aircraft();
        Vehicle boing = new Aircraft();
        Vehicle redArrow = new Train();
        Vehicle express = new Train();
        Vehicle schoolBus = new Autobus();
        Vehicle iсarus = new Autobus();
        Vehicle[] vehicles = {airbus, boing, redArrow, express, schoolBus, iсarus};
        for (Vehicle vehicle : vehicles) {
            vehicle.refuel();
            vehicle.move();
        }

    }
}
