package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int sum = money - price;
        while (sum > 0) {
            for (int i = 0; i < COINS.length;) {
                sum = sum - COINS[i];
                if (sum < 0) {
                    sum = sum + COINS[i++];
                } else {
                    rsl[size++] = COINS[i];
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
