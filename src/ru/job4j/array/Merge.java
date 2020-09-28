package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexL = 0;
        int indexR = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (indexL < left.length && (indexR >= right.length || left[indexL] < right[indexR])) {
                rsl[i] = left[indexL];
                indexL++;
            } else {
                rsl[i] = right[indexR];
                indexR++;
            }
        }
        return rsl;
    }
}
