package com.company.number5;

import java.util.ArrayList;

public class Number5 {
    class MyThread extends Thread {
        int arrayPart;

        public MyThread(int arrayPart) {
            this.arrayPart = arrayPart;
        }

        @Override
        public void run() {
            int quarter = (int) Math.floor(integers.size() / 4);
            int index = quarter * arrayPart;
            int sum = 0;
            for (int i = 0; i < index; i++) {
                sum = sum + integers.get(i);
            }
            finalSum = finalSum + sum;
        }
    }

    ArrayList<Integer> integers = new ArrayList<>();
    int finalSum;

    public void calculate() {
        new MyThread(1).start();
        new MyThread(2).start();
        new MyThread(3).start();
        new MyThread(4).start();
        System.out.println(finalSum);

    }
}
