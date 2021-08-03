package com.company.number4;

public class Number4 {
    static class CustomThread extends Thread {
        @Override
        public void run() {
            System.out.println(this.getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void testStuff(){
        for(int i = 0; i < 10; i++) {
            new CustomThread().start();
            new CustomThread().start();
            new CustomThread().start();
        }
    }
}
