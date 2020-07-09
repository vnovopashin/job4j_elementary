package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double debt = (amount + amount * (percent / 100)) - salary;

        while (debt > 0) {
            debt = debt - salary;
            year++;
        }
        return year;
    }
}
