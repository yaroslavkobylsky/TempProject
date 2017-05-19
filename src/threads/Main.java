package threads;

public class Main {

    public static void main(String[] args) {
        String field = "Hello";
        Thread thread1 = new Thread(new MyThread1(field));
        Thread thread2 = new Thread(new MyThread2(field));

        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();

    }


}
