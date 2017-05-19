package threads.sharebeetwen;

import java.util.ArrayList;
import java.util.Arrays;

public class AddingThread implements Runnable {
    private ArrayList<Integer> integers;

    public AddingThread(ArrayList<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public void run() {
        while (true){
            synchronized (integers){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread with id: " + Thread.currentThread().getId());
                integers.add((int) Thread.currentThread().getId());
                System.out.println(Arrays.toString(integers.toArray()));
                System.out.println();
                try {
                    integers.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                integers.notify();
            }
        }
    }
}
