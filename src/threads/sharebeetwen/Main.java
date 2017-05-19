package threads.sharebeetwen;

import java.util.ArrayList;

public class Main {
    private static final int NUM_OF_THREADS = 2;

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < NUM_OF_THREADS; i++){
            Thread thread = new Thread(new AddingThread(integers));
            thread.start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
