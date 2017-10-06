package threads.executors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsTest {
    private static final int NUMBER_OF_THREADS = 5;
    private static final int NUMBER_OF_THREADS_IN_EXECUTOR = 2;
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());

        //----------------------------
        list.clear();
        System.out.println("Test single thread executor");
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i=0; i<NUMBER_OF_THREADS; i++){
            singleThreadExecutor.execute(new RunnableImpl(list));
        }
        singleThreadExecutor.shutdown();
        while(!singleThreadExecutor.isTerminated()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("result: " + Arrays.deepToString(list.toArray()));

        //-----------------------------------
        list.clear();
        System.out.println("Test fixed size thread executor");
        ExecutorService fixedSizeThreadExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS_IN_EXECUTOR);
        for (int i=0; i<NUMBER_OF_THREADS; i++){
            fixedSizeThreadExecutor.execute(new RunnableImpl(list));
        }
        fixedSizeThreadExecutor.shutdown();
        while(!fixedSizeThreadExecutor.isTerminated()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("result: " + Arrays.toString(list.toArray()));

        //-----------------------------------
        list.clear();
        System.out.println("Test cashed thread executor");
        ExecutorService cashedThreadExecutor = Executors.newCachedThreadPool();
        for (int i=0; i<NUMBER_OF_THREADS; i++){
            cashedThreadExecutor.execute(new RunnableImpl(list));
        }
        cashedThreadExecutor.shutdown();
        while(!cashedThreadExecutor.isTerminated()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("result: " + Arrays.toString(list.toArray()));
    }
}
