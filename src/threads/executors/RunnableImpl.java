package threads.executors;

import java.util.Date;
import java.util.List;

public class RunnableImpl implements Runnable {
    private List<String> list;
    private final static int NUM_OF_ITERATIONS = 5;

    public RunnableImpl(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i=0; i<NUM_OF_ITERATIONS; i++){
            list.add("thread name: " + Thread.currentThread().getName() + " time: " + new Date().toLocaleString());
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(("thread name: " + Thread.currentThread().getName() + " iteration: " + i));
        }
        System.out.println("thread ended its work");
    }
}
