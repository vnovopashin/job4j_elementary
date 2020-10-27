package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("The bus goes");
    }

    @Override
    public void passengers(int count) {
        System.out.println(count + " passengers on the bus");
    }

    @Override
    public int fillUp(int fuelQuantity) {
        return fuelQuantity * 40;
    }
}
