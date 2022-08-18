package com.algo.sortselection;

import java.util.Arrays;

public class SelectionSort {
    private SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            //minIndex = i;
            //[i, minIndex],这里的i是常量, minIndex是确定的, (j,n)不确定minIndex,维持确定性，就是循环不变量
            //minIndex是扩展的
            for (int j = i; j < arr.length; j++) {
                if ((j != i) && (arr[j].compareTo(arr[minIndex]) < 0)) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(arr, minIndex, i);
            }
        }
    }

    private static <E> void swap(E[] arr, int minIndex, int i) {
        E temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {10001, 2200, 3333, 414, 55, 211, 1112, 119};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
