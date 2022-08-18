package com.algo.linersearch;

import com.algo.Student;

public class LinerSearch<E> {

    //别的class不能new LineSearch()
    private LinerSearch() {
    }

    //用静态方法, 泛型方法<E>
    public static <E> int linerSearch(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            //if (target == data[i]) {
            //equals方法需要在自己定义的类中实现
            //equals方法Integer,String等Java自己实现
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] array = {11, 22, 33, 44, 55};
        int res = linerSearch(array, 33);
        System.out.println(res);

        String s = "aa"; //常量是唯一的,所以相等
        String s1 = "aa";
        System.out.println(s.equals(s1));

        res = linerSearch(array, 34);
        System.out.println(res);

        Student[] studentArray = {new Student(11), new Student(21)};
        Student student = new Student(21);
        res = linerSearch(studentArray, student);
        System.out.println(res);

        //算法性能测试
        int[] dataSize = {100000, 1000000};
        for (int n :
                dataSize) {
            Integer[] data = ArrayGenerator.generatorOrderedArray(n);
            var startTime = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                linerSearch(data, n);
            }
            var endTime = System.nanoTime();
            var time = (endTime - startTime) / 1000000000.0;
            System.out.println(time);
        }
    }
}
