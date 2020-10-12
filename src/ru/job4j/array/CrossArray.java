package ru.job4j.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < left.length; i++) {
           Integer count = map.get(left[i]);
           map.put(left[i], count == null ? 1 : count + 1);
        }
        for (int i = 0; i < right.length; i++) {
            Integer count = map.get(right[i]);
            map.put(right[i], count == null ? 1 : count + 1);
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
        Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() == 1) {
                iterator.remove();
            } else {
                System.out.println(entry.getKey());
            }
        }
    }
}
