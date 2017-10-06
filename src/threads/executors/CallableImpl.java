package threads.executors;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<String> {
    private final static int NUM_OF_WORDS = 5;

    @Override
    public String call() throws Exception {
        String result ="Thread number: " + Thread.currentThread().getId() + " ";
        for (int i = 0; i < NUM_OF_WORDS; i++) {
            result += "___" + i;
            Thread.sleep((int)Math.random()*100);
        }
        return result;
    }
}
