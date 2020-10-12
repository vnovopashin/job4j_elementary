package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean result = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
