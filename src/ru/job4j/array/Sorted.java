package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean res = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                res = false;
                break;
            }
        }
        return res;
    }
}
