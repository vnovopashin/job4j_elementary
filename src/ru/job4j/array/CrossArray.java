package ru.job4j.array;

import java.util.HashMap;
import java.util.Map;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < left.length; i++) {
            map.put(left[i], 0);
        }
        for (int i = 0; i < right.length; i++) {
            map.put(right[i], map.containsKey(right[i]) ? 1 : 0);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
