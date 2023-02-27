package task.java.medium;

import java.util.AbstractMap;
import java.util.Map;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int strike = 1;
        int max = 0;
        Map.Entry<Integer, Integer> first = new AbstractMap.SimpleEntry<>(fruits[0], 1);
        Map.Entry<Integer, Integer> second = new AbstractMap.SimpleEntry<>(-1, 1);

        for (int index = 1; index < fruits.length; index++) {

            if (first.getKey() == fruits[index]) {
                first.setValue(first.getValue() + 1);
            } else if (second.getKey() == fruits[index]) {
                second.setValue(second.getValue() + 1);
            } else {
                max = Math.max(max, first.getValue() + second.getValue());
                first = new AbstractMap.SimpleEntry<>(fruits[index - 1], strike);
                second = new AbstractMap.SimpleEntry<>(fruits[index], 1);
            }

            if (fruits[index] != fruits[index - 1]) strike = 1;
            else strike++;
        }

        return Math.max(max, first.getValue() + second.getValue());
    }
}

/*

// solved but speed O(n)

    public int totalFruit(int[] fruits) {

        int[] cache = new int[fruits.length];

        for (int i = 0; i < fruits.length; i++) {
            cache[i] = getMoreFruits(fruits, i);
        }

        int max = cache[0];
        for (int i = 1; i < cache.length; i++) {
            if (max < cache[i]) {
                max = cache[i];
            }
        }
        return max;
    }

    private int getMoreFruits(int[] fruits, int nTree) {
        int firstTreeType = fruits[nTree];
        int secondTreeType = 0; // for compiler
        int fruitsQuantity = 0;

        int j = nTree;
        while (j < fruits.length) {
            if (fruits[j] != firstTreeType) {
                secondTreeType = fruits[j];
                break;
            }
            j++;
        }



        for (int i = nTree; i < fruits.length && (fruits[i] == firstTreeType || fruits[i] == secondTreeType); i++) {
            if (fruits[i] == firstTreeType) {
                fruitsQuantity++;
            } else if (fruits[i] == secondTreeType) {
                fruitsQuantity++;
            }
        }
        return fruitsQuantity;
    }

 */