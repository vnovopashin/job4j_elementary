package ru.job4j.poly;

public class Aircraft implements Vehicle {
    @Override
    public void move() {
        System.out.println("Я летаю по воздуху");
    }

    @Override
    public void refuel() {
        System.out.println("Самолет заправлен");
    }
}
