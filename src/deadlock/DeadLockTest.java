package deadlock;

public class DeadLockTest {
    public static String RESOURCE_1 = "resource1";
    public static String RESOURCE_2 = "resource2";

    private static class MyThread1 extends Thread{
        @Override
        public void run() {
            synchronized (RESOURCE_1){
                System.out.println("thread 1: holding resource 1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread 1: waiting for resource 2");
                synchronized (RESOURCE_2){
                    System.out.println("thread 1: holding resource 2");
                }
            }
        }
    }

    private static class MyThread2 extends Thread{
        @Override
        public void run() {
            synchronized (RESOURCE_2){
                System.out.println("thread 2: holding resource 2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread 2: waiting for resource 1");
                synchronized (RESOURCE_1){
                    System.out.println("thread 2: holding resource 1");
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread1();
        Thread thread2 = new MyThread2();
        thread1.start();
        thread2.start();

    }
}
