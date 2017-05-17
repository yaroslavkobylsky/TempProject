/**
 * Created by Admin on 29.04.16.
 */
public class LambdaTest {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println("hello!");
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("annon hello!");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread2 = new Thread(runnable2);
        thread2.start();

    }
}
