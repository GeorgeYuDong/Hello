package com.algo.linersearch;

public class ArrayGenerator {
    private ArrayGenerator() {
    }

    public static Integer[] generatorOrderedArray(int n) {
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }
}
