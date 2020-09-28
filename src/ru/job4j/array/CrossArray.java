package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int l : left) {
            for (int r : right) {
                if (l == r) {
                    System.out.println(l);
                }
            }
        }
    }
}
