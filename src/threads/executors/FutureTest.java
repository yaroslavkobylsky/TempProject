package threads.executors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {
    private static final int NUM_OF_THREADS = 5;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> futures = Collections.synchronizedList(new ArrayList<>()) ;
        for (int i = 0; i <NUM_OF_THREADS ; i++) {
            futures.add(executorService.submit(new CallableImpl()));
        }

        for(Future<String> future : futures){
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            finally {
                executorService.shutdown();
            }
        }
    }
}
