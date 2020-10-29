package ru.job4j.poly;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Я езжу по дороге");
    }

    @Override
    public void refuel() {
        System.out.println("Автобус заправлен");
    }
}
