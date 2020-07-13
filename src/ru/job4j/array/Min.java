package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
