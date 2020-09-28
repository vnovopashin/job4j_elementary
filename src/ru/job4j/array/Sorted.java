package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean res = false;
        for (int i = 1; i < array.length; i++) {
            res = array[i] >= array[i - 1];
        }
        return res;
    }
}
