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
        //Этот цикл удаляет из HashMap уникальные элементы,
        // т.е. те которые встретились один раз, оставляя только совпадения и их количество
      /*  Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
        Map.Entry<Integer, Integer> ent = it.next();
         if (ent.getValue() == 1) {
            it.remove();
         }
        }*/

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {     //если раскомментировать код вверху проверка теряет смысл, просто печатаем.
                System.out.println(entry.getKey());
            }
        }
    }
}
