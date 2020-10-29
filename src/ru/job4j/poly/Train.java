package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Я езжу по рельсам");
    }

    @Override
    public void refuel() {
        System.out.println("Поезд заправлен");
    }
}
