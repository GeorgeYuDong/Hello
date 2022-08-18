package com.thread;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello,world");

        new Thread(
                () ->
                {
                    for (int i = 0; i < 20; i++) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("abc, " + i);
                    }
                }
        ).start();

        var thread = new Thread(
                () ->
                {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(Thread.currentThread().getName() + ", china is the best country, " + i);
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        thread.start();

    }
}
