package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = 10 > 9; /* first больше second? */
                System.out.println(result);

        result = 10 < 9; /* first меньше second? */
                System.out.println(result);

        result = 10 == 9; /* first равна second? */
                System.out.println(result);
    }
}